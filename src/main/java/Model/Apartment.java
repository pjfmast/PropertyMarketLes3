package Model;

import java.util.List;

public class Apartment extends Property {

    private int paymentVVE;
    private int floor;

    public Apartment(String address, int livingArea, Integer priceAsked, int paymentVVE, int floor) {
        super(address, livingArea, priceAsked);
        this.paymentVVE = paymentVVE;
        this.floor = floor;
    }

    public Apartment(String address, int livingArea, int paymentVVE, int floor) {
        super(address, livingArea);
        this.paymentVVE = paymentVVE;
        this.floor = floor;
    }

    @Override
    public List<String> getCheckList() {
        return null;
    }
}