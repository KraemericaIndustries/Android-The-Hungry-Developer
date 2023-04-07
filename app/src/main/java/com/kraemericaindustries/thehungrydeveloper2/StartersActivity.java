package com.kraemericaindustries.thehungrydeveloper2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish[] dishes = {
                new Dish("Mushroom and tofu maki", "descr1", 999),
                new Dish("Kraft Dinner", "Mac and Cheese", 199),
                new Dish("Spajetti", "Noodles and marinara", 1299),
                new Dish("Hot Dogs", "tube steaks and buns", 599),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799),
                new Dish("Pizza", "pep and cheese", 1799)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(dishesAdapter);
    }
}