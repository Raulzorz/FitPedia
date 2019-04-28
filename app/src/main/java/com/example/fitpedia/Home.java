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
import android.widget.TableRow;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TableRow bt;
    TableRow bt2;
    TableRow bt3;
    ImageButton btn6;
    ImageButton btn7;
    ImageButton btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        bt = findViewById(R.id.bt);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, com.example.fitpedia.Exercises.class);
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, com.example.fitpedia.Nutrition.class);
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, com.example.fitpedia.You.class);
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, com.example.fitpedia.Exercises.class);
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, com.example.fitpedia.Nutrition.class);
                startActivity(intent);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, com.example.fitpedia.You.class);
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
        getMenuInflater().inflate(R.menu.home, menu);
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

        if (id == R.id.exercises) {
            Intent intent = new Intent(Home.this, com.example.fitpedia.Exercises.class);
            startActivity(intent);
        } else if (id == R.id.workouts) {


        } else if (id == R.id.nutrition) {
            Intent intent = new Intent(Home.this, com.example.fitpedia.Nutrition.class);
            startActivity(intent);

        } else if (id == R.id.calculator) {
            Intent intent = new Intent(Home.this, com.example.fitpedia.You.class);
            startActivity(intent);

        } else if (id == R.id.contact) {

            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:93832983"));
            startActivity(intent);

        } else if (id == R.id.gym) {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0.0?q=61 Egegårdsvej, Rødovre, Denmark"));
            startActivity(intent);

        } else if (id == R.id.rate)
        {
            Intent intent = new Intent(Home.this, com.example.fitpedia.Rate.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
