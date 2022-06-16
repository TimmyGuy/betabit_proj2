package nl.betabit.betabit.entities;

import java.util.ArrayList;

public class Log {
    static ArrayList<Log> logs = new ArrayList<Log>();

    private int id;
    private User user;
    private int distance;
    private Transport transport;

    public Log(int id, User user, int distance, Transport transport) {
        this.id = id;
        this.user = user;
        this.distance = distance;
        this.transport = transport;
        logs.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
