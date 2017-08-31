package com.sonika.abcd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sonika.abcd.Pojo.ProductObject;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView_name, textView_desc, textView_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        final ProductObject productObject = (ProductObject) getIntent().getSerializableExtra("hello");

        imageView = (ImageView) findViewById(R.id.image);
        textView_name = (TextView) findViewById(R.id.tv_name);
        textView_desc = (TextView) findViewById(R.id.tv_desc);
        textView_price = (TextView) findViewById(R.id.tv_price);

        Glide.with(DetailsActivity.this).load(productObject.getImage()).into(imageView);
        textView_desc.setText(productObject.getDescription());
        textView_price.setText(productObject.getPrice());
        textView_name.setText(productObject.getName());
    }
}
