package com.example.medicproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class Calender extends AppCompatActivity {

    Button Save;
    EditText appointment;
    EditText Description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);


        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!appointment.getText().toString().isEmpty()){

                    Intent intent= new Intent(Intent.ACTION_INSERT);
                    intent.setData(CalendarContract.Events.CONTENT_URI);
                    intent.putExtra(CalendarContract.Events.TITLE,appointment.getText().toString());
                    intent.putExtra(CalendarContract.Events.DESCRIPTION,Description.getText().toString());
                    intent.putExtra(CalendarContract.Events.ALL_DAY,false);
                    intent.putExtra(Intent.EXTRA_EMAIL,"");

                    if (intent.resolveActivity(getPackageManager()) != null) {

                        startActivity(intent);
                    }else{
                        Toast.makeText(Calender.this,"THERE IS NO APP THAT SUPPORT THIS ACTION ",Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(Calender.this,"Please fill in Appointment name ",Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}
