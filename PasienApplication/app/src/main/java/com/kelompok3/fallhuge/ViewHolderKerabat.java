package com.kelompok3.fallhuge;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderKerabat extends RecyclerView.ViewHolder {

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
