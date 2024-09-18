package vn.edu.usth.fakepinterest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {
    private Button button_2;
    private Button button_1;
    private Button button_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_search);


        // Continue button
        button_2 = findViewById(R.id.search_button_2);

        button_2.findViewById(R.id.continue_button);

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchEnd.class);
                startActivity(intent);
            }
        });

        // Continue facebook button
        button_1 = findViewById(R.id.search_button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchEnd.class);
                startActivity(intent);
            }
        });

        // Continue google button
        button_3 = findViewById(R.id.search_button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchEnd.class);
                startActivity(intent);
            }
        });
    }
}