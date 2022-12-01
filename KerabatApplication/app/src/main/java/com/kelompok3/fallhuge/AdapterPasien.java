package com.kelompok3.fallhuge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterPasien extends RecyclerView.Adapter<ViewHolderPasien> {
    Context context;
    List<ClassPasien> pasien;

    public AdapterPasien(Context context, List<ClassPasien> pasien) {
        this.context = context;
        this.pasien = pasien;
    }

    @NonNull
    @Override
    public ViewHolderPasien onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderPasien(LayoutInflater.from(context).inflate(R.layout.patient_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPasien holder, int position) {
        holder.namePasien.setText(pasien.get(position).getNamePasien());
    }

    @Override
    public int getItemCount() {
        return pasien.size();
    }
}

