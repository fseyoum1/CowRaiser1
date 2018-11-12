package io.github.jkim3213.cowraiser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public abstract class ChallengeActivity extends AppCompatActivity {

    protected TextView challengeTitle;
    protected TextView challengeDesc;
    protected Button logButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);

        challengeTitle = findViewById(R.id.challengeTitle);
        challengeDesc = findViewById(R.id.challengeDesc);
        logButton = findViewById(R.id.logButton);

    }


}
