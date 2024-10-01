package com.example.my_tesk_3_4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//public class SearchActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_search);
//
//        Button searchButton = findViewById(R.id.search_button);
//        searchButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Perform search logic here
//                Intent intent = new Intent(SearchActivity.this, ResultsActivity.class);
//                startActivity(intent);
//            }
//
//            private void startActivity(Intent intent) {
//            }
//        });
//    }
//}

public class SearchActivity extends AppCompatActivity {

    private EditText searchEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchEditText = findViewById(R.id.search_edit_text);

        Button searchButton = findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchQuery = searchEditText.getText().toString();
                if (!searchQuery.isEmpty()) {
                    Intent intent = new Intent(SearchActivity.this, ResultsActivity.class);
                    intent.putExtra("search_query", searchQuery);
                    startActivity(intent);
                } else {
                    Toast.makeText(SearchActivity.this, "Please enter a search query", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void startActivity(Intent intent) {

    }
}