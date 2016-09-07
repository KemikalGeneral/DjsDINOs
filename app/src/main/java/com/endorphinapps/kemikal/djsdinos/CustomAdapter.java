package com.endorphinapps.kemikal.djsdinos;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 05/09/2016.
 */
public class CustomAdapter extends PagerAdapter {

    private Context context;

    public CustomAdapter(Context context) {
        this.context = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        DataSource dataSource = DataSource.values()[position];
        LayoutInflater inflater = LayoutInflater.from(context);

        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.layout_choose_dino, container, false);
        container.addView(layout);

        //Add Text
        final TextView textView = (TextView) layout.findViewById(R.id.textView);
        textView.setText(dataSource.getName());
        //Add Image
        ImageView imageView = (ImageView) layout.findViewById(R.id.imageView);
        imageView.setImageResource(dataSource.getImage());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int resource = 0;

                switch (position) {
                    case 0:
                        resource = R.string.diplodocus;
                        break;
                    case 1:
                        resource = R.string.spinosaurus;
                        break;
                    case 2:
                        resource = R.string.stegosaurus;
                        break;
                    case 3 :
                        resource = R.string.triceratops;
                        break;
                    case 4 :
                        resource = R.string.tyrannosaurus;
                        break;
                    case 5 :
                        resource = R.string.velociraptor;
                        break;
                }
                String name = v.getResources().getString(resource);

                Intent intent = new Intent(context, DinosaurActivity.class);
                intent.putExtra("EXTRAS_NAME", name);
                context.startActivity(intent);
            }
        });

        return layout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return DataSource.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
