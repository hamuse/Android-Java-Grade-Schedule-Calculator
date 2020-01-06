package com.example.application;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context _this = MainActivity.this;

        Button btnCalculator =findViewById(R.id.btnCalculator);
        Button btnGrade =findViewById(R.id.btnGrade);

        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(_this,CalculatorActivity.class));
                Toast.makeText(_this,"알럿",Toast.LENGTH_SHORT).show();
            }
        });

        btnGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(_this,GradeActivity.class));
                Toast.makeText(_this,"성적",Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btnSchedule).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(_this,ScheduleActivity.class));

            }
        });



    }
}
