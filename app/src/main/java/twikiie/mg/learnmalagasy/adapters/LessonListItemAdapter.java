package twikiie.mg.learnmalagasy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import twikiie.mg.learnmalagasy.R;
import twikiie.mg.learnmalagasy.models.CalendarItem;
import twikiie.mg.learnmalagasy.models.LessonListItem;

public class LessonListItemAdapter extends BaseAdapter {
    //fields
    private Context context;
    private List<LessonListItem> lessonListItemList;
    private LayoutInflater inflater;

    public LessonListItemAdapter(Context context, List<LessonListItem> lessonListItemList) {
        this.context = context;
        this.lessonListItemList = lessonListItemList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return lessonListItemList.size();
    }

    @Override
    public LessonListItem getItem(int i) {
        return lessonListItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.adapter_lessonlist_item,null);

        //get info about item
        LessonListItem currentItem = getItem(i);
        String itemName = currentItem.getName();
        String itemtrans = currentItem.getTranslation();

        TextView itemNameView = view.findViewById(R.id.text_view_letter_ll);
        itemNameView.setText(itemName);
        TextView itemNameView2 = view.findViewById(R.id.text_view_translation_ll);
        itemNameView2.setText(itemtrans);

        return view;
    }
}
