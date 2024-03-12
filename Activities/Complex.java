package Activities;

public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
        this.imaginary = 0.0;
        this.real = 0.0;
    }

    public Complex(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    public String toString() {
        return "Real: " + real + " & Imaginary: " + imaginary;
    }

    public Complex add(Complex otherComplex) {
        return new Complex(this.real + otherComplex.real, this.imaginary + otherComplex.imaginary);
    }

    public Complex subtract(Complex otherComplex) {
        return new Complex(this.real - otherComplex.real, this.imaginary - otherComplex.imaginary);
    }
}
