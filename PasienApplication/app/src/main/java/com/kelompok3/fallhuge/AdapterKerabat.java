package com.kelompok3.fallhuge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterKerabat extends RecyclerView.Adapter<AdapterKerabat.ViewHolderKerabat> {

    Context context;
    List<ClassKerabat> kerabat;

    public AdapterKerabat(Context context, List<ClassKerabat> kerabat) {
        this.context = context;
        this.kerabat = kerabat;
    }

    @NonNull
    @Override
    public ViewHolderKerabat onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderKerabat(LayoutInflater.from(context).inflate(R.layout.kerabat_row, parent, false));
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

    public static class ViewHolderKerabat extends RecyclerView.ViewHolder {

        ImageView ppKerabat;
        TextView nameKerabat;
        ImageButton dropdownButton;

        public ViewHolderKerabat(@NonNull View itemView) {
            super(itemView);
            ppKerabat = itemView.findViewById(R.id.ppKerabat);
            nameKerabat = itemView.findViewById(R.id.nameKerabat);
            dropdownButton = itemView.findViewById(R.id.dropdownButton);
        }
    }
}
