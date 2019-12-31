package com.example.submission1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMovies;
    private ArrayList<Movie> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovies = findViewById(R.id.rv_heroes);
        rvMovies.setHasFixedSize(true);

        list.addAll(MovieData.getListData());
        showRecyclerList();
    }

    private void showSelectedMovie(Movie movie) {
        Toast.makeText(this, "Kamu memilih " + movie.getTitle(), Toast.LENGTH_SHORT).show();
    }

    private void showRecyclerList() {
        rvMovies.setLayoutManager(new LinearLayoutManager(this));
        MovieAdapter movieAdapter = new MovieAdapter(list);
        rvMovies.setAdapter(movieAdapter);

        movieAdapter.setOnItemClickCallback(new MovieAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Movie data) {
                showSelectedMovie(data);
                Intent intent = new Intent(MainActivity.this, Details.class);
                intent.putExtra(Details.EXTRA_TITLE, data.getTitle());
                intent.putExtra(Details.EXTRA_OVERVIEW, data.getOverview());
                intent.putExtra(Details.EXTRA_LINK, data.getPhoto());
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void about(){
        Intent intent = new Intent(getApplicationContext(), About.class);
        startActivity(intent);
    }

    private void setMode(int itemId) {
        switch (itemId) {
            case R.id.about:
                about();
                break;
        }
    }
}
