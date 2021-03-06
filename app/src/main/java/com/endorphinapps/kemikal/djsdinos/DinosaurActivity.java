package com.endorphinapps.kemikal.djsdinos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DinosaurActivity extends AppCompatActivity {

    private TextView tv_dino_name;
    private TextView tv_dino_pronunciation;
    private ImageView iv_dino_image;
    private TextView tv_fact_meaning;
    private TextView tv_fact_date;
    private TextView tv_fact_group;
    private TextView tv_fact_diet;
    private TextView tv_fact_size;
    private TextView tv_fact_fossilLocation;
    private TextView tv_dino_info;
    private ImageView iv_dino_map;
    //Nav Drawer
    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinosaur);

        //Find all Views
        findViews();

        //Nav Drawer
        addDrawerItemsAndListener();

        /**
         * Get extras from Intent and use to determine which dinosaur the views need to be set to
         */
        //Name
        Intent intent = getIntent();
        String name = intent.getStringExtra("EXTRAS_NAME");
        //Pronunciation
        String pronunciation = null;
        //Image
        int image = 0;
        //Quick Facts
        String fact_meaning = null,
                fact_date = null,
                fact_group = null,
                fact_diet = null,
                fact_size = null,
                fact_fossilLocation = null;
        //Information
        String info = null;
        //Location (image on map)
        int map = 0;

        switch (name) {
            case "Abelisaurus" :
                pronunciation = "(Pronunciation: ah-BEL-ee-SAW-rus)";
                image = R.drawable.abelisaurus;
                fact_meaning = "After Roberto Abel";
                fact_date = getString(R.string.late_cretaceous);
                fact_group = getString(R.string.theropoda);
                fact_diet = getString(R.string.meat);
                fact_size = "2m (6.6feet) long";
                fact_fossilLocation = "Argentina 1985";
                info = getResources().getString(R.string.abelisaurus_info);
                map = R.drawable.world_map_argentina;
                break;
            case "Agustinia" :
                pronunciation = "(Pronunciation: ah-goo-STEE-nee-a)";
                image = R.drawable.agustinia;
                fact_meaning = "After Agustin Martinelli";
                fact_date = getString(R.string.early_cretaceous);
                fact_group = getString(R.string.sauropodomorpha);
                fact_diet = getString(R.string.plants);
                fact_size = "15m (50feet) long";
                fact_fossilLocation = "Argentina 1999";
                info = getResources().getString(R.string.agustinia_info);
                map = R.drawable.world_map_argentina;
                break;
            case "Albertoceratops" :
                pronunciation = "(Pronunciation: al-BER-to-SER-a-tops)";
                image = R.drawable.albertoceratops;
                fact_meaning = "Alberta (Canada) Horned Face";
                fact_date = getString(R.string.late_cretaceous);
                fact_group = getString(R.string.theropoda);
                fact_diet = getString(R.string.plants);
                fact_size = "5m (16feet) long";
                fact_fossilLocation = "USA, Canada 2007";
                info = getResources().getString(R.string.albertoceratops_info);
                map = R.drawable.world_map_canada_usa;
                break;
            case "Albertosaurus" :
                pronunciation = "(Pronunciation: al-BER-to-SAW-rus)";
                image = R.drawable.albertosaurus;
                fact_meaning = "Alberta (Canada) Lizard";
                fact_date = getString(R.string.late_cretaceous);
                fact_group = getString(R.string.theropoda);
                fact_diet = getString(R.string.meat);
                fact_size = "8m (26feet) long";
                fact_fossilLocation = "USA, Canada 1905";
                info = getResources().getString(R.string.albertosaurus_info);
                map = R.drawable.world_map_canada_usa;
                break;
            case "Allosaurus" :
                pronunciation = "(Pronunciation: AL-oh-SAW-rus)";
                image = R.drawable.allosaurus;
                fact_meaning = "Other Lizard";
                fact_date = getString(R.string.late_jurassic);
                fact_group = getString(R.string.theropoda);
                fact_diet = getString(R.string.meat);
                fact_size = "12m (39feet) long";
                fact_fossilLocation = "USA 1877";
                info = getResources().getString(R.string.allosaurus_info);
                map = R.drawable.world_map_usa;
                break;
            case "Alvarezsaurus" :
                pronunciation = "(Pronunciation: ahl-vahr-ez-saw-rus)";
                image = R.drawable.alvarezsaurus;
                fact_meaning = "After Don Gregorio Alvarez";
                fact_date = getString(R.string.late_cretaceous);
                fact_group = getString(R.string.theropoda);
                fact_diet = getString(R.string.meat);
                fact_size = "2m (6feet) long";
                fact_fossilLocation = "Argentina 1991";
                info = getResources().getString(R.string.alvarezsaurus_info);
                map = R.drawable.world_map_argentina;
                break;
            case "Alwalkeria" :
                pronunciation = "(Pronunciation: ahl-wah-KEER-ee-a)";
                image = R.drawable.alwalkeria;
                fact_meaning = "After Alick Walker";
                fact_date = getString(R.string.late_triassic);
                fact_group = getString(R.string.sauropodomorpha);
                fact_diet = getString(R.string.meat) + " + " + getString(R.string.plants);
                fact_size = "1m (3feet) long";
                fact_fossilLocation = "India 1986";
                info = getResources().getString(R.string.alwalkeria_info);
                map = R.drawable.world_map_india;
                break;
            case "Compsognathus" :
                pronunciation = "(Pronunciation: KOMP-sog-NA-thus)";
                image = R.drawable.compsognathus;
                fact_meaning = "Elegant Jaw";
                fact_date = getString(R.string.late_jurassic);
                fact_group = getString(R.string.theropoda);
                fact_diet = getString(R.string.meat);
                fact_size = "1m (3feet) long";
                fact_fossilLocation = "France, Germany 1859";
                info = getResources().getString(R.string.compsognathus_info);
                map = R.drawable.world_map_france_germany;
                break;
            case "Diplodocus" :
                pronunciation = "(Pronunciation: dip-LOD-o-kus)";
                image = R.drawable.diplodocus;
                fact_meaning = "Double-beam";
                fact_date = getString(R.string.late_jurassic);
                fact_group = getString(R.string.sauropodomorpha);
                fact_diet = getString(R.string.plants);
                fact_size = "30m (98feet) long";
                fact_fossilLocation = "USA 1878";
                info = getResources().getString(R.string.diplodocus_info);
                map = R.drawable.world_map_usa;
                break;
            case "Spinosaurus" :
                pronunciation = "(Pronunciation: SPY-noh-SAW-rus)";
                image = R.drawable.spinosaurus;
                fact_meaning = "Spine Lizard";
                fact_date = getString(R.string.early_cretaceous);
                fact_group = getString(R.string.theropoda);
                fact_diet = getString(R.string.meat);
                fact_size = "10m (33feet) long";
                fact_fossilLocation = "Egypt, North Africa 1915";
                info = getResources().getString(R.string.spinosaurus_info);
                map = R.drawable.world_map_egypt_north_africa;
                break;
            case "Stegosaurus" :
                pronunciation = "(Pronunciation: STEG-oh-SAW-rus)";
                image = R.drawable.stegosaurus;
                fact_meaning = "Roofed Lizard";
                fact_date = getString(R.string.late_jurassic);
                fact_group = getString(R.string.stegosauria);
                fact_diet = getString(R.string.plants);
                fact_size = "9m (29feet) long";
                fact_fossilLocation = "USA 1877";
                info = getResources().getString(R.string.stegosaurus_info);
                map = R.drawable.world_map_usa;
                break;
            case "Triceratops" :
                pronunciation = "(Pronunciation: try-SER-a-tops)";
                image = R.drawable.triceratops;
                fact_meaning = "Three-horned Face";
                fact_date = getString(R.string.late_cretaceous);
                fact_group = getString(R.string.ceratopsia);
                fact_diet = getString(R.string.plants);
                fact_size = "9m (30feet) long";
                fact_fossilLocation = "Canada, USA 1889";
                info = getResources().getString(R.string.triceratops_info);
                map = R.drawable.world_map_canada_usa;
                break;
            case "Tyrannosaurus Rex" :
                pronunciation = "(Pronunciation: tie-RAN-oh-SAW-rus)";
                image = R.drawable.tyrannosaurus;
                fact_meaning = "Tyrant Lizard";
                fact_date = getString(R.string.late_cretaceous);
                fact_group = getString(R.string.theropoda);
                fact_diet = getString(R.string.meat);
                fact_size = "12m (40feet) long";
                fact_fossilLocation = "Canada, USA 1905";
                info = getResources().getString(R.string.tyrannosaurus_info);
                map = R.drawable.world_map_canada_usa;
                break;
            case "Velociraptor" :
                pronunciation = "(Pronunciation: ve-LOSS-i-RAP-tor)";
                image = R.drawable.velociraptor;
                fact_meaning = "Rapid Thief";
                fact_date = getString(R.string.late_cretaceous);
                fact_group = getString(R.string.theropoda);
                fact_diet = getString(R.string.meat);
                fact_size = "1m (3feet) long";
                fact_fossilLocation = "Mongolia, China 1924";
                info = getResources().getString(R.string.velociraptor_info);
                map = R.drawable.world_map_china;
                break;
        }

        tv_dino_name.setText(name);
        tv_dino_pronunciation.setText(pronunciation);
        iv_dino_image.setImageResource(image);
        tv_fact_meaning.setText(fact_meaning);
        tv_fact_date.setText(fact_date);
        tv_fact_group.setText(fact_group);
        tv_fact_diet.setText(fact_diet);
        tv_fact_size.setText(fact_size);
        tv_fact_fossilLocation.setText(fact_fossilLocation);
        tv_dino_info.setText(info);
        iv_dino_map.setImageResource(map);
    }
    //Initialise all Views
    public void findViews() {
        tv_dino_name = (TextView) findViewById(R.id.tv_dino_name);
        tv_dino_pronunciation = (TextView) findViewById(R.id.tv_dino_pronunciation);
        iv_dino_image = (ImageView) findViewById(R.id.iv_dino_image);
        tv_fact_meaning = (TextView) findViewById(R.id.tv_fact_meaning);
        tv_fact_date = (TextView) findViewById(R.id.tv_fact_date);
        tv_fact_group = (TextView) findViewById(R.id.tv_fact_group);
        tv_fact_diet = (TextView) findViewById(R.id.tv_fact_diet);
        tv_fact_size = (TextView) findViewById(R.id.tv_fact_size);
        tv_fact_fossilLocation = (TextView) findViewById(R.id.tv_fact_fosilLocation);
        tv_dino_info = (TextView) findViewById(R.id.tv_dino_info);
        iv_dino_map = (ImageView) findViewById(R.id.iv_dino_map);
        //Nav Drawer
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
                        resource = R.string.albertoceratops;
                        break;
                    case 3 :
                        resource = R.string.albertosaurus;
                        break;
                    case 4 :
                        resource = R.string.allosaurus;
                        break;
                    case 5 :
                        resource = R.string.alvarezsaurus;
                        break;
                    case 6 :
                        resource = R.string.alwalkeria;
                        break;
                    case 7 :
                        resource = R.string.compsognathus;
                        break;
                    case 8 :
                        resource = R.string.diplodocus;
                        break;
                    case 9 :
                        resource = R.string.spinosaurus;
                        break;
                    case 10 :
                        resource = R.string.stegosaurus;
                        break;
                    case 11 :
                        resource = R.string.triceratops;
                        break;
                    case 12 :
                        resource = R.string.tyrannosaurus;
                        break;
                    case 13 :
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
