package nl.betabit.betabit.entities;

import java.util.ArrayList;

public class Badge {
    static ArrayList<Badge> badges = new ArrayList<Badge>();

    private int id;
    private String title;
    private String color;

    public Badge(int id, String title, String color) {
        this.id = id;
        this.title = title;
        this.color = color;
        badges.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
