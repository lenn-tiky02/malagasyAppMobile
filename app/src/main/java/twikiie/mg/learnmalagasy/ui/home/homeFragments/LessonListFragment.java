package twikiie.mg.learnmalagasy.ui.home.homeFragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import twikiie.mg.learnmalagasy.R;
import twikiie.mg.learnmalagasy.adapters.CalendarItemAdapter;
import twikiie.mg.learnmalagasy.adapters.LessonListItemAdapter;
import twikiie.mg.learnmalagasy.models.CalendarItem;
import twikiie.mg.learnmalagasy.models.LessonListItem;
import twikiie.mg.learnmalagasy.ui.home.HomeFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LessonListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LessonListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final int ARG_PARAM1 = 1;
    // TODO: Rename and change types of parameters
    private int mParam1;
    private String mParam2;

    public LessonListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment LessonListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LessonListFragment newInstance(int param1) {
        LessonListFragment fragment = new LessonListFragment();
        Bundle args = new Bundle();
        args.putInt(String.valueOf(ARG_PARAM1), param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(String.valueOf(ARG_PARAM1));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lesson_list, container, false);

        Button bouton = view.findViewById(R.id.button_return);
        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment detail = new HomeFragment();
                FragmentManager fragmentManager = getParentFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment_activity_main, detail).commit();
            }
        });


        List<LessonListItem> lessonItemList = new ArrayList<LessonListItem>();
        List<LessonListItem> lessonItemShow = new ArrayList<LessonListItem>();
        lessonItemList.add(new LessonListItem(0,"Manahoana ô!","Bonjour!","raw_0_1"));
        lessonItemList.add(new LessonListItem(0,"Salama ô!","Bonjour!","raw_0_2"));
        lessonItemList.add(new LessonListItem(0,"Inona ny vaovao?!","Quoi de neuf?","raw_0_3"));

        lessonItemList.add(new LessonListItem(1,"Ny anarako dia Rakoto!","Mon nom est Rakoto!","raw_1_1"));
        lessonItemList.add(new LessonListItem(1,"Faly mahafantatra anao!","Ravie de faire votre connaissance!","raw_1_2"));
        lessonItemList.add(new LessonListItem(1,"Firy taona ianao?","Tu as quel age?","raw_1_3"));
        lessonItemList.add(new LessonListItem(1,"Avy aiza ianao?","Tu viens d'où?","raw_1_4"));

        lessonItemList.add(new LessonListItem(2,"Eny","Oui","raw_2_1"));
        lessonItemList.add(new LessonListItem(2,"Tsia","Non","raw_2_2"));
        lessonItemList.add(new LessonListItem(2,"Mampalahelo anakahy","C'est triste","raw_2_3"));
        lessonItemList.add(new LessonListItem(2,"Tsara zany","C'est parfait","raw_2_4"));
        lessonItemList.add(new LessonListItem(2,"Aza mandainga","Ne ment pas","raw_2_5"));
        lessonItemList.add(new LessonListItem(2,"Ianao koa dia misahirana","Ne vous préoccupez pas","raw_2_6"));
        lessonItemList.add(new LessonListItem(2,"Oay hoa ry lala!","oh zut!","raw_2_7"));

        lessonItemList.add(new LessonListItem(3,"Ankavanana","droite","raw_3_1"));
        lessonItemList.add(new LessonListItem(3,"Ankavia","gauche","raw_3_2"));
        lessonItemList.add(new LessonListItem(3,"Ambony","en haut","raw_3_3"));
        lessonItemList.add(new LessonListItem(3,"Ambany","en bas","raw_3_4"));
        lessonItemList.add(new LessonListItem(3,"Miampità arabe","traverse la rue","raw_3_5"));

        lessonItemList.add(new LessonListItem(4,"Mangatsiaka","Froid","raw_4_1"));
        lessonItemList.add(new LessonListItem(4,"Mafana","Chaud","raw_4_2"));
        lessonItemList.add(new LessonListItem(4,"Manorana","Il pleut","raw_4_3"));
        lessonItemList.add(new LessonListItem(4,"Tsara be ny andro","Il fait beau","raw_4_4"));
        lessonItemList.add(new LessonListItem(4,"Ratsy ny andro","Mauvais temps","raw_4_5"));

        lessonItemList.add(new LessonListItem(5,"Inona no marary anao?","Qu'est-ce qui te fait mal?","raw_5_1"));
        lessonItemList.add(new LessonListItem(5,"Marary ny lohako","J'ai mal à la tête","raw_5_2"));
        lessonItemList.add(new LessonListItem(5,"Marary ny kiboko","J'ai mal au ventre","raw_5_3"));
        lessonItemList.add(new LessonListItem(5,"Marary ny tanako","J'ai mal aux mains","raw_5_4"));
        lessonItemList.add(new LessonListItem(5,"Marary ny tongoko","J'ai mal aux pieds","raw_5_5"));
        lessonItemList.add(new LessonListItem(5,"Reraka aho","Je suis fatigué","raw_5_6"));
        lessonItemList.add(new LessonListItem(5,"Fanafody","Médicaments","raw_5_7"));
        lessonItemList.add(new LessonListItem(5,"Tsindrona","Injection","raw_5_8"));
        lessonItemList.add(new LessonListItem(5,"Dokotera","Docteur","raw_5_9"));
        lessonItemList.add(new LessonListItem(5,"Hopitaly","Hôpital","raw_5_10"));


        lessonItemList.add(new LessonListItem(6,"Otrinona ity azafady?","C'est à combien?","raw_6_1"));
        lessonItemList.add(new LessonListItem(6,"Hanaovy iray amin'ity azafady","je vais prendre 1","raw_6_2"));
        lessonItemList.add(new LessonListItem(6,"Asio harona iray azafady!","je vais prendre 1 sac","raw_6_3"));
        lessonItemList.add(new LessonListItem(6,"Anaovy voatabia 3 ","3 tomates s'il vous plaît!","raw_6_4"));

        lessonItemList.add(new LessonListItem(7,"Alika","chien","raw_7_1"));
        lessonItemList.add(new LessonListItem(7,"Saka","chat","raw_7_2"));
        lessonItemList.add(new LessonListItem(7,"Akoho","poule","raw_7_3"));

        int i = getArguments().getInt("category");
        for (LessonListItem detail :lessonItemList) {
            if(detail.getCategory() == i){
                lessonItemShow.add(detail);
            }
        }
        ListView listView = view.findViewById(R.id.lesson_list_view);
        listView.setAdapter(new LessonListItemAdapter(this.getContext(),lessonItemShow));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int resId;
                String name = lessonItemShow.get(i).getFilename();

                resId = getContext().getResources().getIdentifier(name, "raw", getContext().getPackageName());

                MediaPlayer mediaPlayer= MediaPlayer.create(getContext(),resId);
                mediaPlayer.start();
            }
        });
        return view;
    }
}