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

public class Kilogram extends AppCompatActivity {

    Button button, switch_conversion;
    TextView textView;
    TextInputEditText value1;
    TextInputLayout input1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilogram);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.appbar)));
        Intent intent = getIntent();
        textView = findViewById(R.id.textView);
        input1 = findViewById(R.id.input1);
        value1 = findViewById(R.id.value1);
        switch_conversion = findViewById(R.id.switch_con);
        button = findViewById(R.id.button2);
        button.setOnClickListener((v) -> {
            if (input1.getHint().equals("Value in Kg")) {
                double valueInKg = Double.parseDouble(value1.getText().toString());
                double valueInLbs = valueInKg*2.204;
                textView.setText(String.format("%.2f Lbs", valueInLbs));
            } else {
                double valueInLbs = Double.parseDouble(value1.getText().toString());
                double valueInKg = valueInLbs/2.204;
                textView.setText(String.format("%.2f Kgs", valueInKg));
            }
        });
        switch_conversion.setOnClickListener((view) -> {
            if (input1.getHint().equals("Value in Kg")) {
                input1.setHint("Value in Lbs");
            } else {
                input1.setHint("Value in Kg");
            }
        });
    }
}