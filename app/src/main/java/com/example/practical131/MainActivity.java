package com.example.practical131;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb = findViewById(R.id.pro);

        pb.setProgress(0);
        for (int i=0;i<=100;i++){
            setProgress(i);
            try {
                Thread.sleep(200);
            }
            catch (Exception e){}
        }
    }
}