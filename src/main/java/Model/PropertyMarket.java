package Model;

import java.util.*;

public class PropertyMarket {
    private List<Property> homes = new ArrayList<>();

    public PropertyMarket() {
    }

    public void addProperty(Property property) {
        homes.add(property);
    }

    public void addProperties(Property... properties) {
        homes.addAll(Arrays.asList(properties));
    }

    public void printAllProperties() {
        System.out.println("All properties in the market:");
        for (Property home : homes) {
            System.out.println(home);
        }
    }

    public List<Property> search(int minPrice, int maxPrice) {
        List<Property> foundProperties = new ArrayList<>();

        // todo make method complete
        for (Property home : homes) {
            Integer price = home.getPriceAsked();
//            if (price == null) {
//                foundProperties.add(home);
//            } else
            if (price == null || (price >= minPrice && price <= maxPrice)) {
                foundProperties.add(home);
            }
        }

        return foundProperties;
    }

    public List<Property> search(int maxPrice) {
        return search(0, maxPrice);
    }

}
