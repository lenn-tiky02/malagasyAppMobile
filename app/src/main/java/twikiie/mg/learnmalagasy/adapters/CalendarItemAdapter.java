package twikiie.mg.learnmalagasy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import twikiie.mg.learnmalagasy.R;
import twikiie.mg.learnmalagasy.models.AlphabetItem;
import twikiie.mg.learnmalagasy.models.CalendarItem;

public class CalendarItemAdapter extends BaseAdapter {
    //fields
    private Context context;
    private List<CalendarItem> calendarItemList;
    private LayoutInflater inflater;

    public CalendarItemAdapter(Context context, List<CalendarItem> calendarItemList) {
        this.context = context;
        this.calendarItemList = calendarItemList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return calendarItemList.size();
    }

    @Override
    public CalendarItem getItem(int i) {
        return calendarItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.adapter_calendar_item,null);

        //get info about item
        CalendarItem currentItem = getItem(i);
        String itemName = currentItem.getName();
        String itemtrans = currentItem.getTranslation();

        TextView itemNameView = view.findViewById(R.id.text_view_letter);
        itemNameView.setText(itemName);
        TextView itemNameView2 = view.findViewById(R.id.text_view_translation);
        itemNameView2.setText(itemtrans);

        return view;
    }
}
