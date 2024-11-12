package practic;

public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("Kyrgyzstan", 198.2, 6800000, "Kyrgyz");
        Country country2 = new Country("USA", 9.83, 333000000, "English");
        Country country3 = new Country("Germany", 357.022, 84000000, "Germany");

        City city1 = new City("Bishkek", 1500000, 200, country1);

        City city3 = new City("Altstadt", 15000, 210.7, country3);
        City city2 = new City("Seattle", 369, 750000, country2);

        City[] city_1 = {city1};

        City[] city_3 = {city3};
        City[] city_2 = {city2};


        Region region1 = new Region("Lenin", city_1);

        Region region3 = new Region("Altstadt-Lehel", city_3);
        Region region4 = new Region("Vashington", city_2);

    }
}
