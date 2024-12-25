package com.stamasoftlab.playstoreclone_withtabnav.TopChart;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.stamasoftlab.playstoreclone_withtabnav.R;

public class TopCharts_DetailPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.top_charts_detail_page);
/*        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
        getIncomingIntent();
    }


    private void getIncomingIntent(){

        //get
        if(getIntent().hasExtra("imageView") && getIntent().hasExtra("textViewTitle") && getIntent().hasExtra("categories") && getIntent().hasExtra("details") && getIntent().hasExtra("textViewRating")&& getIntent().hasExtra("AppsSize")&& getIntent().hasExtra("downloaded")){
         //  int imageView = getIntent().getIntExtra("imageView", R.drawable.ic_launcher_background);
            //int imageResId = getResources().getIdentifier(imageView, "drawable", getPackageName());
            int imageView = getIntent().getIntExtra("imageView", R.drawable.ic_launcher_background);

            String textViewTitle = getIntent().getStringExtra("textViewTitle");
            String categories = getIntent().getStringExtra("categories");
            String details = getIntent().getStringExtra("details");
            String textViewRating = getIntent().getStringExtra("textViewRating");
            String AppsSize = getIntent().getStringExtra("AppsSize");
            String downloaded = getIntent().getStringExtra("downloaded");

            //setImage(imageUrl, imageName);
            //Find Id
            ImageView imageView_V = findViewById(R.id.imageView);
            TextView textViewTitle_V = findViewById(R.id.textViewTitle);
            TextView categories_V = findViewById(R.id.categories);
            TextView details_V = findViewById(R.id.details);
            TextView textViewRating_V = findViewById(R.id.textViewRating);
            TextView AppsSize_V = findViewById(R.id.AppsSize);
            TextView downloaded_V = findViewById(R.id.downloaded);

            //set

            imageView_V.setImageResource(imageView);
            textViewTitle_V.setText(textViewTitle);
            categories_V.setText(categories);
            details_V.setText(details);
            textViewRating_V.setText(textViewRating);
            AppsSize_V.setText(AppsSize);
            downloaded_V.setText(downloaded);

        }
    }

}