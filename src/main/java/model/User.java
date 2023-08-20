package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private List<Trip> trips;
    private boolean isAdmin;

    public User(int id, boolean isAdmin) {
        this.id = id;
        this.trips = new ArrayList<Trip>();
        this.isAdmin = isAdmin;
    }

    public User(int id) {
        this.id = id;
        this.trips = new ArrayList<Trip>();
        this.isAdmin = false;
    }

    public User() {
        this.id = (int) Math.floor(Math.random() + 1000);
        this.trips = null;
        this.isAdmin = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                isAdmin == user.isAdmin &&
                trips.equals(user.trips);
    }

    @Override
    public int hashCode() {
        return id + trips.hashCode() + (isAdmin ? 1 : 0);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", trips=" + trips +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
