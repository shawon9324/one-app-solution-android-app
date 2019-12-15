package com.example.oneappsolution;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import java.util.List;

public class AdapterCategories extends BaseAdapter {

    private Context context;
    private List<Categories> categoriesList;

    public AdapterCategories(Context context, List<Categories> categoriesList) {
        this.context = context;
        this.categoriesList = categoriesList;
    }

    @Override
    public int getCount() {
        return categoriesList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Categories categories = categoriesList.get(position);

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.card_apps, null);

        final ImageView image = (ImageView) convertView.findViewById(R.id.image);
        final TextView category = (TextView) convertView.findViewById(R.id.category);
        final CardView card_category = (CardView) convertView.findViewById(R.id.category_card);

        image.setImageResource(categories.getImage());
        category.setText(categories.getCategory());

        return convertView;
    }
}
