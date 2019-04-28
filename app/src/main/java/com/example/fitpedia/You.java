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
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class You extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        final EditText weight;
        Button BTTN;
        final TextView TXT;
        final DecimalFormat format;

        final EditText height;
        final EditText age;
        Button WB;
        Button tdee;



        weight = findViewById(R.id.weight);
        BTTN = findViewById(R.id.BTTN);
        TXT = findViewById(R.id.TXT);

        height = findViewById(R.id.height);
        age = findViewById(R.id.age);
        WB = findViewById(R.id.WB);
        tdee = findViewById(R.id.tdee);

        TXT.setVisibility(View.GONE);
        format = new DecimalFormat("#0");

        BTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (weight.getText().toString().isEmpty()) {
                    Toast.makeText(You.this, " please enter weight", Toast.LENGTH_SHORT).show();
                } else {
                    if (height.getText().toString().isEmpty()) {
                        Toast.makeText(You.this, " please enter height", Toast.LENGTH_SHORT).show();
                    } else {
                        if (age.getText().toString().isEmpty()) {
                            Toast.makeText(You.this, " please enter age", Toast.LENGTH_SHORT).show();
                        } else {
                            int bob = Integer.parseInt(weight.getText().toString().trim());
                            int bob2 = Integer.parseInt(height.getText().toString().trim());
                            int bob3 = Integer.parseInt(age.getText().toString().trim());

                            double bmr = 10 * bob + 6.25 * bob2 - 5 * bob3 + 5;

                            String res = format.format(bmr) + " Calories";

                            TXT.setText(res);
                        }

                        TXT.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

        WB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (weight.getText().toString().isEmpty()) {
                    Toast.makeText(You.this, " please enter weight", Toast.LENGTH_SHORT).show();
                } else {
                    if (height.getText().toString().isEmpty()) {
                        Toast.makeText(You.this, " please enter height", Toast.LENGTH_SHORT).show();
                    } else {
                        if (age.getText().toString().isEmpty()) {
                            Toast.makeText(You.this, " please enter age", Toast.LENGTH_SHORT).show();
                        } else {
                            int bob = Integer.parseInt(weight.getText().toString().trim());
                            int bob2 = Integer.parseInt(height.getText().toString().trim());
                            int bob3 = Integer.parseInt(age.getText().toString().trim());

                            double bmr = 10 * bob + 6.25 * bob2 - 5 * bob3 -161;

                            String res = format.format(bmr) + " Calories";

                            TXT.setText(res);
                        }

                        TXT.setVisibility(View.VISIBLE);
                    }
                }

            }
        });

        tdee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent = new Intent(You.this, com.example.fitpedia.TDEE.class);
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
        getMenuInflater().inflate(R.menu.you, menu);
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

        if (id == R.id.exercises6) {

            Intent intent = new Intent(You.this, com.example.fitpedia.Exercises.class);
            startActivity(intent);
        } else if (id == R.id.workouts6) {

        } else if (id == R.id.nutrition6) {

            Intent intent = new Intent(You.this, com.example.fitpedia.Nutrition.class);
            startActivity(intent);

        } else if (id == R.id.calculator6) {

            Intent intent = new Intent(You.this, com.example.fitpedia.You.class);
            startActivity(intent);

        } else if (id == R.id.contact6) {

            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:93832983"));
            startActivity(intent);

        } else if (id == R.id.gym6) {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0.0?q=61 Egegårdsvej, Rødovre, Denmark"));
            startActivity(intent);

        } else if (id == R.id.rate6){
            Intent intent = new Intent(You.this, com.example.fitpedia.Rate.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
