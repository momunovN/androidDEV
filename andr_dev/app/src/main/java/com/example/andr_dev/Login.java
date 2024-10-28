package com.example.andr_dev; // Замените на ваш пакет

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.andr_dev.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in); // Убедитесь, что ваш XML файл называется activity_log_in.xml

        Button buttonLogin = findViewById(R.id.button_login);
        TextView textSignUp = findViewById(R.id.text_sign_up); // Убедитесь, что у вас есть такой TextView в XML

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log_in(); // Ваш метод логина
            }
        });

        textSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, SignUp.class); // Измените на правильное имя класса
                startActivity(intent);
            }
        });
    }

    public void log_in() {
        EditText editTextEmail = findViewById(R.id.editText_email);
        EditText editTextPassword = findViewById(R.id.editText_password);

        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        // Простейшая валидация
        if (email.isEmpty()) {
            editTextEmail.setError("Введите email");
            editTextEmail.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            editTextPassword.setError("Введите пароль");
            editTextPassword.requestFocus();
            return;
        }


        // Здесь вы можете добавить свою логику аутентификации (например, проверка с базой данных)

        // Если аутентификация успешна, переходите к следующему Activity
        Intent intent = new Intent(Login.this, Recipes.class); // Замените на ваше имя Activity
        startActivity(intent);
        finish(); // Закрыть текущую активность, чтобы пользователь не мог вернуться назад
    }
}