package com.kraemericaindustries.thehungrydeveloper2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class MainCoursesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);
        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] mainCourses = {
                new Dish("Main1", "first", 7),
                new Dish("Main2", "second", 6),
                new Dish("Main3", "third", 9),
                new Dish("Main4", "fourth", 12),
                new Dish("Main5", "fifth", 4)
        };

        ArrayAdapter<Dish> mainCoursesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);
        mainCoursesList.setAdapter(mainCoursesAdapter);
    }
}