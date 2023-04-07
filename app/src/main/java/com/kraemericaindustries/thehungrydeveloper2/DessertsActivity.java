package com.kraemericaindustries.thehungrydeveloper2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class DessertsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {
                new Dish("Apple Pie", "descr1", 1199),
                new Dish("PB Rice Krispies Squares", "yum", 399),
                new Dish("Ice Cream", "Brr!", 499),
                new Dish("DQ Blizzard", "More Brr!", 99),
                new Dish("Apple Sauce", "Sweet", 199)
        };
        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);
        dessertsList.setAdapter(dishesAdapter);
    }
}