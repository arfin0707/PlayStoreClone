package com.stamasoftlab.playstoreclone_withtabnav.Children;

import android.annotation.SuppressLint;
import android.content.Context;
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

    public class ChildrenAdapter extends RecyclerView.Adapter<ChildrenAdapter.ViewHolder> {

        private Context mContext;
        private ArrayList<Integer> imageView ;
        private ArrayList<String> title;
        private ArrayList<String> textViewRating;

        public ChildrenAdapter(Context mContext, ArrayList<Integer> imageView, ArrayList<String> title, ArrayList<String> textViewRating) {
            this.mContext = mContext;
            this.imageView = imageView;
            this.title = title;
            this.textViewRating = textViewRating;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.children_customlayout, parent, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;    }

        @Override
        public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") final int position) {

            holder.imageView.setImageResource(imageView.get(position));
            holder.title.setText(title.get(position));
            holder.textViewRating.setText(textViewRating.get(position));
/*        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.image);*/
            // holder.image_details.setText(mimage_details.get(position));



/*        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, DetailPage.class);

                intent.putExtra("image_url", mImages.get(position));
                intent.putExtra("image_name", mImageNames.get(position));

                mContext.startActivity(intent);

            }
        });*/


        }

        @Override
        public int getItemCount() {
            return title.size();
        }



        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView title;
            TextView textViewRating;
            LinearLayout parentLayout;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                //list_Vertical
                imageView = itemView.findViewById(R.id.imageView);
                title = itemView.findViewById(R.id.title);
                textViewRating = itemView.findViewById(R.id.textViewRating);
                parentLayout = itemView.findViewById(R.id.parent_layout);

            }

        }
    }


