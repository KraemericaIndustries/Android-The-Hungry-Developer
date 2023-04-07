package com.kraemericaindustries.thehungrydeveloper2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
public class MainActivity extends AppCompatActivity {
    CardView startersCard;
    CardView mainsCard;
    CardView dessertsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);
        dessertsCard = findViewById(R.id.card_view_desserts);

        startersCard.setOnClickListener(view -> {
            Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
            startActivity(startersActivityIntent);
        });

        mainsCard.setOnClickListener(view -> {
            Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
            startActivity(mainCoursesActivityIntent);
        });

        dessertsCard.setOnClickListener(view -> {
            Intent dessertsActivityIntent = new Intent(MainActivity.this, DessertsActivity.class);
            startActivity(dessertsActivityIntent);
        });

        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(view -> {
            Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
            launchEmailAppIntent.setData(Uri.parse("mailto:bob.kraemer.android@gmail.com"));  //  Only email apps should handle this
            startActivity(launchEmailAppIntent);
        });
    }
}