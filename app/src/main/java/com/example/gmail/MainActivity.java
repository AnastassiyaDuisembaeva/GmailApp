package com.example.gmail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Item> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        DataAdapter adapter = new DataAdapter(this, items);
        recyclerView.setAdapter(adapter);

    }
    private void setInitialData(){

        items.add(new Item ("Gmail", "Hello! Subscribe to our newsletter and receive more messages", "20 apr.", R.drawable.mail, R.drawable.ic_star_border_black_24dp));
        items.add(new Item ("Gmail", "Ilon Musk is the coolest, buy Tesla", "21 apr.", R.drawable.mail, R.drawable.ic_star_border_black_24dp));
        items.add(new Item ("Gmail", "No ads, only useful content. ", "22 apr.", R.drawable.mail, R.drawable.ic_star_border_black_24dp));
        items.add(new Item ("Gmail", "But, if you're interested, there are discounts in Kari", "23 apr.", R.drawable.mail, R.drawable.ic_star_border_black_24dp));
        items.add(new Item ("Gmail", "Hello! In investing for you a lot of interesting things.", "24 apr.", R.drawable.mail, R.drawable.ic_star_border_black_24dp));

    }
}
