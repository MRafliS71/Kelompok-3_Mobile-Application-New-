package com.kelompok3.fallhuge;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterPasien extends RecyclerView.Adapter<ViewHolderElder> {

    ArrayList<Elder> alElder;

    public AdapterPasien(ArrayList<Elder> alElder) {
        this.alElder = alElder;
    }

    @NonNull
    @Override
    public ViewHolderElder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.data_pasien, parent, false);
        // jangan sampai lupa return viewholder, akan menyebabkan bug yang susah ditrace
        return new ViewHolderElder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderElder holder, int position) {
        Elder m = alElder.get(position);
        holder.tvElderName.setText(m.getElderName());
    }

    @Override
    public int getItemCount() {
        return alElder.size();
    }

}
//class Elder {
//    String elder;
//
//    public String getElderName() {
//        return elder;
//    }
//
//    public void setElderName(String elder) {
//        this.elder = elder;
//    }
//
//    public Elder(String elder) {
//        this.elder = elder;
//    }
//}
