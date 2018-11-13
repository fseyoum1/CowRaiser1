package io.github.jkim3213.cowraiser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreActivity extends AppCompatActivity {

    RecyclerView rv;
    TextView ecodollars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        rv = findViewById(R.id.storeItems);
        ecodollars = findViewById(R.id.ecoDollars);
        ecodollars.setText(getString(R.string.num_ecodollars, UserProfile.ecoDollars));
        //populate
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(linearLayoutManager);
        //get images and names from database...
        final String[] itemNamesArr = {"Maple Tree", "Apple Tree", "Pine Tree"};
        final int[] itemImagesId = {R.drawable.co2, R.drawable.co2, R.drawable.co2};
        final int[] itemCost = {5, 3, 7};

        List<StoreItem> items = new ArrayList<>();
        for(int i = 0; i < itemImagesId.length; i++) {
            items.add(new StoreItem(itemNamesArr[i], itemImagesId[i], itemCost[i]));
        }

        StoreAdapter storeAdapter = new StoreAdapter(this, items);
        rv.setAdapter(storeAdapter);


    }
}
