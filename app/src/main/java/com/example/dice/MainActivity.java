package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);// Roll button declaration

       final ImageView rightDice = (ImageView) findViewById(R.id.rightDice);//right dice img declaration
       final ImageView leftDice = (ImageView) findViewById(R.id.leftDice);//left dice img declaration

       final int[] diceArray = {R.drawable.dice1,//dice array of drawable images
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//onclick listener
                Log.d("dice", "Ze button Pressed!");

                Random randomNumberGenerator = new Random();//create random number

                int number1 = randomNumberGenerator.nextInt(6);//left dice rand
                int number2 = randomNumberGenerator.nextInt(6);//right dice rand

                //Log.d("dice", "The Random Number Is " + number);

                leftDice.setImageResource(diceArray[number1]);//set left image as a random array index

                rightDice.setImageResource(diceArray[number2]);//set right image as a random array index

            }
        });







    }
}
