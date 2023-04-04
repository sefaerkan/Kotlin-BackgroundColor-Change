package com.example.javaornekproje1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    RelativeLayout bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        bck= (RelativeLayout)findViewById(R.id.main_activity);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random i = new Random();
                new CountDownTimer(30000,100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        bck.setBackgroundColor(Color.argb(255,i.nextInt(256),i.nextInt(256),i.nextInt(256)));
                    }

                    @Override
                    public void onFinish() {

                    }
                }.start();
            }
        });
    }
}