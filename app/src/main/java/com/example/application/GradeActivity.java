package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GradeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        final Context _this = GradeActivity.this;
        final EditText kor = findViewById(R.id.kor);
        final EditText eng = findViewById(R.id.eng);
        final EditText math = findViewById(R.id.math);
        final TextView aveResult=findViewById(R.id.aveResult);



        findViewById(R.id.btn_ave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numKor  = Integer.parseInt(kor.getText().toString());
               int numEng = Integer.parseInt(eng.getText().toString());
               int numMath = Integer.parseInt(math.getText().toString());
               int result = (numKor+numEng+numMath)/3;
               aveResult.setText(result+"");
                Toast.makeText(_this,"성적"+result,Toast.LENGTH_SHORT).show();
            }
        });


    }
}
