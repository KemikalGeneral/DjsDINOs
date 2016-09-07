package com.endorphinapps.kemikal.djsdinos;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class DinosaurActivity extends AppCompatActivity {

    private TextView tv_dino_name;
    private TextView tv_dino_pronunciation;
    private ImageView iv_dino_image;
    private TextView tv_fact_meaning;
    private TextView tv_fact_date;
    private TextView tv_fact_group;
    private TextView tv_fact_diet;
    private TextView tv_fact_size;
    private TextView tv_fact_fosilLocation;
    private TextView tv_dino_info;
    private ImageView iv_dino_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinosaur);

        //Find all Views
        findViews();

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
                fact_fosilLocation = null;
        //Information
        String info = null;
        //Location (image on map)
        int map = 0;

        switch (name) {
            case "Spinosaurus" :
                pronunciation = "(Pronunciation: SPY-noh-SAW-rus)";
                image = R.drawable.spinosaurus;
                fact_meaning = "Spine Lizard";
                fact_date = "Early Cretaceous";
                fact_group = "Theropoda";
                fact_diet = "Meat";
                fact_size = "10m (33feet) long";
                fact_fosilLocation = "Egypt, North Africa 1915";
                info = getResources().getString(R.string.spinosaurus_info);
                map = R.drawable.world_map_spinosaurus;
                break;
            case "Velociraptor" :
                image = R.drawable.velociraptor;
                fact_meaning = "Spine Lizard";
                fact_date = "Early Cretaceous";
                fact_group = "Theropoda";
                fact_diet = "Meat";
                fact_size = "10m (33feet) long";
                fact_fosilLocation = "Egypt, North Africa 1915";
                info = getResources().getString(R.string.velociraptor_info);
                map = R.drawable.world_map;
                break;
            case "Tyrannosaurus Rex" :
                pronunciation = "(Pronunciation: tie-RAN-oh-SAW-rus)";
                image = R.drawable.tyrannosaurus;
                fact_meaning = "Tyrant Lizard";
                fact_date = "Late Cretaceous";
                fact_group = "Theropoda";
                fact_diet = "Meat";
                fact_size = "12m (40feet) long";
                fact_fosilLocation = "Canada, USA 1905";
                info = getResources().getString(R.string.trex_info);
                map = R.drawable.world_map_tyrannosaurus;
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
        tv_fact_fosilLocation.setText(fact_fosilLocation);
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
        tv_fact_fosilLocation = (TextView) findViewById(R.id.tv_fact_fosilLocation);
        tv_dino_info = (TextView) findViewById(R.id.tv_dino_info);
        iv_dino_map = (ImageView) findViewById(R.id.iv_dino_map);
    }
}
