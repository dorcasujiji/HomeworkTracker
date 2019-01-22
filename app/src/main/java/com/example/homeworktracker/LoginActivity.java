package com.example.homeworktracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private static String email = "";
    private static String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    // TODO: implement login functionality after database has been setup
    public void onClickLoginButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        TextView emailField = findViewById(R.id.email);
        email = emailField.getText().toString();
        TextView passwordField = findViewById(R.id.password);
        password = passwordField.getText().toString();

        startActivity(intent);
    }

    public void onClickSignUpButton(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
