package com.sonika.abcd;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sonika on 8/30/2017.
 */


public class ProductHolder extends RecyclerView.ViewHolder{
    public ImageView productImage;
    public TextView productName,productPrice;



    public ProductHolder(View itemView) {
        super(itemView);

        productImage = (ImageView)itemView.findViewById(R.id.product_image);
        productName = (TextView)itemView.findViewById(R.id.product_name);
        productPrice = (TextView)itemView.findViewById(R.id.product_price);
    }



}