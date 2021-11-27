package com.diegob.a6_dashboard.activities;

import androidx.fragment.app.FragmentActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

import com.diegob.a6_dashboard.R;
import com.diegob.a6_dashboard.databinding.ActivityMapasBinding;
import com.diegob.a6_dashboard.model.Restaurante;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class Mapas_activity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        try {
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(this, R.raw.style_json)
            );
            if (!success){
                Log.e("MAPAS", "Existe el recurso pero no se carga bien");
            }
        } catch (Resources.NotFoundException e){
            Log.e("ERROR MAPA", e.getMessage());
            Log.e("ERROR MAPA", "No existe el recurso json");
        }

        mMap = googleMap;

        ArrayList<Restaurante> lstRestaurante = new ArrayList<>();
        lstRestaurante.add(new Restaurante("Rafi Kebab", "https://www.wipo.int/export/sites/www/ipadvantage/images/article_0216_4_845.jpg", 5.0f, "Cta. Jardinera", 40.3437584, -1.105814));
        lstRestaurante.add(new Restaurante("Telepizza", "https://trabajosparajovenes.com/wp-content/uploads/2018/01/Telepizza-Necesita-Repartidores-para-Zona-de-Barcelona.jpg", 4.5f, "Av. de Sagunto", 40.332394,-1.0898083));
        lstRestaurante.add(new Restaurante("Tapas y copas", "data:image/jpeg;base64,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", 4.5f, "P.º del Óvalo", 40.3404121,-1.1099302));
        lstRestaurante.add(new Restaurante("Mc Donalds", "https://kauma.es/wp-content/uploads/2019/02/MCD_TERUEL_Cover-1.jpg", 4.5f, "Av. de Sagunto", 40.3330926,-1.0907281));
        lstRestaurante.add(new Restaurante("Pizza Burguer", "https://lh3.googleusercontent.com/proxy/EF9zbH53iPKOziaX1He9CKl8cp1mfNPxag-3OMJ35VPcCwwqi6jlznYnL1000Q1XUJ_lsGHu_F44DHZ26Vw2jYNZUnJM2AOOhBjILxO8Ho9K6skAMwauv6NtRU9zgvIZ2NE", 4.5f, "C. Sta. Amalia", 40.3493171,-1.1122095));
        lstRestaurante.add(new Restaurante("Torico Gourmet", "https://media-cdn.tripadvisor.com/media/photo-s/0f/bd/52/59/photo3jpg.jpg", 4.0f, "Plaza torico", 40.3431126,-1.1090551));
        lstRestaurante.add(new Restaurante("Gran café", "https://media-cdn.tripadvisor.com/media/photo-s/0a/f6/5f/54/exterior.jpg", 4.0f, "C. Joaquín Costa", 40.3437875,-1.1079926));
        lstRestaurante.add(new Restaurante("Gregory", "https://www.comarcaacomarca.com/cdn/uploads/195_gregoryubarudeutapas/1406220987ba04f12e3e3965f5ab1af69705e.jpg", 4.0f, "P.º del Óvalo", 40.3409842,-1.1100943));
        lstRestaurante.add(new Restaurante("Asador Medieval", "https://10619-2.s.cdn12.com/rests/original/323_38210292.jpg", 4.0f, "C. Diputación", 40.3403952,-1.1081314));

        LatLng teruel = new LatLng(40.336139, -1.107440);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(teruel));

        for (Restaurante restaurante: lstRestaurante) {
            LatLng rest = new LatLng(restaurante.getLatitud(), restaurante.getLongitud());
            mMap.addMarker(new MarkerOptions().position(rest).title(restaurante.getNombre()));
        }

    }
}