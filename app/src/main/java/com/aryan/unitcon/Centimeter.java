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

public class Centimeter extends AppCompatActivity {
    Button button ,switch_conversion;
    TextView textView;
    TextInputEditText value1;
    TextInputLayout input1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centimeter);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.appbar)));
        Intent intent = getIntent();
        textView=findViewById(R.id.textView);
        input1 = findViewById(R.id.input1);
        value1 = findViewById(R.id.value1);
        switch_conversion=findViewById(R.id.switch_conversion);
        button=findViewById(R.id.button);
        button.setOnClickListener((v)->{
            if (input1.getHint().equals("Value in cm")){
                double valueInCm=Double.parseDouble(value1.getText().toString());
                double valueInM= valueInCm/100;
                textView.setText(String.format("%.2f meters",valueInM));
            }else{
                double valueInM=Double.parseDouble(value1.getText().toString());
                double valueInCm= 100*valueInM;
                textView.setText(String.format("%.2f centimeters",valueInCm));
            }
        });
        switch_conversion.setOnClickListener((view)->{
            if (input1.getHint().equals("Value in cm")){
                input1.setHint("Value in m");
            }else{
                input1.setHint("Value in cm");
            }
        });
    }
}