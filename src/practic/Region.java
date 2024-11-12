package practic;

import java.util.Arrays;

public class Region {
    private String name;
    private City[] city;

    public Region(String name, City[] city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", city=" + Arrays.toString(city) +
                '}';
    }
}
