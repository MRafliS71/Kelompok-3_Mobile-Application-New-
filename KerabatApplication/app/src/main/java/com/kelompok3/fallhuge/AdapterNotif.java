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

public class AdapterNotif extends RecyclerView.Adapter<AdapterNotif.ViewHolderNotif> {

    Context context;
    List<ClassNotification> notif;

    public AdapterNotif(Context context, List<ClassNotification> notif) {
        this.context = context;
        this.notif = notif;
    }

    @NonNull
    @Override
    public ViewHolderNotif onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderNotif(LayoutInflater.from(context).inflate(R.layout.notification_row, parent, false));
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

    public static class ViewHolderNotif extends RecyclerView.ViewHolder {

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
}
