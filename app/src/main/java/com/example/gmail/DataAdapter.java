package com.example.gmail;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class DataAdapter  extends RecyclerView.Adapter<DataAdapter.ViewHolder>  {
    private LayoutInflater inflater;
    private List<Item> items;

    DataAdapter(Context context, List<Item> items) {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.titleView.setText(item.getTitle());
        holder.messageView.setText(item.getMessage());
        holder.dateView.setText(item.getDate());
        holder.imageLogoView.setImageResource(item.getImageLogo());
        holder.imageStarView.setImageResource(item.getImageStar());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageLogoView, imageStarView;
        final TextView titleView, messageView, dateView;
        ViewHolder(View view){
            super(view);
            imageLogoView = (ImageView)view.findViewById(R.id.imageLogo);
            imageStarView = (ImageView)view.findViewById(R.id.imageStar);
            titleView = (TextView) view.findViewById(R.id.title);
            messageView = (TextView) view.findViewById(R.id.message);
            dateView = (TextView) view.findViewById(R.id.date);
        }
    }
}
