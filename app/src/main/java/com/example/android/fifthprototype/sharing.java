package com.example.android.fifthprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class sharing extends AppCompatActivity {

    String EXTRA_ID="Arr_id";
    String EXTRA_ARRAY="imageId";
    String[] web={
            "c-3/374 Janak Puri" +
                    "2BHK,1Bath",
            "c-3/375 Janak Puri"+
                    "1BHK,1Bath",
            "c-5A 28B Jankak Puri"+"3BHK,2Bath" ,
            "26 Janpat"+"4BHK,3Bath",
            "c-3/374 Janak Puri" +
                    "1BHK,1Bath"
    };

    Integer[] imageId={
            R.drawable.back1,
            R.drawable.download,
            R.drawable.downloa,
            R.drawable.back2,
            R.drawable.so

    };
    int[] price={150000,250000,458896,261252,4785236};

    String[] description={
            String.valueOf(R.string.back1),
            String.valueOf(R.string.back1),
            String.valueOf(R.string.back1),
            String.valueOf(R.string.back1),
            String.valueOf(R.string.back1)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharing);
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

        final Intent sharing=getIntent();

        listviewCustom adapter = new
                listviewCustom(sharing.this, web, imageId);
        ListView list=(ListView)findViewById(R.id.list_view_sharing);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(sharing.this, "You Clicked at " + web[+position], Toast.LENGTH_SHORT).show();
                Intent sharing_info=new Intent(sharing.this,sharing_info.class);
                sharing_info.putExtra("pos",position);
                sharing_info.putExtra("add",web[position]);
                sharing_info.putExtra("pri",price[position]);
                sharing_info.putExtra("description",description[position]);
                startActivity(sharing_info);

            }
        });

    }

}


