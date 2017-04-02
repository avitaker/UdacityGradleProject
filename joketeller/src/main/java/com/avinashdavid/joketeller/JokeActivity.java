package com.avinashdavid.joketeller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "jokeExtra";
    private Intent mIntent;
    private String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        mIntent = getIntent();
        if (mIntent!=null){
            mJoke = mIntent.getStringExtra(EXTRA_JOKE);
            if (null!=mJoke) {
                ((TextView) findViewById(R.id.jokeTextView)).setText(mJoke);
            } else {
                ((TextView) findViewById(R.id.jokeTextView)).setText(getString(R.string.joke_error));
            }
        }
    }
}
