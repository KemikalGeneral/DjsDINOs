package com.endorphinapps.kemikal.djsdinos;

/**
 * Created by User on 05/09/2016.
 */
public enum DataSource {

    Spinosaurus(R.string.spinosaurus, R.drawable.spinosaurus),
    Raptor(R.string.raptor, R.drawable.velociraptor),
    Trex(R.string.t_rex, R.drawable.tyrannosaurus);

    private int name;
    private int image;

    DataSource(int name, int image) {
        this.name = name;
        this.image = image;
    }

    public int getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
