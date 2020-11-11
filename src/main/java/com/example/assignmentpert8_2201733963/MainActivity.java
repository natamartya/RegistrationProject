package com.example.assignmentpert8_2201733963;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    EditText emailTxt, passTxt;
    Button nextBtn;
    CheckBox checkBox;
    TextView emailError, passError, checkBoxError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailInput = emailTxt.getText().toString();
                String passInput = passTxt.getText().toString();
                int check = 0;

                if(emailInput.isEmpty()){
                    emailTxt.setError("E-mail is required");
                    emailError.setText("Email is required");
                    emailError.setTextColor(Color.RED);
                    check = 0;
                }
                if(!emailInput.isEmpty()) {
                    emailError.setText("");
                    check = 1;
                }
                if(passInput.isEmpty()){
                    passError.setText("Password is required");
                    passError.setTextColor(Color.RED);
                    check = 0;
                }
                if(!passInput.isEmpty()){
                    passError.setText("");
                    check = 2;
                }
                if(!checkBox.isChecked()){
                    checkBoxError.setText("You must agree to our terms and policy.");
                    checkBoxError.setTextColor(Color.RED);
                    check = 0;
                }
                if(checkBox.isChecked()){
                    checkBoxError.setText("");
                    check = 3;
                }
                if(check == 3){
                    openPage_2();
                }

            }
        });

    }

    public void openPage_2() {
        Intent openActivity = new Intent(this, Main2Activity.class);
        startActivity(openActivity);
    }


    private void init() {
        linearLayout = findViewById(R.id.linearLayout);
        emailTxt = findViewById(R.id.emailTxt);
        passTxt = findViewById(R.id.passTxt);
        nextBtn = findViewById(R.id.nextBtn);
        checkBox = findViewById(R.id.checkBox);
        emailError = findViewById(R.id.emailError);
        passError = findViewById(R.id.passError);
        checkBoxError = findViewById(R.id.checkBoxError);
    }
}
