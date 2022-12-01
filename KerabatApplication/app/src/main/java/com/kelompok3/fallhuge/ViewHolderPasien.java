package com.kelompok3.fallhuge;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderPasien extends RecyclerView.ViewHolder {

    TextView namePasien;

    public ViewHolderPasien(@NonNull View itemView) {
        super(itemView);
        namePasien = itemView.findViewById(R.id.namePasien);
    }
}
