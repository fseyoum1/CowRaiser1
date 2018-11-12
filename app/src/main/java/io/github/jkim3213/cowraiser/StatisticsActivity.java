package io.github.jkim3213.cowraiser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class StatisticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        TextView numCarbonLbs = findViewById(R.id.carbonLbs);
        numCarbonLbs.setText(getString(R.string.num_carbon_lbs, UserProfile.carbonLbs));
    }
}
