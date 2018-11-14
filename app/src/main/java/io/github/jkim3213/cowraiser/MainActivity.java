package io.github.jkim3213.cowraiser;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



        ListView myListView = findViewById(R.id.myListView);

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(getString(R.string.vegetarian_title));
        arrayList.add(getString(R.string.light_title));
        arrayList.add(getString(R.string.altertransport_title));
        arrayList.add(getString(R.string.shower_title));
        arrayList.add(getString(R.string.rice_title));
        arrayList.add(getString(R.string.publtransport_title));




        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        myListView.setAdapter(arrayAdapter);

        Toast.makeText(getApplicationContext(), "Welcome to Activities screen.", Toast.LENGTH_LONG).show();

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = null;
                switch(position) {
                    case 0:
                        intent = new Intent(getApplicationContext(), VegetarianChallenge.class);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), LightChallenge.class);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), AltTransportChallenge.class);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), ShowerChallenge.class);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), StoreActivity.class);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), StatisticsActivity.class);
                        break;

                    default:
                        System.err.println("Broken Activity");
                }
                startActivity(intent);


            }
        });

    }



}
