package com.aryan.unitcon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class Kilometer extends AppCompatActivity {

    Button button, switch_conversion;
    TextView textView;
    TextInputEditText value1;
    TextInputLayout input1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilometer);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.appbar)));
        Intent intent = getIntent();
        textView = findViewById(R.id.textView);
        input1 = findViewById(R.id.input1);
        value1 = findViewById(R.id.value1);
        switch_conversion = findViewById(R.id.switch_con);
        button = findViewById(R.id.button2);
        button.setOnClickListener((v) -> {
            if (input1.getHint().equals("Value in Km")) {
                double valueInKm = Double.parseDouble(value1.getText().toString());
                double valueInMiles = valueInKm*0.621;
                textView.setText(String.format("%.2f Miles", valueInMiles));
            } else {
                double valueInMiles = Double.parseDouble(value1.getText().toString());
                double valueInKm = valueInMiles/0.621;
                textView.setText(String.format("%.2f Kilometers", valueInKm));
            }
        });
        switch_conversion.setOnClickListener((view) -> {
            if (input1.getHint().equals("Value in Km")) {
                input1.setHint("Value in Miles");
            } else {
                input1.setHint("Value in Km");
            }
        });
    }
}