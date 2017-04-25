package com.noor.glidelibraryexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageLoad extends AppCompatActivity {

    ImageView loadImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_load);

        loadImage=(ImageView)findViewById(R.id.imgLoad);

        Glide.with(this)
                .load("http://media1.santabanta.com/full5/Indian%20%20Celebrities(M)/Salman%20Khan/salman-khan-39a.jpg")  // img url
                .placeholder(R.drawable.load_image)
                .error(R.drawable.not_found)
                .into(loadImage);





    }
}
