package Model;

import java.util.ArrayList;
import java.util.List;

public class House extends Property {
    private int plotArea;

    public House(String address, int livingArea, Integer priceAsked, int plotArea) {
        super(address, livingArea, priceAsked);
        this.plotArea = plotArea;
    }

    public House(String address, int livingArea, int plotArea) {
        super(address, livingArea);
        this.plotArea = plotArea;
    }

    @Override
    public List<String> getCheckList() {
        List<String> checkList = new ArrayList<>();
        checkList.add("Controleer kruipruimte");
        checkList.add("Controleer lekkages zolder");

        return checkList;
    }
}
