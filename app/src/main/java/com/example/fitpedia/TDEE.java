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
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class TDEE extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdee);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        final EditText in;
        final EditText out;
        Button b1;
        Button b2;
        Button b3;
        Button b4;
        final DecimalFormat format;

        in = findViewById(R.id.in);
        out = findViewById(R.id.out);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);

        out.setVisibility(View.GONE);
        format = new DecimalFormat("#0");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (in.getText().toString().isEmpty()) {
                    Toast.makeText(TDEE.this, " please enter BMR", Toast.LENGTH_SHORT).show();
                } else {
                    int bob = Integer.parseInt(in.getText().toString().trim());

                    double tdee1 = bob * 1.2;

                    String res = format.format(tdee1) + " Calories ";

                    out.setText(res);
                }
                out.setVisibility(View.VISIBLE);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (in.getText().toString().isEmpty()) {
                    Toast.makeText(TDEE.this, " please enter BMR", Toast.LENGTH_SHORT).show();
                } else {
                    int bob = Integer.parseInt(in.getText().toString().trim());

                    double tdee2 = bob * 1.4;

                    String res1 = format.format(tdee2) + " Calories ";

                    out.setText(res1);
                }
                out.setVisibility(View.VISIBLE);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (in.getText().toString().isEmpty()) {
                    Toast.makeText(TDEE.this, " please enter BMR", Toast.LENGTH_SHORT).show();
                } else {
                    int bob = Integer.parseInt(in.getText().toString().trim());

                    double tdee2 = bob * 1.6;

                    String res2 = format.format(tdee2) + " Calories ";

                    out.setText(res2);
                }
                out.setVisibility(View.VISIBLE);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (in.getText().toString().isEmpty()) {
                    Toast.makeText(TDEE.this, " please enter BMR", Toast.LENGTH_SHORT).show();
                } else {
                    int bob = Integer.parseInt(in.getText().toString().trim());

                    double tdee3 = bob * 1.9;

                    String res3 = format.format(tdee3) + " Calories ";

                    out.setText(res3);
                }
                out.setVisibility(View.VISIBLE);
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
        getMenuInflater().inflate(R.menu.tdee, menu);
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

        if (id == R.id.exercises7) {
            Intent intent = new Intent(TDEE.this, com.example.fitpedia.Exercises.class);
            startActivity(intent);
        } else if (id == R.id.workouts7) {


        } else if (id == R.id.nutrition7) {
            Intent intent = new Intent(TDEE.this, com.example.fitpedia.Nutrition.class);
            startActivity(intent);

        } else if (id == R.id.calculator7) {
            Intent intent = new Intent(TDEE.this, com.example.fitpedia.You.class);
            startActivity(intent);

        } else if (id == R.id.contact7) {

            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:93832983"));
            startActivity(intent);

        } else if (id == R.id.gym7) {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0.0?q=61 Egegårdsvej, Rødovre, Denmark"));
            startActivity(intent);

        } else if (id == R.id.rate7){
            Intent intent = new Intent(TDEE.this, com.example.fitpedia.Rate.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
