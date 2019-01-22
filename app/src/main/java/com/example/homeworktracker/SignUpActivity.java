package com.example.homeworktracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        populateSpinners();
    }

    /* onclick method for sign up button */
    public void onClickSignUp(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    /* onclick method for yes and no radio button */
    public void onClickRadioButton(View view) {
        boolean isChecked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.yesRadioButton:
                if(isChecked) {
                    //  TODO: implement notification settings functionality
                } else {
                    //  TODO: implement notification settings functionality
                }
                break;
            case R.id.noRadioButton:
                if(isChecked) {
                    //  TODO: implement notification settings functionality
                } else {
                    //  TODO: implement notification settings functionality
                }
                break;
        }
    }

    /**
     * populates spinners using array from @string file
     */
    private void populateSpinners() {
        Spinner eduSpinner = findViewById(R.id.eduSpinner);
        ArrayAdapter<CharSequence> eduArrayAdapter = ArrayAdapter.createFromResource(this,
                R.array.level_of_education,
                android.R.layout.simple_spinner_item);
        eduArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        eduSpinner.setAdapter(eduArrayAdapter);
    }
}
