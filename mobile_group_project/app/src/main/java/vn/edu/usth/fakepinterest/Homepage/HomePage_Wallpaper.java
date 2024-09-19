package vn.edu.usth.fakepinterest.Homepage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import vn.edu.usth.fakepinterest.R;

public class HomePage_Wallpaper extends Fragment {
    private Button button_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_homepage_wallpaper, container, false);
            button_1 = view.findViewById(R.id.button_wallpaper_1);
            button_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Fragment clicked = new clicked_on_image();
                    FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                    fm.replace(R.id.main, clicked).commit();
                }
            });
        return view;
    }
}