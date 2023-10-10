package com.aryan.unitcon;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;
import java.util.Random;

public class GuessGame extends AppCompatActivity {
    private TextInputEditText guess;
    private TextView result;
    private Button guess_number,playagain;
    private Random random= new Random();
    private int ran=random.nextInt(100);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_game);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.appbar)));
        guess_number= findViewById(R.id.guess_number);
        playagain=findViewById(R.id.playagain);
        playagain.setAlpha(0);
        guess=findViewById(R.id.guess);
        result=findViewById(R.id.result);
        guess_number.setOnClickListener((v)->{
            int guessNumber=Integer.parseInt(guess.getText().toString());
            if (ran>guessNumber){
                result.setText("Try Higher");
            } else if (ran<guessNumber) {
                result.setText("Oops..Try Lower");
            }
            else{
                result.setText("Correct!! You Won");
                playagain.setAlpha(1);
            }
        });
        playagain.setOnClickListener((view)->{
            resetValue();
        });

    }

    public void resetValue(){
        guess.setText("");
        result.setText("");
        ran=random.nextInt(100);
        playagain.setAlpha(0);
    }
}