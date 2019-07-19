package com.andalus.hady;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<Adapter.MainHolder> {
    public interface ListItemOnClickListiner
    {
        void onlistitemclick(int ClickedItemIndex);


    }
    final private ListItemOnClickListiner OnItemClickListiner;


    private Data[] data;

    public Adapter(Data[] data,ListItemOnClickListiner listItemOnClickListiner) {
        this.data = data;
        OnItemClickListiner=listItemOnClickListiner;
    }
    class MainHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView textView, size;


        public MainHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.name);
            size = itemView.findViewById(R.id.size);
            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            int Clickecpostion=getAdapterPosition();
            OnItemClickListiner.onlistitemclick(Clickecpostion);

        }
    }
    @NonNull
    @Override

    public Adapter.MainHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item, viewGroup, false);
        return new MainHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MainHolder mainHolder, int i) {
        mainHolder.textView.setText(data[i].getName());
        mainHolder.size.setText(data[i].getSize()+"MB");
        mainHolder.imageView.setImageResource(data[i].getImage());

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}
