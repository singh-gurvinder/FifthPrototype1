package com.example.android.fifthprototype;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class single_info extends AppCompatActivity {

    int pri;
    int pos;
    String address,description;

    Integer[] imageId={
            R.drawable.back1,
            R.drawable.h1,
            R.drawable.k1,
    };

    Integer[] ImageId2={ R.drawable.download,
            R.drawable.h2,R.drawable.k2};
    Integer[] ImageId3={ R.drawable.downloa,
            R.drawable.h3,R.drawable.k3};
    Integer[] ImageId4={ R.drawable.back2,
            R.drawable.h4,R.drawable.k4};
    Integer[] ImageId5={ R.drawable.so,
            R.drawable.h5,R.drawable.k5};

    Integer imaged[][]={imageId,ImageId2,ImageId3,ImageId4,ImageId5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_info);
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

        Intent sharing_rinfo=getIntent();
        if(null!=sharing_rinfo) {

            pos=sharing_rinfo.getIntExtra("pos",0);
            address=sharing_rinfo.getStringExtra("add");
            pri=sharing_rinfo.getIntExtra("pri", 0);
            description=sharing_rinfo.getStringExtra("description");
        }


        LinearLayout layout = (LinearLayout) findViewById(R.id.linear);
        for (int i=0;i<3;i++) {
            ImageView imageView = new ImageView(this);
            imageView.setId(i);
            imageView.setPadding(2, 2, 2, 2);
            imageView.setImageBitmap(BitmapFactory.decodeResource(
                    getResources(), imaged[pos][i]));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            layout.addView(imageView);
        }


        TextView txtpri=(TextView)findViewById(R.id.price);
        txtpri.setText("Rs"+pri);

        TextView txtadd=(TextView)findViewById(R.id.desc);
        txtadd.setText(address);

        TextView txtdesc=(TextView)findViewById(R.id.description);
        txtdesc.setText(description);
    }

}

