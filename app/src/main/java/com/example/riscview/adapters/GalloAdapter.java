package com.example.riscview.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.riscview.R;
import com.example.riscview.models.Gallo;

import java.util.List;

public class GalloAdapter extends RecyclerView.Adapter<GalloAdapter.ViewHolder> {



        private List<Gallo> gallos;

    public GalloAdapter(List<Gallo> gallos) {
        this.gallos = gallos;
    }


    @NonNull
    @Override
    public GalloAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View v=layoutInflater.inflate(R.layout.gallositem,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull GalloAdapter.ViewHolder holder, int position) {
            Gallo g = gallos.get(position);
            holder.setData(g);
    }

    @Override
    public int getItemCount() {
        return gallos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtnombre,txtpico,txtraza;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtnombre=itemView.findViewById(R.id.tvnombre);
            txtraza=itemView.findViewById(R.id.tvraza);
            txtpico=itemView.findViewById(R.id.tvpico);
        }

        @SuppressLint("SetTextI18n")
        public void setData(Gallo g) {
            txtnombre.setText(g.getNombre());
            txtraza.setText(g.getRaza());
            txtpico.setText(("pico: ")+g.getPico().getTamano());
        }
    }




}
