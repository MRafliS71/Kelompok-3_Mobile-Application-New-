package com.kelompok3.fallhuge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterNotif extends RecyclerView.Adapter<ViewHolderNotif> {

    Context context;
    List<Notification> notif;

    public AdapterNotif(Context context, List<Notification> notif) {
        this.context = context;
        this.notif = notif;
    }

    @NonNull
    @Override
    public ViewHolderNotif onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderNotif(LayoutInflater.from(context).inflate(R.layout.notification_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderNotif holder, int position) {
        holder.tvJudul.setText(notif.get(position).getJudul());
        holder.tvJenis.setText(notif.get(position).getJenis());
        holder.tvTanggal.setText(notif.get(position).getTanggal());
        holder.tvWaktu.setText(notif.get(position).getWaktu());
        holder.ppAccount.setImageResource(notif.get(position).getPpAcount());
        holder.bgNotif.setImageResource(notif.get(position).getBgNotif());
        holder.ikonNotif.setImageResource(notif.get(position).getIkonNotif());
    }

    @Override
    public int getItemCount() {
        return notif.size();
    }
}
