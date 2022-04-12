package com.android.inputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view)
    {
        String e1 = "",e2 = "",e3 ="",e4= "",e5 ="";
        CheckBox checkBoxChocolate = findViewById(R.id.checkBoxChocolate);
        if (checkBoxChocolate.isChecked()) e1 = checkBoxChocolate.getText().toString();

        CheckBox checkBoxSprinkles = findViewById(R.id.checkBoxSprinkles);
        if (checkBoxSprinkles.isChecked()) e2 = checkBoxSprinkles.getText().toString();

        CheckBox checkBoxNuts = findViewById(R.id.checkBoxNuts);
        if (checkBoxNuts.isChecked()) e3 = checkBoxNuts.getText().toString();

        CheckBox checkBoxCherries = findViewById(R.id.checkBoxCherries);
        if (checkBoxCherries.isChecked()) e4 = checkBoxCherries.getText().toString();

        CheckBox checkBoxOrio = findViewById(R.id.checkBoxOrio);
        if (checkBoxOrio.isChecked()) e5 = checkBoxOrio.getText().toString();

        String order = "Toppings: " + e1 + e2 + e3 + e4 + e5;
        if (e1 =="" && e2 == "" && e3 == "" && e4 == "" && e5 == "")
        Toast.makeText(getApplicationContext(),"Please order!",Toast.LENGTH_SHORT).show();
        else
        {
            Toast.makeText(getApplicationContext(),order,Toast.LENGTH_SHORT).show();
        }
    }


}