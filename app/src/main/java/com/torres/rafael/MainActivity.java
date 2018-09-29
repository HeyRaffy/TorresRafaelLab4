package com.torres.rafael;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITF", "***onCreate has executed...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITF","***onStart has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITF","***onResume has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITF","***onPause has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITF","***onRestart has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITF","***Object is deallocated...");
    }

    public void toast(View v){
        Toast.makeText(this, "Back has been clicked...", Toast.LENGTH_LONG).show();
    }

    public void snack(View v){
        Snackbar.make(v, "Next has been clicked...", Snackbar.LENGTH_LONG).show();
    }
}
