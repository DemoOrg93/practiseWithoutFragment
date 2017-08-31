package com.sonika.abcd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView_name, textView_desc, textView_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageView = (ImageView) findViewById(R.id.image);
        textView_name = (TextView) findViewById(R.id.tv_name);
        textView_desc = (TextView) findViewById(R.id.tv_desc);
        textView_price = (TextView) findViewById(R.id.tv_price);
    }
}
