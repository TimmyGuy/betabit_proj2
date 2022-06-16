package nl.betabit.betabit.entities;

import java.util.ArrayList;

public class TravelPreference {
    static ArrayList<TravelPreference> travelPreferences = new ArrayList<TravelPreference>();

    private User user;
    private int distance;
    private Transport transport;

    public TravelPreference(User user, int distance, Transport transport) {
        this.user = user;
        this.distance = distance;
        this.transport = transport;
        travelPreferences.add(this);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
