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

public class AdapterMessage extends RecyclerView.Adapter<AdapterMessage.ViewHolderMessage> {

    Context context;
    List<ClassMessage> message;

    public AdapterMessage(Context context, List<ClassMessage> message) {
        this.context = context;
        this.message = message;
    }

    @NonNull
    @Override
    public ViewHolderMessage onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderMessage(LayoutInflater.from(context).inflate(R.layout.message_row, parent, false));
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

    public static class ViewHolderMessage extends RecyclerView.ViewHolder {

        ImageView pointer;
        TextView textMessage;

        public ViewHolderMessage(@NonNull View itemView) {
            super(itemView);
            pointer = itemView.findViewById(R.id.pointer);
            textMessage = itemView.findViewById(R.id.textMessage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // test
//                Toast.makeText(MessagePageActivity., "Ceritanya Pesan dikirimkan", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
