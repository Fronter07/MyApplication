package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView imageChampion;
    TextView nameChampion, role, difficulty, competance, passif, spell_Q, spell_Z, spell_E, spell_R, descriptionQ, descriptionZ, descriptionE, descriptionR;
    String d_name, d_position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        imageChampion = findViewById(R.id.imageChampion);
        nameChampion = findViewById(R.id.nameChampion);
        role = findViewById(R.id.role);
        difficulty = findViewById(R.id.difficulty);
        competance = findViewById(R.id.competance);
        passif = findViewById(R.id.passif);
        spell_Q = findViewById(R.id.spell_Q);
        spell_Z = findViewById(R.id.spell_Z);
        spell_E = findViewById(R.id.spell_E);
        spell_R = findViewById(R.id.spell_R);
        descriptionQ = findViewById(R.id.descriptionQ);
        descriptionZ = findViewById(R.id.descriptionZ);
        descriptionE = findViewById(R.id.descriptionE);
        descriptionR = findViewById(R.id.descriptionR);

        d_name = intent.getStringExtra("name");
        d_position = intent.getStringExtra("position");

        nameChampion.setText(d_name);
        role.setText(d_position);
    }
}
