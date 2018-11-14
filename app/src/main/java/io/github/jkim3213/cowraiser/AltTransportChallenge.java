package io.github.jkim3213.cowraiser;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AltTransportChallenge extends ChallengeActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        challengeTitle.setText(R.string.altertransport_title);
        challengeDesc.setText(R.string.altertransport_desc);
        carbonLbs = 6;
        ecoDollars = 12;
    }
}
