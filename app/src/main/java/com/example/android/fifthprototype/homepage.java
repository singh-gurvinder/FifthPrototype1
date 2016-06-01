package com.example.android.fifthprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    Intent intent = getIntent();
    Intent intent_register = getIntent();
    Intent intenthome = getIntent();


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
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
        } else if (id == R.id.action_home) {
            Intent intenthome = new Intent(this, homepage.class);
            startActivity(intenthome);
        } else if (id == R.id.action_search) {
            Intent intent_search = new Intent(this, MapsActivity.class);
            startActivity(intent_search);
        } else if (id == R.id.action_fav) {
            Intent saved_search = new Intent(this, saved_search.class);
            startActivity(saved_search);
        }


        return super.onOptionsItemSelected(item);
    }

    public void filter(View view) {

        Intent filter = new Intent(this, Filter_search.class);
        startActivity(filter);
    }

    public void single(View view) {
        Intent single = new Intent(this, single.class);
        startActivity(single);
    }

    public void sharing(View view){
        Intent sharing=new Intent(this,sharing.class);
        startActivity(sharing);
    }
}


