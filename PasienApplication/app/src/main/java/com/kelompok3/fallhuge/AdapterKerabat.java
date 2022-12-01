package com.kelompok3.fallhuge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterKerabat extends RecyclerView.Adapter<ViewHolderKerabat> {

    Context context;
    List<ClassKerabat> kerabat;

    public AdapterKerabat(Context context, List<ClassKerabat> kerabat) {
        this.context = context;
        this.kerabat = kerabat;
    }

    @NonNull
    @Override
    public ViewHolderKerabat onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderKerabat(LayoutInflater.from(context).inflate(R.layout.list_kerabat,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderKerabat holder, int position) {
        holder.ppKerabat.setImageResource(kerabat.get(position).getPpKerabat());
        holder.nameKerabat.setText(kerabat.get(position).getNameKerabat());
        holder.dropdownButton.setImageResource(kerabat.get(position).getDropdownButton());
    }

    @Override
    public int getItemCount() {
        return kerabat.size();
    }
}
