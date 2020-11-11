package com.example.assignmentpert8_2201733963;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    CheckBox checkBox2;
    Button regisBtn2;
    TextView checkBox2Error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        init3();

        regisBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBox2.isChecked()){
                    checkBox2Error.setText("You must agree to our terms and policy.");
                    checkBox2Error.setTextColor(Color.RED);
                }
                if(checkBox2.isChecked()){
                    openPage_4();

                }

            }
        });
    }
    public void openPage_4() {
        Intent openActivity = new Intent(this, Main4Activity.class);
        startActivity(openActivity);
    }

    private void init3() {
        checkBox2 = findViewById(R.id.checkBox2);
        regisBtn2 = findViewById(R.id.regisBtn2);
        checkBox2Error = findViewById(R.id.checkBox2Error);
    }
}
