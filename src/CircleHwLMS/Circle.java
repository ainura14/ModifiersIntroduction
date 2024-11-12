package CircleHwLMS;

public class Circle {
    private static final double pi = 3.14;
    private int radius;
    public static double area(Circle circle, int radius){
        return pi * (radius * radius);
    }
    public static double circumference(Circle circle, int radius){
        return pi * 2 * radius;
    }
}
