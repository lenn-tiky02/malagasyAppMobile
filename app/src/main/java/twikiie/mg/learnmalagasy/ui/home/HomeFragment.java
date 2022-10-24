package twikiie.mg.learnmalagasy.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;

import twikiie.mg.learnmalagasy.R;
import twikiie.mg.learnmalagasy.adapters.HomeItemAdapter;
import twikiie.mg.learnmalagasy.databinding.FragmentHomeBinding;
import twikiie.mg.learnmalagasy.models.HomeItem;
import twikiie.mg.learnmalagasy.ui.home.homeFragments.LessonListFragment;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       /* HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
*/
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        List<HomeItem> homeItemList = new ArrayList<HomeItem>();
        homeItemList.add(new HomeItem(0,"Salutations","item_salutations_icon"));
        homeItemList.add(new HomeItem(1,"Introductions","item_introduction_icon"));
        homeItemList.add(new HomeItem(2,"Phrases fréquentes","item_faq_icon"));
        homeItemList.add(new HomeItem(3,"Directions","item_directions_icon"));
        homeItemList.add(new HomeItem(4,"Météo","item_weather_icon"));
        homeItemList.add(new HomeItem(5,"Docteur","item_docteur_icon"));
        homeItemList.add(new HomeItem(6,"Marché","item_market_icon"));
        homeItemList.add(new HomeItem(7,"Animaux","item_animaux_icon"));
        homeItemList.add(new HomeItem(8,"Couleurs","item_couleurs_icon"));
        homeItemList.add(new HomeItem(9,"Restaurants","item_restaurants_icon"));
        homeItemList.add(new HomeItem(10,"Transports","item_transports_icon"));
        homeItemList.add(new HomeItem(11,"Travail","item_travail_icon"));
        homeItemList.add(new HomeItem(12,"Emotions","item_emotions_icon"));

        //get ListView
        GridView homeGridView = binding.homeListView;
        homeGridView.setAdapter(new HomeItemAdapter(this.getContext(),homeItemList));
        homeGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fragment detail = new LessonListFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("category", i);
                detail.setArguments(bundle);
                FragmentManager fragmentManager = getParentFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment_activity_main, detail).commit();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}