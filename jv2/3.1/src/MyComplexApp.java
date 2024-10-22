import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        MyComplex myComplex1 = new MyComplex();
        MyComplex myComplex2 = new MyComplex();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter complex number 1(real and imaginary part): ");
        myComplex1.setReal(sc.nextDouble());
        myComplex1.setImag(sc.nextDouble());

        System.out.println("Enter complex number 2(real and imaginary part): ");
        myComplex2.setReal(sc.nextDouble());
        myComplex2.setImag(sc.nextDouble());

        System.out.println("Number 1 is: " + myComplex1);
        System.out.println(myComplex1.isReal());
        System.out.println(myComplex1.isImag());

        System.out.println("Number 2 is: " + myComplex2);
        System.out.println(myComplex2.isReal());
        System.out.println(myComplex2.isImag());

        System.out.println(myComplex1.equals(myComplex2));
        System.out.println(myComplex1.addInto(myComplex2));
    }
}