package Model;

import java.util.ArrayList;
import java.util.List;

// todo 1. create abstract class Property and
// - abstract method getCheckList()
public abstract class Property {
    private final String address;
    // todo 2: remove PropertyType:
//    private final PropertyType propertyType;
    private final int livingArea;

    private final Integer priceAsked;
    private final ArrayList<Bid> bidsOnProperty = new ArrayList<>();

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

    // todo: make constructor protected
    protected Property(String address, int livingArea, Integer priceAsked) {
        this.address = address;
//        this.propertyType = propertyType;
        this.livingArea = livingArea;
        this.priceAsked = priceAsked;
    }

    protected Property(String address, int livingArea) {
        this(address, livingArea, null);
    }

    public Integer getPriceAsked() {
        return priceAsked;
    }

    public abstract List<String> getCheckList();

    public void printCheckList() {
        List<String> checkList = getCheckList();
        int lineNr = 1;
        for (String check : checkList) {
            System.out.println(lineNr + ": " + check);
            lineNr++;
        }
    }

    @Override
    public String toString() {
        String prijsmelding;
        if (priceAsked == null) {
            prijsmelding = "Prijs op aanvraag";
        } else {
            prijsmelding = "price: " + priceAsked;
        }
        return "Home for sale:\n" +
                "at location: '" + address + '\'' +
                ", livingArea=" + livingArea +
                ", priceAsked=" + prijsmelding;
    }
}
