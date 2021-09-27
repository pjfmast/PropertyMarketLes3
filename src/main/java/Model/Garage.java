package Model;

import java.util.List;

public class Garage extends Property {
    private final boolean hasElectricty;

    public Garage(String address, int livingArea, Integer priceAsked, boolean hasElectricty) {
        super(address, livingArea, priceAsked);
        this.hasElectricty = hasElectricty;
    }

    public Garage(String address, int livingArea, boolean hasElectricty) {
        super(address, livingArea);
        this.hasElectricty = hasElectricty;
    }

    @Override
    public List<String> getCheckList() {
        return null;
    }
}
