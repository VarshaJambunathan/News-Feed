package com.example.varsha.newsfeed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by Varsha on 03-12-2016.
 */

public class GuardianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guardian_activity);

        List<Guardian> guardianList = QueryUtils.extractFeatureFromJson()
    }
}
