package practic;

public class City {
        private String nameCity;
        private long populationCity;
        private double areaCity;
        private Country country;

    public City(String nameCity, long populationCity, double areaCity, Country country) {
        this.nameCity = nameCity;
        this.populationCity = populationCity;
        this.areaCity = areaCity;
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "nameCity='" + nameCity + '\'' +
                ", populationCity=" + populationCity +
                ", areaCity=" + areaCity +
                ", country=" + country +
                '}';
    }
}
