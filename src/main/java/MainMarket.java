import Model.*;

import java.util.List;

public class MainMarket {

    public static void main(String[] args) {

        // gebruik tweede constructor, waarbij de priceAsked onbekend is:
        Property mijnHuis = new House(
                "breda, hogeschoollaan",
                120, 330);

        Property p1 = new House("Ginneken", 160, 450000, 260);
        Property p2 = new House("Tilburg", 160, 360000, 400);
        Property p3 = new Garage("Made", 50, 25000, true);
        Property p4 = new Apartment("Breda", 160, 250000, 99, 3);

        System.out.println("checkList garage:");
        p3.printCheckList();

        PropertyMarket mijnMarktplaats = new PropertyMarket();
        mijnMarktplaats.addProperties(p1, p2, p3, p4);

        System.out.println(mijnHuis);

        List<Property> found = mijnMarktplaats.search(30000, 999999);
        for (Property property : found) {
            System.out.println(property);
        }
    }
}
