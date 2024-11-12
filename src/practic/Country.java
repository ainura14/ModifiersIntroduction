package practic;

public class Country {
    private String name;
    private double area;
    private long population;
    private String language;

    public Country(String name, double area, long population, String language) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", language='" + language + '\'' +
                '}';
    }
}
