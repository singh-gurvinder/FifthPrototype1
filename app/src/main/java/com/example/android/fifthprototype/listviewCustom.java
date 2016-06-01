package com.example.android.fifthprototype;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Gurvinder on 27-05-2016.
 */
public class listviewCustom extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    public listviewCustom(Activity context,
                      String[] web, Integer[] imageId) {
        super(context, R.layout.list_view_item, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
    }

    public View getView(int position,View view,ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rootview=inflater.inflate(R.layout.list_view_item, null, true);
        TextView txtview=(TextView)rootview.findViewById(R.id.txt);

        ImageView imgview=(ImageView)rootview.findViewById(R.id.img);
        txtview.setText(web[position]);

        imgview.setImageResource(imageId[position]);
        return rootview;
    }
}
