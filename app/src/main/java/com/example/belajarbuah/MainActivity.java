package com.example.belajarbuah;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt_tebak_buah(View view){
        Toast.makeText(MainActivity.this,"Mengenal Buah - Buahan", Toast.LENGTH_SHORT).show();
    }
    public void bt_alpukat(View view) {
        Intent i = new Intent(MainActivity.this,Alpukat.class);
        startActivity(i);
    }
    public void bt_apel(View view) {
        Intent i = new Intent(MainActivity.this,Apel.class);
        startActivity(i);
    }
    public void bt_ceri(View view) {
        Intent i = new Intent(MainActivity.this,Ceri.class);
        startActivity(i);
    }

    public void bt_durian(View view) {
        Intent i = new Intent(MainActivity.this, Durian.class);
        startActivity(i);
    }

}
