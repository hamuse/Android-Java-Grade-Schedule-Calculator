package com.example.application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.TimePicker;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        final Context _this = ScheduleActivity.this;
        final class MyDate{String year,month,day;}
        final MyDate myDate = new MyDate();
        final CalendarView calender=findViewById(R.id.calender);
        final TextView today=findViewById(R.id.today);
        final TimePicker time = findViewById(R.id.time);
        final TextView year =findViewById(R.id.year);
        final  TextView month =findViewById(R.id.month);
        final TextView day =findViewById(R.id.day);
        final  TextView hour =findViewById(R.id.hour);
        final TextView minute =findViewById(R.id.minute);
          calender.setVisibility(View.VISIBLE);
           time.setVisibility(View.INVISIBLE);

        findViewById(R.id.rdoCalendar)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        calender.setVisibility(View.VISIBLE);
                        time.setVisibility(View.INVISIBLE);
                    }
                });
        findViewById(R.id.rdoTime)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        time.setVisibility(View.VISIBLE);
                        calender.setVisibility(View.INVISIBLE);
                    }
                });
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view,
                                            int year, int month, int dayOfMonth) {
                myDate.year = year+"";
                myDate.month = (month+1) + "";
                myDate.day=dayOfMonth+"";

            }
        });
        findViewById(R.id.btnEnd)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        year.setText(myDate.year);
                        month.setText(myDate.month);
                        day.setText(myDate.day);
                        hour.setText(time.getHour()+"");
                        minute.setText(time.getMinute()+"");

                    }
                });

    }
}
