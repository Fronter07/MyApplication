package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView imageChampion;
    TextView nameChampion, position, difficulty, competance, passif, spell_Q, spell_Z, spell_E, spell_R,descriptionPassif, descriptionQ, descriptionZ, descriptionE, descriptionR;
    String d_name, d_position, d_difficulty, d_competance, d_passif, d_spell_Q, d_spell_Z, d_spell_E, d_spell_R;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        imageChampion = findViewById(R.id.imageChampion);
        nameChampion = findViewById(R.id.nameChampion);
        position = findViewById(R.id.role);
        difficulty = findViewById(R.id.difficulty);
        competance = findViewById(R.id.competance);
        passif = findViewById(R.id.passif);
        spell_Q = findViewById(R.id.spell_Q);
        spell_Z = findViewById(R.id.spell_Z);
        spell_E = findViewById(R.id.spell_E);
        spell_R = findViewById(R.id.spell_R);

        d_name = intent.getStringExtra("name");
        d_position = intent.getStringExtra("role");
        d_difficulty = intent.getStringExtra("difficulty");
        d_competance = intent.getStringExtra("competance");
        d_passif = intent.getStringExtra("passif");
        d_spell_Q = intent.getStringExtra("spell_Q");
        d_spell_Z = intent.getStringExtra("spell_Z");
        d_spell_E = intent.getStringExtra("spell_E");
        d_spell_R = intent.getStringExtra("spell_R");

        nameChampion.setText(d_name);
        position.setText(d_position);
        difficulty.setText(d_difficulty);
        competance.setText((d_competance));
        passif.setText(d_passif);
        spell_Q.setText(d_spell_Q);
        spell_Z.setText(d_spell_Z);
        spell_E.setText(d_spell_E);
        spell_R.setText(d_spell_R);
    }
}
