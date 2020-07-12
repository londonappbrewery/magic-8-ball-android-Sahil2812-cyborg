package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
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

        Button ask_btn = findViewById(R.id.ask_button);
        final ImageView ball = findViewById(R.id.image_eightball);

        final int[] ball_array = {R.drawable.ball1,
                                    R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

        ask_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ask", "Asked");

                Random random_gen = new Random();
                int num = random_gen.nextInt(5);

                Log.d("random_gen", "Random number is: "+ num);

                ball.setImageResource(ball_array[num]);
            }
        });
    }
}
