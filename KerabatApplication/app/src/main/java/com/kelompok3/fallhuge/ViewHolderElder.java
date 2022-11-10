package com.kelompok3.fallhuge;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderElder extends RecyclerView.ViewHolder {
    public TextView tvElderName;

    public ViewHolderElder(@NonNull View itemView) {
        super(itemView);
        tvElderName = itemView.findViewById(R.id.elderName);
    }
}
