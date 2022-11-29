package com.kelompok3.fallhuge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterMessage extends RecyclerView.Adapter<ViewHolderMessage> {

    Context context;
    List<Message> message;

    public AdapterMessage(Context context, List<Message> message) {
        this.context = context;
        this.message = message;
    }

    @NonNull
    @Override
    public ViewHolderMessage onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderMessage(LayoutInflater.from(context).inflate(R.layout.list_message,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMessage holder, int position) {
        holder.pointer.setImageResource(message.get(position).getPointer());
        holder.textMessage.setText(message.get(position).getTextMessage());
    }

    @Override
    public int getItemCount() {
        return message.size();
    }
}
