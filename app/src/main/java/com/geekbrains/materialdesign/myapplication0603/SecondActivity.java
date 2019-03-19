package com.geekbrains.materialdesign.myapplication0603;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private static final String KEY_PARCEL = "PARCEL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Parcel parcel = (Parcel) getIntent().getExtras().getSerializable(KEY_PARCEL);
        TextView textView = findViewById(R.id.textTown);
        textView.setText(parcel.town);

        TextView wind = findViewById(R.id.appCompatTextViewWind);
        TextView pressure = findViewById(R.id.appCompatTextViewPressure);
        TextView hymidity = findViewById(R.id.appCompatTextViewHymidity);

        wind.setVisibility(parcel.wind ? View.VISIBLE : View.INVISIBLE);
        pressure.setVisibility(parcel.pressure ? View.VISIBLE : View.INVISIBLE);
        hymidity.setVisibility(parcel.hymidity ? View.VISIBLE : View.INVISIBLE);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonBack:
                EditText editText = findViewById(R.id.textToFirstActivity);
                Intent intentResult = new Intent();
                intentResult.putExtra("Number", editText.getText().toString());
                setResult(Activity.RESULT_OK, intentResult);
                finish();
                break;
            default:
                break;
        }
    }
}
