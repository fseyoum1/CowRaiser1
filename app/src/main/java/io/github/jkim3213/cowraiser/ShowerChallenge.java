package io.github.jkim3213.cowraiser;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ShowerChallenge extends ChallengeActivity {

    private final int ecoDollars = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        challengeTitle.setText(R.string.shower_title);
        challengeDesc.setText(R.string.shower_desc);
        logButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String complete = getString(R.string.challenge_complete_toast, ecoDollars);
                Toast.makeText(getApplicationContext(), complete, Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
