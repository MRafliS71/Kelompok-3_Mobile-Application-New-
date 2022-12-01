package com.kelompok3.fallhuge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterPasien extends RecyclerView.Adapter<AdapterPasien.ViewHolderPasien> {

    private final InterfacePasien interfacePasien;
    Context context;
    List<ClassPasien> pasien;

    public AdapterPasien(Context context, List<ClassPasien> pasien, InterfacePasien interfacePasien) {
        this.context = context;
        this.pasien = pasien;
        this.interfacePasien = interfacePasien;
    }

    @NonNull
    @Override
    public ViewHolderPasien onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.patient_row,parent,false);

        return new ViewHolderPasien(view, interfacePasien);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPasien holder, int position) {
        holder.namePasien.setText(pasien.get(position).getNamePasien());
        holder.ppPasien.setImageResource(pasien.get(position).getPpPasien());
    }

    @Override
    public int getItemCount() {
        return pasien.size();
    }

    public static class ViewHolderPasien extends RecyclerView.ViewHolder {

        TextView namePasien;
        ImageView ppPasien;

        public ViewHolderPasien(@NonNull View itemView, InterfacePasien interfacePasien) {
            super(itemView);
            namePasien = itemView.findViewById(R.id.namePasien);
            ppPasien = itemView.findViewById(R.id.ppPasien);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (interfacePasien != null){
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION){
                            interfacePasien.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}

