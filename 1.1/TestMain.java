public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        System.out.println(c1);
        Circle c2 = new Circle();
        System.out.println(c2);

        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("Radius is: "+ c1.getRadius());

        System.out.println("Area is: " + c2.getarea());
        System.out.println(" Circumference is: " + c2.getCircumference());
    }
}
