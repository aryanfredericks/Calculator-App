package com.aryan.unitcon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    CardView cardView1;
    CardView cardView2;
    CardView cardView3;
    CardView cardView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.appbar)));
        cardView1=findViewById(R.id.cardView1);
        cardView1.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this , Centimeter.class);
            MainActivity.this.startActivity(intent);
        });
        cardView2=findViewById(R.id.cardView2);
        cardView2.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this ,Kilogram.class);
            MainActivity.this.startActivity(intent);
        });
        cardView3=findViewById(R.id.cardView3);
        cardView3.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this ,Kilometer.class);
            MainActivity.this.startActivity(intent);
        });
        cardView4=findViewById(R.id.cardView4);
        cardView4.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this ,GuessGame.class);
            MainActivity.this.startActivity(intent);
        });
    }
}