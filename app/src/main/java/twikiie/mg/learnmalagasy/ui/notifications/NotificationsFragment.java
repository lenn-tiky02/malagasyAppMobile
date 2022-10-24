package twikiie.mg.learnmalagasy.ui.notifications;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import twikiie.mg.learnmalagasy.adapters.AlphabetItemAdapter;
import twikiie.mg.learnmalagasy.adapters.CalendarItemAdapter;
import twikiie.mg.learnmalagasy.databinding.FragmentNotificationsBinding;
import twikiie.mg.learnmalagasy.models.AlphabetItem;
import twikiie.mg.learnmalagasy.models.CalendarItem;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        List<CalendarItem> listeCalendar = new ArrayList<CalendarItem>();
        listeCalendar.add(new CalendarItem("Janoary", "Janvier"));
        listeCalendar.add(new CalendarItem("Febroary", "Février"));
        listeCalendar.add(new CalendarItem("Martsa", "Mars"));
        listeCalendar.add(new CalendarItem("Aprily", "Avril"));
        listeCalendar.add(new CalendarItem("May", "Mai"));
        listeCalendar.add(new CalendarItem("Jona", "Juin"));
        listeCalendar.add(new CalendarItem("Jolay", "Juillet"));
        listeCalendar.add(new CalendarItem("Aogositra", "Août"));
        listeCalendar.add(new CalendarItem("Septambra", "Septembre"));
        listeCalendar.add(new CalendarItem("Oktobra", "Octobre"));
        listeCalendar.add(new CalendarItem("Novambra", "Novembre"));
        listeCalendar.add(new CalendarItem("Desambra", "Décembre"));

        listeCalendar.add(new CalendarItem("alatsinainy", "Lundi"));
        listeCalendar.add(new CalendarItem("talata", "Mardi"));
        listeCalendar.add(new CalendarItem("alarobia", "Mercredi"));
        listeCalendar.add(new CalendarItem("alakamisy", "Jeudi"));
        listeCalendar.add(new CalendarItem("zoma", "Vendredi"));
        listeCalendar.add(new CalendarItem("asabotsy", "Samedi"));
        listeCalendar.add(new CalendarItem("alahady", "Dimanche"));

        ListView listView = binding.notifListView;
        listView.setAdapter(new CalendarItemAdapter(this.getContext(),listeCalendar));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = listeCalendar.get(i).getName();
                Toast.makeText(getContext(),name , Toast.LENGTH_SHORT).show();

                int resId = getContext().getResources().getIdentifier("raw_" + name.toLowerCase(Locale.ROOT), "raw", getContext().getPackageName());
                MediaPlayer mediaPlayer= MediaPlayer.create(getContext(),resId);
                mediaPlayer.start();
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