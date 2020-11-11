package com.example.assignmentpert8_2201733963;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Main4Activity extends AppCompatActivity {
    Switch SW;
    Button finishBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        init4();
//        SW.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//            }
//        });

        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Main4Activity.this);
                dialog.setTitle("Congratulations!");
                dialog.setMessage("You got a coupon! Enter KVJek15-1 to get 25% discount until August 30!");
                dialog.show();
            }
        });
    }

    private void init4() {
        SW = findViewById(R.id.SW);
        finishBtn = findViewById(R.id.finishBtn);
    }
}
