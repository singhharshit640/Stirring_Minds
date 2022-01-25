package com.example.stirringminds;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        AlertDialog pop;
        View popLayout = LayoutInflater.from(MainActivity.this).inflate(R.layout.alert_layout, null);
        Button yes = popLayout.findViewById(R.id.yes);
        Button no = popLayout.findViewById(R.id.no);
        yes.setOnClickListener(v -> MainActivity.super.onBackPressed());

        AlertDialog.Builder popBuilder = new AlertDialog.Builder(MainActivity.this).setView(popLayout);
        popBuilder.setCancelable(true);
        pop = popBuilder.show();
        no.setOnClickListener(v -> pop.dismiss());

    }
}