package com.endorphinapps.kemikal.djsdinos;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find all Views
        findViews();

        //Bind the ViewPager to the Adapter
        viewPager.setAdapter(new CustomAdapter(this));
    }

    //Initialise all Views
    public void findViews() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
    }
}
