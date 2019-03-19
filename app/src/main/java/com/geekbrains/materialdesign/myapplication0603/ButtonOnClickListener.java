package com.geekbrains.materialdesign.myapplication0603;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class ButtonOnClickListener implements View.OnClickListener {
    private Activity sourceActivity;
    private static final String KEY_PARCEL = "PARCEL";
    private static final int REQUEST_CODE = 1;

    public ButtonOnClickListener(Activity sourceActivity ) {
        this.sourceActivity = sourceActivity;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(sourceActivity, SecondActivity.class);
        EditText editText = sourceActivity.findViewById(R.id.textTown);
        CheckBox hymidity = sourceActivity.findViewById(R.id.checkboxHumidity);
        CheckBox wind = sourceActivity.findViewById(R.id.checkboxWind);
        CheckBox pressure = sourceActivity.findViewById(R.id.checkboxPressure);
        Parcel parcel = new Parcel(editText.getText().toString(),wind.isChecked(),hymidity.isChecked(),pressure.isChecked());


        intent.putExtra(KEY_PARCEL,parcel);
        sourceActivity.startActivityForResult(intent,REQUEST_CODE);
    }
}
