package nl.betabit.betabit.entities;

import java.util.ArrayList;

public class PictureContainer extends Container {
    static ArrayList<PictureContainer> pictureContainers = new ArrayList<PictureContainer>();

    public PictureContainer(int id, String name, String color, int borderWidth, int pricePoints, int priceBadges) {
        super(id, name, color, borderWidth, pricePoints, priceBadges);
        pictureContainers.add(this);
    }
}
