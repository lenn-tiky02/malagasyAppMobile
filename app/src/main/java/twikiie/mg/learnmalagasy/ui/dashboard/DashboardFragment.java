package twikiie.mg.learnmalagasy.ui.dashboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import twikiie.mg.learnmalagasy.R;
import twikiie.mg.learnmalagasy.adapters.AlphabetItemAdapter;
import twikiie.mg.learnmalagasy.adapters.HomeItemAdapter;
import twikiie.mg.learnmalagasy.databinding.FragmentDashboardBinding;
import twikiie.mg.learnmalagasy.models.AlphabetItem;
import twikiie.mg.learnmalagasy.models.HomeItem;
import twikiie.mg.learnmalagasy.ui.home.homeFragments.LessonListFragment;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        List<AlphabetItem> listeAlphabet = new ArrayList<AlphabetItem>();
        listeAlphabet.add(new AlphabetItem("A"));
        listeAlphabet.add(new AlphabetItem("B"));
        listeAlphabet.add(new AlphabetItem("D"));
        listeAlphabet.add(new AlphabetItem("E"));
        listeAlphabet.add(new AlphabetItem("F"));
        listeAlphabet.add(new AlphabetItem("G"));
        listeAlphabet.add(new AlphabetItem("H"));
        listeAlphabet.add(new AlphabetItem("I"));
        listeAlphabet.add(new AlphabetItem("J"));
        listeAlphabet.add(new AlphabetItem("K"));
        listeAlphabet.add(new AlphabetItem("L"));
        listeAlphabet.add(new AlphabetItem("M"));
        listeAlphabet.add(new AlphabetItem("N"));
        listeAlphabet.add(new AlphabetItem("O"));
        listeAlphabet.add(new AlphabetItem("P"));
        listeAlphabet.add(new AlphabetItem("R"));
        listeAlphabet.add(new AlphabetItem("S"));
        listeAlphabet.add(new AlphabetItem("T"));
        listeAlphabet.add(new AlphabetItem("V"));
        listeAlphabet.add(new AlphabetItem("Y"));
        listeAlphabet.add(new AlphabetItem("Z"));
        listeAlphabet.add(new AlphabetItem("1"));
        listeAlphabet.add(new AlphabetItem("2"));
        listeAlphabet.add(new AlphabetItem("3"));
        listeAlphabet.add(new AlphabetItem("4"));
        listeAlphabet.add(new AlphabetItem("5"));
        listeAlphabet.add(new AlphabetItem("6"));
        listeAlphabet.add(new AlphabetItem("7"));
        listeAlphabet.add(new AlphabetItem("8"));
        listeAlphabet.add(new AlphabetItem("9"));
        listeAlphabet.add(new AlphabetItem("10"));
        listeAlphabet.add(new AlphabetItem("11"));
        listeAlphabet.add(new AlphabetItem("12"));
        listeAlphabet.add(new AlphabetItem("13"));
        listeAlphabet.add(new AlphabetItem("14"));
        listeAlphabet.add(new AlphabetItem("15"));
        listeAlphabet.add(new AlphabetItem("16"));
        listeAlphabet.add(new AlphabetItem("17"));
        listeAlphabet.add(new AlphabetItem("18"));
        listeAlphabet.add(new AlphabetItem("19"));
        listeAlphabet.add(new AlphabetItem("20"));
        listeAlphabet.add(new AlphabetItem("30"));
        listeAlphabet.add(new AlphabetItem("40"));
        listeAlphabet.add(new AlphabetItem("50"));
        listeAlphabet.add(new AlphabetItem("60"));
        listeAlphabet.add(new AlphabetItem("70"));
        listeAlphabet.add(new AlphabetItem("80"));
        listeAlphabet.add(new AlphabetItem("90"));
        listeAlphabet.add(new AlphabetItem("100"));
        listeAlphabet.add(new AlphabetItem("1000"));
        listeAlphabet.add(new AlphabetItem("10000"));
        GridView alphabetGridView = binding.alphabetGridView;
        alphabetGridView.setAdapter(new AlphabetItemAdapter(this.getContext(),listeAlphabet));
        /*alphabetGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(),"listeAlphabet.get(i).getName()" , Toast.LENGTH_LONG).show();
            }
        });*/
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}