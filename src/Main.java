//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("Kyrgyzstan", 7, 254.6, "kyrgyz");
        Country country2 = new Country("Turkiye", 70, 700.2, "turkish");
        Country country3 = new Country("Germany", 50, 500.2, "germany");
        Country.countries = new Country[]{country1, country2,country3};

        Country countryWithMaxArea = Country.getMaxArea(new Country[]{country1, country2,country3});
        System.out.println(countryWithMaxArea);


    }
}