package com.kelompok3.fallhuge;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderNotif extends RecyclerView.ViewHolder {

    ImageView ppAccount, ikonNotif;
    TextView tvJudul, tvJenis, tvTanggal, tvWaktu;
    ImageButton bgNotif;

    public ViewHolderNotif(@NonNull View itemView) {
        super(itemView);
        ppAccount = itemView.findViewById(R.id.ppAccount);
        tvJudul = itemView.findViewById(R.id.tvJudul);
        tvJenis = itemView.findViewById(R.id.tvJenis);
        tvTanggal = itemView.findViewById(R.id.tvTanggal);
        tvWaktu = itemView.findViewById(R.id.tvWaktu);
        bgNotif = itemView.findViewById(R.id.bgNotif);
        ikonNotif = itemView.findViewById(R.id.ikonNotif);
    }
}
