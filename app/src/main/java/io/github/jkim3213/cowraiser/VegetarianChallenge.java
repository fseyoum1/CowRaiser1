package io.github.jkim3213.cowraiser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class VegetarianChallenge extends ChallengeActivity {

    private final int ecoDollars = 6;
    private final int carbonLbs = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        challengeTitle.setText(R.string.vegetarian_title);
        challengeDesc.setText(R.string.vegetarian_desc);
        logButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                UserProfile.carbonLbs += carbonLbs;
                String complete = getString(R.string.challenge_complete_toast, ecoDollars);
                Toast.makeText(getApplicationContext(), complete, Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
