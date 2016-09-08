package com.endorphinapps.kemikal.djsdinos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Dino Picker
    private ViewPager viewPager;
    //Nav Drawer
    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find all Views
        findViews();

        //Nav Drawer Setup
        addDrawerItemsAndListener();

        //Bind the 'Dino Picker' ViewPager to the Adapter
        viewPager.setAdapter(new CustomAdapter(this));
    }

    //Initialise all Views
    public void findViews() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        mDrawerList = (ListView) findViewById(R.id.nav_listView);
    }

    //Add list items to the nav drawer and setup click listener
    private void addDrawerItemsAndListener() {
        String[] osArray = getResources().getStringArray(R.array.navArray);
        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int resource = 0;

                switch (position) {
                    case 0:
                        resource = R.string.abelisaurus;
                        break;
                    case 1:
                        resource = R.string.agustinia;
                        break;
                    case 2:
                        resource = R.string.compsognathus;
                        break;
                    case 3 :
                        resource = R.string.diplodocus;
                        break;
                    case 4 :
                        resource = R.string.spinosaurus;
                        break;
                    case 5 :
                        resource = R.string.stegosaurus;
                        break;
                    case 6 :
                        resource = R.string.triceratops;
                        break;
                    case 7 :
                        resource = R.string.tyrannosaurus;
                        break;
                    case 8 :
                        resource = R.string.velociraptor;
                        break;
                }
                String name = view.getResources().getString(resource);

                Intent intent = new Intent(getApplicationContext(), DinosaurActivity.class);
                intent.putExtra("EXTRAS_NAME", name);
                startActivity(intent);
            }
        });
    }
}