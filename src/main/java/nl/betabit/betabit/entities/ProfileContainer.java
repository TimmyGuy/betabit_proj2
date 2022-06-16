package nl.betabit.betabit.entities;

import java.util.ArrayList;

public class ProfileContainer extends Container {
    static ArrayList<ProfileContainer> profileContainers = new ArrayList<ProfileContainer>();

    public ProfileContainer(int id, String name, String color, int borderWidth, int pricePoints, int priceBadges) {
        super(id, name, color, borderWidth, pricePoints, priceBadges);
        profileContainers.add(this);
    }
}
