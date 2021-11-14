package com.diegob.a6_dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.diegob.a6_dashboard.R;
import com.diegob.a6_dashboard.adapter.AdaptadorDisco;
import com.diegob.a6_dashboard.model.Disco;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    private ListView lstItems;
    private AdaptadorDisco adaptador;
    private ArrayList<Disco> lstDisco = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        lstItems = findViewById(R.id.lstDiscos);

        agregarDiscos();

        lstItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MusicActivity.this, DetalleActivityDisco.class);
                intent.putExtra("item", lstDisco.get(position));
                startActivity(intent);
            }
        });
    }

    private void agregarDiscos() {
        lstDisco.add(new Disco("Ansia viva", "Dellafuente", 2016, R.drawable.discoansiaviva));
        lstDisco.add(new Disco("Azulejos de corales", "Dellafuente", 2015, R.drawable.discoazulejosdecorales));
        lstDisco.add(new Disco("Descanso en poder", "Dellafuente", 2020, R.drawable.discodescansoenpoder));
        lstDisco.add(new Disco("Descartes", "Dellafuente", 2015, R.drawable.discodescartes));
        lstDisco.add(new Disco("La bestia del mambo", "Cecilio G", 2020, R.drawable.discolabestiadelmambo));
        lstDisco.add(new Disco("adromicfms 4", "Yung Beef", 2018, R.drawable.discoadromicfms4));
        lstDisco.add(new Disco("El plugg mixtape", "Yung Beef", 2016, R.drawable.discoelpluggmixtape));
        lstDisco.add(new Disco("Avida dollars", "C tangana", 2018, R.drawable.discoavidadollars));
        lstDisco.add(new Disco("Ídolo", "C tangana", 2017, R.drawable.discoidolo));


        adaptador = new AdaptadorDisco(lstDisco, this);
        lstItems.setAdapter(adaptador);
    }
}