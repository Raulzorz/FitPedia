package com.example.fitpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ImageButton;

public class Exercises extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton bac;
    ImageButton chest;
    ImageButton arms;
    ImageButton legs;
    ImageButton abs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        bac = findViewById(R.id.bac);
        chest = findViewById(R.id.chest);
        arms = findViewById(R.id.arms);
        legs = findViewById(R.id.legs);
        abs = findViewById(R.id.abs);

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Exercises.this, com.example.fitpedia.Bac.class);
                startActivity(intent);

            }
        });

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Exercises.this,com.example.fitpedia.Chest.class);
                startActivity(intent);

            }
        });

        arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Exercises.this, com.example.fitpedia.Arms.class);
                startActivity(intent);

            }
        });

        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Exercises.this, com.example.fitpedia.Legs.class);
                startActivity(intent);
            }
        });

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Exercises.this, com.example.fitpedia.Abs.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.exercises, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.exercises1) {

            Intent intent = new Intent(Exercises.this, com.example.fitpedia.Exercises.class);
            startActivity(intent);

        } else if (id == R.id.workouts1) {

        } else if (id == R.id.nutrition1) {

            Intent intent = new Intent(Exercises.this, com.example.fitpedia.Nutrition.class);
            startActivity(intent);

        } else if (id == R.id.calculator1) {
            Intent intent = new Intent(Exercises.this, com.example.fitpedia.You.class);
            startActivity(intent);

        } else if (id == R.id.contact1) {

            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:93832983"));
            startActivity(intent);

        } else if (id == R.id.gym1) {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0.0q?=61 Egegårdsvej, Rødovre, Denmark"));
            startActivity(intent);

        } else if (id == R.id.rate1){
            Intent intent = new Intent(Exercises.this, com.example.fitpedia.Rate.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
