package com.diegob.a6_dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.diegob.a6_dashboard.R;
import com.diegob.a6_dashboard.model.Disco;

public class DetalleActivityDisco extends AppCompatActivity {

    private TextView tvNombre, tvArtista, tvLanzamiento;
    private ImageView imgFoto;
    private Disco disco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_disco);

        //Obtener item
        disco = (Disco) getIntent().getSerializableExtra("disco");
        if (disco!=null){
            tvNombre        = findViewById(R.id.tvNombreDetalle);
            tvArtista   = findViewById(R.id.tvArtistaDetalle);
            tvLanzamiento = findViewById(R.id.tvLanzamientoDetalle);
            imgFoto         = findViewById(R.id.imgFotoDetalle);
            tvNombre.setText(disco.getNombre());
            tvArtista.setText(disco.getArtista());
            tvLanzamiento.setText(disco.getLanzamiento().toString());
            imgFoto.setImageResource(disco.getImage());
        }
    }
}