package Model;

import java.util.ArrayList;

public class Property {
    private final String address;
    private final PropertyType propertyType;
    private final int livingArea;

    private Integer priceAsked;
    private ArrayList<Bid> bidsOnProperty = new ArrayList<>();

    public boolean doOffer(Customer customer, Integer priceOffered) {
        if (isAccepted(priceOffered)) {
            Bid newBid = new Bid(customer, priceOffered);
            bidsOnProperty.add(newBid);
            return true;
        }
        return false;
    }

    public boolean isAccepted(int priceOffered) {
        if (!bidsOnProperty.isEmpty()) {
            for (Bid bid : bidsOnProperty) {
                if (bid.getPriceOffered() >= priceOffered) {
                    return false;
                }
            }
        }

        return true;
    }

    public void printBidsOnHouse() {
        System.out.println("All bids on this property:\n");
        for (Bid bid : bidsOnProperty) {
            System.out.println(bid);
        }
    }

    public Property(String address, PropertyType propertyType, int livingArea, Integer priceAsked) {
        this.address = address;
        this.propertyType = propertyType;
        this.livingArea = livingArea;
        this.priceAsked = priceAsked;
    }

    public Property(String address, PropertyType propertyType, int livingArea) {
        this(address, propertyType, livingArea, null);
    }

    public Integer getPriceAsked() {
        return priceAsked;
    }

    @Override
    public String toString() {
        String prijsmelding = "";
        if (priceAsked == null) {
            prijsmelding = "Prijs op aanvraag";
        } else {
            prijsmelding = "price: " + priceAsked;
        }
        return "Home for sale:\n" +
                "at location: '" + address + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", livingArea=" + livingArea +
                ", priceAsked=" + prijsmelding;
    }
}
