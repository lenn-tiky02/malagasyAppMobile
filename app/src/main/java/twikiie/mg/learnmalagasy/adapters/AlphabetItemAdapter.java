package twikiie.mg.learnmalagasy.adapters;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

import twikiie.mg.learnmalagasy.R;
import twikiie.mg.learnmalagasy.models.AlphabetItem;
import twikiie.mg.learnmalagasy.models.HomeItem;

public class AlphabetItemAdapter extends BaseAdapter {
    //fields
    private Context context;
    private List<AlphabetItem> alphabetItemList;
    private LayoutInflater inflater;

    public AlphabetItemAdapter(Context context, List<AlphabetItem> alphabetItemList) {
        this.context = context;
        this.alphabetItemList = alphabetItemList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return alphabetItemList.size();
    }

    @Override
    public AlphabetItem getItem(int i) {
        return alphabetItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.adapter_alphabet_item,null);

        //get info about item
        AlphabetItem currentItem = getItem(i);
        String itemName = currentItem.getName();

        Button itemNameView = view.findViewById(R.id.button_letter);
        itemNameView.setText(itemName);
        itemNameView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, itemName , Toast.LENGTH_SHORT).show();
                int resId = context.getResources().getIdentifier("raw_" + itemName.toLowerCase(Locale.ROOT), "raw", context.getPackageName());
                MediaPlayer mediaPlayer= MediaPlayer.create(context,resId);
                mediaPlayer.start();
            }
        });
        return view;
    }
}
