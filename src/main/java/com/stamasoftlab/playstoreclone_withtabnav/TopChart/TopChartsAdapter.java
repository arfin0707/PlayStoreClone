package com.stamasoftlab.playstoreclone_withtabnav.TopChart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.stamasoftlab.playstoreclone_withtabnav.R;

import java.util.ArrayList;

public class TopChartsAdapter  extends RecyclerView.Adapter<TopChartsAdapter.ViewHolder>{


    private Context mContext;
    private ArrayList<String> title ;
    private ArrayList<String> categories;
    private ArrayList<String> details;
    private ArrayList<String> rating;
    private ArrayList<String> appsize;
    private ArrayList<String> download;
    private ArrayList<Integer> image;

    public TopChartsAdapter(Context mContext, ArrayList<String> title, ArrayList<String> categories, ArrayList<String> details, ArrayList<String> rating, ArrayList<String> appsize, ArrayList<String> download, ArrayList<Integer> image) {
        this.mContext = mContext;
        this.title = title;
        this.categories = categories;
        this.details = details;
        this.rating = rating;
        this.appsize = appsize;
        this.download = download;
        this.image = image;
    }

    @Override
    public TopChartsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topcharts_customlayout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.title.setText(title.get(position));
        holder.categories.setText(categories.get(position));
        holder.details.setText(details.get(position));
        holder.rating.setText(rating.get(position));
        holder.appsize.setText(appsize.get(position));
        holder.download.setText(download.get(position));
        holder.image.setImageResource(image.get(position));
/*
        Glide.with(mContext)
                .asBitmap()
                .load(mImages_h.get(position))
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.image_h);
*/

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, TopCharts_DetailPage.class);

                //intent.putExtra("imageView", image.get(position));
                if (image.get(position) != null) {
                    intent.putExtra("imageView", image.get(position));
                } else {
                    intent.putExtra("imageView", R.drawable.ic_launcher_background);
                }

                //   intent.putExtra("imageResource", image.get(position));
               /* String imageView = "android.resource://" + mContext.getPackageName() + "/" + image.get(position);
                intent.putExtra("imageView", imageView);*/

                intent.putExtra("textViewTitle", title.get(position));
                intent.putExtra("categories", categories.get(position));
                intent.putExtra("details", details.get(position));
                intent.putExtra("textViewRating", rating.get(position));
                intent.putExtra("AppsSize", appsize.get(position));
                intent.putExtra("downloaded", download.get(position));

                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return title.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView categories;
        TextView details;
        TextView rating;
        TextView appsize;
        TextView download;
        ImageView image;
        LinearLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //list_Vertical
            title = itemView.findViewById(R.id.textViewTitle);
            categories = itemView.findViewById(R.id.categories);
            details = itemView.findViewById(R.id.details);
            rating = itemView.findViewById(R.id.textViewRating);
            appsize = itemView.findViewById(R.id.AppsSize);
            download = itemView.findViewById(R.id.downloaded);

            image = itemView.findViewById(R.id.imageView);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }

    }
}
