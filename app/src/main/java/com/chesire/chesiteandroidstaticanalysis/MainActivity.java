package com.chesire.chesiteandroidstaticanalysis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String mCausePmdIssue = "Using this string inside the post below will cause an issue";
    public String mFindBugsIssue = "Having this string public will cause a FindBugs issue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().post(new Runnable() {
            @Override
            public void run() {
                Log.d("Tag", mCausePmdIssue);
            }
        });
    }
}
