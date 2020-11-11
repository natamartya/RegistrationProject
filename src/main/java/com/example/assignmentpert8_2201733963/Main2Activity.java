package com.example.assignmentpert8_2201733963;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    RadioButton maleBtn, femaleBtn;
    EditText userTxt, phoneTxt;
    Spinner phoneSp;
    Button regisBtn;
    TextView genderError, userError, phoneError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init2();

        ArrayList<String> phoneList = new ArrayList<>();
        phoneList.add("+60");
        phoneList.add("+62");
        phoneList.add("+63");
        phoneList.add("+65");
        ArrayAdapter<String> phAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,phoneList);
        phoneSp.setAdapter(phAdapter);

        regisBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int check2 = 0;
                String userInput = userTxt.getText().toString();
                String phoneInput = phoneTxt.getText().toString();

                if(!maleBtn.isChecked() && !femaleBtn.isChecked()){
                    genderError.setText("Prefix is required");
                    genderError.setTextColor(Color.RED);
                    check2 = 0;
                }
                if(maleBtn.isChecked() || femaleBtn.isChecked()){
                    genderError.setText("");
                    check2 = 1;
                }
                if(userInput.isEmpty()){
                    userError.setText("Name is required");
                    userError.setTextColor(Color.RED);
                    check2 = 0;
                }
                if(!userInput.isEmpty()){
                    userError.setText("");
                    check2 = 2;
                }
                if(phoneInput.isEmpty()){
                    phoneError.setText("Phone is required");
                    phoneError.setTextColor(Color.RED);
                    check2 = 0;
                }
                if(!phoneInput.isEmpty()){
                    phoneError.setText("");
                    check2 = 3;
                }
                if(check2==3){
                    openPage_3();
                }

            }
        });

    }

    public void openPage_3() {
        Intent openActivity = new Intent(this, Main3Activity.class);
        startActivity(openActivity);
    }


    private void init2() {
        maleBtn = findViewById(R.id.maleBtn);
        femaleBtn = findViewById(R.id.femaleBtn);
        userTxt = findViewById(R.id.userTxt);
        phoneTxt = findViewById(R.id.phoneTxt);
        phoneSp = findViewById(R.id.phoneSp);
        regisBtn = findViewById(R.id.regisBtn);
        genderError = findViewById(R.id.genderError);
        userError = findViewById(R.id.userError);
        phoneError = findViewById(R.id.phoneError);
    }
}
