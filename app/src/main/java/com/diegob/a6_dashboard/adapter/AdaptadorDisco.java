package com.diegob.a6_dashboard.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.diegob.a6_dashboard.R;
import com.diegob.a6_dashboard.activities.DetalleActivityDisco;
import com.diegob.a6_dashboard.model.Disco;

import java.util.ArrayList;

public class AdaptadorDisco extends BaseAdapter {
    private ArrayList<Disco> lstDisco = new ArrayList<>();
    private Context context;
    private LayoutInflater inflater;

    public AdaptadorDisco(ArrayList<Disco> lstDisco, Context context) {
        this.lstDisco = lstDisco;
        this.context = context;
    }


    @Override
    public int getCount() {
        return lstDisco.size();
    }

    @Override
    public Object getItem(int position) {
        return lstDisco.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Disco disco = (Disco) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.discoitem, null);
        ImageView imgDisco = convertView.findViewById(R.id.imgFoto);
        TextView tvNombre = convertView.findViewById(R.id.tvNombre);
        TextView tvArtista = convertView.findViewById(R.id.tvArtista);
        TextView tvLanzamiento = convertView.findViewById(R.id.tvLanzamiento);

        imgDisco.setImageResource(disco.getImage());
        tvNombre.setText(disco.getNombre());
        tvArtista.setText(disco.getArtista());
        tvLanzamiento.setText(disco.getLanzamiento().toString());

        convertView.setOnClickListener(view ->{
            Intent i = new Intent(context, DetalleActivityDisco.class);
            i.putExtra("disco", disco);
            context.startActivity(i);
        });
        return convertView;
    }
}
