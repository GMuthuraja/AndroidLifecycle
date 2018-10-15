package com.example.app.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("tag", "onCreate(2)");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("tag", "onStart(2)");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("tag", "onResume(2)");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("tag", "onRestart(2)");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("tag", "onPause(2)");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("tag", "onStop(2)");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("tag", "onDestroy(2)");
    }
}
