package twikiie.mg.learnmalagasy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import twikiie.mg.learnmalagasy.R;
import twikiie.mg.learnmalagasy.models.HomeItem;
import twikiie.mg.learnmalagasy.ui.home.HomeFragment;

public class HomeItemAdapter extends BaseAdapter {
    //fields
    private Context context;
    private List<HomeItem> homeItemList;
    private LayoutInflater inflater;

    public HomeItemAdapter(Context context, List<HomeItem> homeItemList) {
        this.context = context;
        this.homeItemList = homeItemList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return homeItemList.size();
    }

    @Override
    public HomeItem getItem(int i) {
        return homeItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.adapter_item,null);

        //get info about item
        HomeItem currentItem = getItem(i);
        String itemName = currentItem.getItemName();
        String imageName = currentItem.getImageName();

        TextView itemNameView = view.findViewById(R.id.item_name);
        itemNameView.setText(itemName);

        ImageView itemImageView = view.findViewById((R.id.item_icon));
        int resId = context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
        itemImageView.setImageResource(resId);


        return view;
    }
}
