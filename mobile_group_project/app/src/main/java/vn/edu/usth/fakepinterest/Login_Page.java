package vn.edu.usth.fakepinterest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Page extends AppCompatActivity {
    private Button continue_button;
    private Button continue_fb_button;
    private Button continue_gg_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_page);

//      ----Cho nay dang bi loi nen de cmt----

//        continue_button.findViewById(R.id.continue_button);
//        continue_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Login_Page.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}