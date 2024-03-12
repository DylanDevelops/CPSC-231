package Activities;

public class ComplexTest {
    public static void main(String[] args) {
        Complex complex1 = new Complex(10.3, 30.1);
        Complex complex2 = new Complex(22.5, 50.0);

        System.out.println("a = " + complex1.toString());
        System.out.println("b = " + complex2.toString());

        System.out.println("a + b = " + complex1.add(complex2));
        System.out.println("a - b = " + complex1.subtract(complex2));
    }
}
