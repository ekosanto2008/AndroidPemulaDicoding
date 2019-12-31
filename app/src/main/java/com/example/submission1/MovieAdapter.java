package com.example.submission1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private ArrayList<Movie> listMovie;
    private OnItemClickCallback onItemClickCallback;

    MovieAdapter(ArrayList<Movie> list){
        this.listMovie = list;
    }

    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_film, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MovieAdapter.ViewHolder holder, int position) {
        Movie movie = listMovie.get(position);

        holder.tvTitle.setText(movie.title);
        holder.tvOverview.setText(movie.overview);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMovie.get(holder.getAdapterPosition()));
            }
        });
        Glide.with(holder.itemView.getContext())
                .load(movie.getPhoto())
                .apply(new RequestOptions().override(55, 60))
                .into(holder.tvImage);
    }

    public interface OnItemClickCallback {
        void onItemClicked(Movie data);
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle, tvOverview;
        ImageView tvImage;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tv_movie_title);
            tvOverview = itemView.findViewById(R.id.tv_movie_overview);
            tvImage = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
