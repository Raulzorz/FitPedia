package com.example.fitpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;

public class Legs extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerView rv;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Product3> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        rv =findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rv .setLayoutManager(layoutManager);

        items = new ArrayList<Product3>();

        items.add(new Product3("Leg Press", "ex1"));
        items.add(new Product3("Squat" , "ex2"));
        items.add(new Product3("Lunges", "ex1"));

        myAdapter = new Product3Adapter(Legs.this, items);

        rv.setAdapter(myAdapter);
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
        getMenuInflater().inflate(R.menu.legs, menu);
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

        if (id == R.id.exercises14) {

            Intent intent = new Intent(Legs.this, com.example.fitpedia.Exercises.class);
            startActivity(intent);

        } else if (id == R.id.workouts14) {

        } else if (id == R.id.nutrition14) {

            Intent intent = new Intent(Legs.this, com.example.fitpedia.Nutrition.class);
            startActivity(intent);

        } else if (id == R.id.calculator14) {

            Intent intent = new Intent(Legs.this, com.example.fitpedia.You.class);
            startActivity(intent);

        } else if (id == R.id.contact14) {

            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:93832983"));
            startActivity(intent);

        } else if (id == R.id.gym14) {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0.0q?=61 Egegårdsvej, Rødovre, Denmark"));
            startActivity(intent);

        } else if (id == R.id.rate14){
            Intent intent = new Intent(Legs.this, com.example.fitpedia.Rate.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
