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
        arrayList.add("Vegetarian Meal");
        arrayList.add("Turn Off the Light");
        arrayList.add("Alternative Transport");
        arrayList.add("6 Minute Shower");
        arrayList.add("Do not touch my Rice");
        arrayList.add("Public Transportation");
        arrayList.add("Continue.....");
        arrayList.add("Vegetarian Meal");
        arrayList.add("Turn Off the Light");
        arrayList.add("Alternative Transport");
        arrayList.add("6 Minute Shower");
        arrayList.add("Do not touch my Rice");
        arrayList.add("Public Transportation");
        arrayList.add("Continue.....");
        arrayList.add("Vegetarian Meal");
        arrayList.add("Turn Off the Light");
        arrayList.add("Alternative Transport");
        arrayList.add("6 Minute Shower");
        arrayList.add("Do not touch my Rice");
        arrayList.add("Public Transportation");
        arrayList.add("Continue.....");




        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        myListView.setAdapter(arrayAdapter);

        Toast.makeText(getApplicationContext(), "Welcome to Activities screen.", Toast.LENGTH_LONG).show();

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = null;
                switch(position) {
                    case 0:
                        intent = new Intent(getApplicationContext(), ChallengeActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "Welcome to the challenge screen.", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), ChallengeActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "Welcome to the challenge screen.", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), ChallengeActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "Welcome to the challenge screen.", Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), ChallengeActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "Welcome to the challenge screen.", Toast.LENGTH_LONG).show();
                        break;

                    case 4:
                        intent = new Intent(getApplicationContext(), ChallengeActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "Welcome to the challenge screen.", Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), ChallengeActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "Welcome to the challenge screen.", Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), ChallengeActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "Welcome to the challenge screen.", Toast.LENGTH_LONG).show();
                        break;
                    default:
                }


            }
        });

    }



}
