package com.example.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.Objects;

public class Details extends AppCompatActivity {

    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_OVERVIEW = "extra_overview";
    public static final String EXTRA_LINK = "extra_link";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView titleDetail = findViewById(R.id.detail_title);
        TextView overviewDetail = findViewById(R.id.detail_overview);
        ImageView imageDetail = findViewById(R.id.detail_image);

        String title = getIntent().getStringExtra(EXTRA_TITLE);
        String overview = getIntent().getStringExtra(EXTRA_OVERVIEW);
        int image = getIntent().getIntExtra(EXTRA_LINK, 0);

        titleDetail.setText(title);
        overviewDetail.setText(overview);
        Glide.with(this)
                .load(image)
                .apply(new RequestOptions())
                .into(imageDetail);

        Objects.requireNonNull(getSupportActionBar()).setTitle(title);
        getSupportActionBar().show();
    }
}
