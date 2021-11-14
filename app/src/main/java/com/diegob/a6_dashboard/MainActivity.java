package com.diegob.a6_dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.diegob.a6_dashboard.activities.Amigos_activity;
import com.diegob.a6_dashboard.activities.Calculadora_activity;
import com.diegob.a6_dashboard.activities.Edad_activity;
import com.diegob.a6_dashboard.activities.Galeria_activity;
import com.diegob.a6_dashboard.activities.Mapas_activity;
import com.diegob.a6_dashboard.activities.MusicActivity;
import com.diegob.a6_dashboard.activities.Quizzes_activity;
import com.diegob.a6_dashboard.activities.Restaurantes_activity;
import com.diegob.a6_dashboard.activities.Settings_activity;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellay_calculator, rellay_friends, rellay_dog, rellay_quizzes, rellay_gallery, rellay_maps, rellay_restaurant, rellay_settings, rellay_music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellay_calculator   = findViewById(R.id.rellay_calculator);
        rellay_friends      = findViewById(R.id.rellay_friends);
        rellay_dog          = findViewById(R.id.rellay_dog);
        rellay_quizzes      = findViewById(R.id.rellay_quizzes);
        rellay_maps         = findViewById(R.id.rellay_maps);
        rellay_gallery      = findViewById(R.id.rellay_gallery);
        rellay_restaurant   = findViewById(R.id.rellay_restaurants);
        rellay_settings     = findViewById(R.id.rellay_settings);
        rellay_music        = findViewById(R.id.rellay_music);

        rellay_calculator.setOnClickListener(view -> {
            Intent i = new Intent(this, Calculadora_activity.class);
            startActivity(i);
        });

        rellay_friends.setOnClickListener(view -> {
            Intent i = new Intent(this, Amigos_activity.class);
            startActivity(i);
        });
        rellay_dog.setOnClickListener(view -> {
            Intent i = new Intent(this, Edad_activity.class);
            startActivity(i);
        });

        rellay_quizzes.setOnClickListener(view -> {
            Intent i = new Intent(this, Quizzes_activity.class);
            startActivity(i);
        });
        rellay_maps.setOnClickListener(view -> {
            Intent i = new Intent(this, Mapas_activity.class);
            startActivity(i);
        });

        rellay_gallery.setOnClickListener(view -> {
            Intent i = new Intent(this, Galeria_activity.class);
            startActivity(i);
        });
        rellay_restaurant.setOnClickListener(view -> {
            Intent i = new Intent(this, Restaurantes_activity.class);
            startActivity(i);
        });

        rellay_settings.setOnClickListener(view -> {
            Intent i = new Intent(this, Settings_activity.class);
            startActivity(i);
        });

        rellay_music.setOnClickListener(view -> {
            Intent i = new Intent(this, MusicActivity.class);
            startActivity(i);
        });
    }
}