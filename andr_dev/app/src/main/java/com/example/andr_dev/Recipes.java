package com.example.andr_dev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Recipes extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes); // Убедитесь, что у вас есть такой XML файл

        // Находим ImageView с id "book"
        ImageView bookImageView = findViewById(R.id.book); // Предположим, что у вас есть id "book" в XML

        // Устанавливаем обработчик клика
        bookImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаем Intent для перехода на активити pizza
                Intent intent = new Intent(Recipes.this, pizza.class);
                startActivity(intent);
            }
        });
    }
}