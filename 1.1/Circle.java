public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){
        radius = r;
        color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public double getarea(){
        return Math.PI * radius * radius;
    }
    public void setRadius(double r){
        radius = r ;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}
