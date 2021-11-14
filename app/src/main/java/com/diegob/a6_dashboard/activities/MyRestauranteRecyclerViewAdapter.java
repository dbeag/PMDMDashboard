package com.diegob.a6_dashboard.activities;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.diegob.a6_dashboard.activities.placeholder.PlaceholderContent.PlaceholderItem;
import com.diegob.a6_dashboard.databinding.FragmentRestauranteBinding;
import com.diegob.a6_dashboard.model.Restaurante;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyRestauranteRecyclerViewAdapter extends RecyclerView.Adapter<MyRestauranteRecyclerViewAdapter.ViewHolder> {

    private final List<Restaurante> mValues;
    private Context context;

    public MyRestauranteRecyclerViewAdapter(List<Restaurante> mValues, Context context) {
        this.mValues = mValues;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentRestauranteBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mItem = mValues.get(position);
        holder.textViewNombreRestaurante.setText(mValues.get(position).getNombre());
        holder.textViewDireccionRestaurante.setText(mValues.get(position).getDireccion());
        holder.ratingBarValoracionRestaurante.setRating(mValues.get(position).getValoracion());
        Glide.with(context).load(mValues.get(position).getUrlFoto()).into(holder.imageViewFotoRestaurante);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView textViewNombreRestaurante;
        public final TextView textViewDireccionRestaurante;
        public final ImageView imageViewFotoRestaurante;
        public final RatingBar ratingBarValoracionRestaurante;
        public Restaurante mItem;

        public ViewHolder(FragmentRestauranteBinding binding) {
            super(binding.getRoot());
            textViewNombreRestaurante = binding.textViewNombre;
            textViewDireccionRestaurante = binding.textViewDireccion;
            imageViewFotoRestaurante = binding.imageViewRestaurante;
            ratingBarValoracionRestaurante = binding.ratingBarValoracion;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewNombreRestaurante.getText() + "'";
        }
    }
}