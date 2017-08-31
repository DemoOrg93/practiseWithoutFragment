package com.sonika.abcd.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.sonika.abcd.DetailsActivity;
import com.sonika.abcd.Pojo.ProductObject;
import com.sonika.abcd.ProductHolder;
import com.sonika.abcd.R;
import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Created by sonika on 8/30/2017.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductHolder> {

    public Context context;
    private List<ProductObject> productList;

    public ProductAdapter(Context context, List<ProductObject> productList) {
        this.context = context;
        this.productList = productList;
    }

    @Override
    public ProductHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate
                (R.layout.product_item_list, parent, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show();
                context.startActivity(new Intent(context,DetailsActivity.class));
            }
        });
        return new ProductHolder(view);

    }


    @Override
    public void onBindViewHolder(ProductHolder holder, int position) {

        holder.productName.setText("Product Name : " + productList.get(position).getName());
        holder.productPrice.setText("Product Price : " + productList.get(position).getPrice());

        Picasso.with(context).load(productList.get(position).getImage()).into(holder.productImage);


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
