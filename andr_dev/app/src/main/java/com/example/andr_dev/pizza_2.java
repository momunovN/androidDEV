package com.example.andr_dev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pizza_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pizza2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.pizza_2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Находим ImageView с id "home2"
        ImageView homeImageView = findViewById(R.id.home2); // Предположим, что у вас есть id "home2" в XML

        // Устанавливаем обработчик клика
        homeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаем Intent для перехода на активити Recipes
                Intent intent = new Intent(pizza_2.this, Recipes.class);
                startActivity(intent);
            }
        });
    }
}