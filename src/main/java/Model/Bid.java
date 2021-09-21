package Model;

import java.time.LocalDateTime;

public class Bid {
    private final Integer priceOffered;
    private final Customer customer;
    private final LocalDateTime timeOfBid;

    public Bid(Customer customer, Integer priceOffered) {
        this.customer = customer;
        this.priceOffered = priceOffered;
        timeOfBid = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Bid: "+ priceOffered +
                ", by " + customer +
                ", timeOfBid=" + timeOfBid
                ;
    }

    public Integer getPriceOffered() {
        return priceOffered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getTimeOfBid() {
        return timeOfBid;
    }
}
