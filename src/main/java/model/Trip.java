package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trip {
    private Calendar startDate;
    private int duration;
    private List<Receipt> receipts;

    public Trip(Calendar startDate, int duration, List<Receipt> receipts) {
        this.startDate = startDate;
        this.duration = duration;
        this.receipts = receipts;
    }

    public Trip() {
        this.startDate = Calendar.getInstance();
        this.duration = 0;
        this.receipts = new ArrayList<Receipt>();
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return duration == trip.duration &&
                startDate.equals(trip.startDate) &&
                receipts.equals(trip.receipts);
    }

    @Override
    public int hashCode() {
        return startDate.hashCode() + duration + receipts.hashCode();
    }

    @Override
    public String toString() {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return "Trip{" +
                "startDate=" + formatter.format(startDate.getTime()) +
                ", duration=" + duration +
                ", receipts=" + receipts +
                '}';
    }
}
