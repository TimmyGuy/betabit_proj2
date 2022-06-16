package nl.betabit.betabit.entities;

import java.util.ArrayList;

public class Transport {
    static ArrayList<Transport> transports = new ArrayList<Transport>();
    private int id;
    private String name;
    private int emission;

    public Transport(int id, String name, int emission) {
        this.id = id;
        this.name = name;
        this.emission = emission;
        transports.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmission() {
        return emission;
    }

    public void setEmission(int emission) {
        this.emission = emission;
    }
}
