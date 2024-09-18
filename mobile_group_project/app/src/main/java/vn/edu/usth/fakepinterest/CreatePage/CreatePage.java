package vn.edu.usth.fakepinterest.CreatePage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

<<<<<<< HEAD:mobile_group_project/app/src/main/java/vn/edu/usth/fakepinterest/SearchPage.java
import androidx.appcompat.app.AppCompatActivity;

public class SearchPage extends AppCompatActivity {
    private Button button_2;
    private Button button_1;
    private Button button_3;
=======
import vn.edu.usth.fakepinterest.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CreatePage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CreatePage extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CreatePage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CreatePage.
     */
    // TODO: Rename and change types and number of parameters
    public static CreatePage newInstance(String param1, String param2) {
        CreatePage fragment = new CreatePage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
>>>>>>> ea059c11be75c5a35b179533c624efba227cb31c:mobile_group_project/app/src/main/java/vn/edu/usth/fakepinterest/CreatePage/CreatePage.java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

<<<<<<< HEAD:mobile_group_project/app/src/main/java/vn/edu/usth/fakepinterest/SearchPage.java
        setContentView(R.layout.fragment_search);


        // Continue button
        button_2 = findViewById(R.id.search_button_2);

        button_2.findViewById(R.id.continue_button);

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchPage.this, SearchEnd.class);
                startActivity(intent);
            }
        });

        // Continue facebook button
        button_1 = findViewById(R.id.search_button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchPage.this, SearchEnd.class);
                startActivity(intent);
            }
        });

        // Continue google button
        button_3 = findViewById(R.id.search_button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchPage.this, SearchEnd.class);
                startActivity(intent);
            }
        });
=======
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.bottomsheetlayout, container, false);
>>>>>>> ea059c11be75c5a35b179533c624efba227cb31c:mobile_group_project/app/src/main/java/vn/edu/usth/fakepinterest/CreatePage/CreatePage.java
    }
}