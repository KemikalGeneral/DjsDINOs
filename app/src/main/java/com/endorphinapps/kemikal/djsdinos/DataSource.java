package com.endorphinapps.kemikal.djsdinos;

/**
 * Created by User on 05/09/2016.
 */
public enum DataSource {

    Abelisaurus(R.string.abelisaurus, R.drawable.abelisaurus),
    Agustinia(R.string.agustinia, R.drawable.agustinia),
    Albertoceratops(R.string.albertoceratops, R.drawable.albertoceratops),
    Albertosaurus(R.string.albertosaurus, R.drawable.albertosaurus),
    Allosaurus(R.string.allosaurus, R.drawable.allosaurus),
    Alvarezsaurus(R.string.alvarezsaurus, R.drawable.alvarezsaurus),
    Alwalkeria(R.string.alwalkeria, R.drawable.alwalkeria),
    Compsognathus(R.string.compsognathus, R.drawable.compsognathus),
    Diplodocus(R.string.diplodocus, R.drawable.diplodocus),
    Spinosaurus(R.string.spinosaurus, R.drawable.spinosaurus),
    Stegosaurus(R.string.stegosaurus, R.drawable.stegosaurus),
    Triceratops(R.string.triceratops, R.drawable.triceratops),
    Tyrannosaurus(R.string.tyrannosaurus, R.drawable.tyrannosaurus),
    Velociraptor(R.string.velociraptor, R.drawable.velociraptor);

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
