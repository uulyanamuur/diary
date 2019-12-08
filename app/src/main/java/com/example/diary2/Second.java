package com.example.diary2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends Activity {

    private EditText username;
    private EditText password;
    private Button login;
    private TextView loginLocked;
    private TextView attempts;
    private TextView numberOfAttempts;

    // Число для подсчета попыток залогиниться:
    int numberOfRemainingLoginAttempts = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
    }

    public void Login(View view) {
        if (username.getText().toString().equals("ulyana") &&
                password.getText().toString().equals("ulyana")) {
            Toast.makeText(getApplicationContext(), "Вход выполнен!", Toast.LENGTH_SHORT).show();
            //Создаем переход:
            Intent intent = new Intent(Second.this, Raspisanie.class);
            //Запускаем его при нажатии:
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Неправильные данные!", Toast.LENGTH_SHORT).show();
            numberOfRemainingLoginAttempts--;
        }
        attempts.setVisibility(View.VISIBLE);
        numberOfAttempts.setVisibility(View.VISIBLE);
        numberOfAttempts.setText(Integer.toString(numberOfRemainingLoginAttempts));
        if (numberOfRemainingLoginAttempts == 0) {
            login.setEnabled(false);
            loginLocked.setVisibility(View.VISIBLE);
            loginLocked.setBackgroundColor(Color.RED);
            loginLocked.setText("Вход заблокирован!!!");

            Intent intent = new Intent(Second.this, Second.class);
            //Запускаем его при нажатии:
            startActivity(intent);
        }
    }
}