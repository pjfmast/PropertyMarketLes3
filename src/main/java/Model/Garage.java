package Model;

import java.util.ArrayList;
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
        List<String> checkList = new ArrayList<>();
        checkList.add("Wat voor type garagepoort?");
        if (hasElectricty) {
            checkList.add("Wat voor groepenkast?");
            checkList.add("Elektrische garagepoort aanwezig?");
            checkList.add("Is er 3-fase stroom?");
        }
        return checkList;
    }
}
