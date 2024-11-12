public class Country {
    private long id;
    private static int generatedId = 1;
    private String name;
    private int amount;
    private double area;
    private String language;

    static Country[] countries;

    public Country(){
        id = generatedId++;
    }
    public Country(String name, int amount, double area, String language) {
        id = generatedId++;
        this.name = name;
        this.amount = amount;
        this.area = area;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static Country getMaxArea(Country[] countries){
        if(countries == null || countries.length == 0){
            return null;
        }
        Country maxArea = countries[0];
        for(Country country : countries){
            if(maxArea.area < country.area){
                maxArea = country;
            }
        }
        return maxArea;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", area=" + area +
                ", language='" + language + '\'' +
                '}';
    }
}
