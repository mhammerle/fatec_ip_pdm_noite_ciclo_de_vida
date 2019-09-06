package com.example.fatec_ip_pdm_noite_ciclo_de_vida;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Ciclo_de_Vida";

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"MainActivit.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"MainActivity.onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"MainActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"MainActivity.onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"MainActivity.onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"MainActivity.onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "MainActivity.onCreate");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(intent);
            }
        });
    }

}
