package com.example.andr_dev; // Замените на ваш пакет

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.andr_dev.R;

public class SignUp extends AppCompatActivity { // Изменено имя класса на SignUp

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up); // Убедитесь, что ваш XML файл называется activity_sign_up.xml

        Button buttonContinue = findViewById(R.id.button_continue); // Измените на правильный ID
        TextView textLogin = findViewById(R.id.text_login); // Убедитесь, что у вас есть такой TextView в XML

        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ваш код для продолжения регистрации
            }
        });

        textLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, Login.class); // Изменено на правильное имя класса
                startActivity(intent);
            }
        });
    }
}