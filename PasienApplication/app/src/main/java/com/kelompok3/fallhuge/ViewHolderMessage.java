package com.kelompok3.fallhuge;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderMessage extends RecyclerView.ViewHolder {

    ImageView pointer;
    TextView textMessage;

    public ViewHolderMessage(@NonNull View itemView) {
        super(itemView);
        pointer = itemView.findViewById(R.id.pointer);
        textMessage = itemView.findViewById(R.id.textMessage);
    }
}
