public class TestComplex {
    public static void main(String[] args) {
        Complex a = new Complex(1.33, 4.64);
        Complex b = new Complex(3.18, 2.74);

        Complex c = a.add(b);
        System.out.println();
        Complex[] arrayC = {a, b, c};
        System.out.println("c=a+b= " + c.getReal()
                + " " + c.getImaginary());
        Complex d = c.sub(a);
        System.out.println("d=c-a= " + d.getReal()
                + " " + d.getImaginary());
        System.out.println(d);
        Complex e = new Complex(d);
        System.out.println(Complex.searchForComplex(arrayC, e));
        Complex.replaceComplex(arrayC, c, e);

        Complex.displayArrayContent(arrayC);
    }
}

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(Complex other){
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    public Complex add(Complex other){
        return new Complex(
                real + other.real,
                imaginary + other.imaginary
        );
    }

    public Complex sub(Complex other){
        return new Complex(
                real - other.real,
                imaginary - other.imaginary
        );
    }

    static boolean searchForComplex(Complex[] arr, Complex target){
        for (Complex complex : arr) {
            if (complex.equals(target)) {
                return true;
            }
        }
        return false;
    }

    static void replaceComplex(Complex[] arr, Complex oldValue, Complex newValue){
        for (Complex complex: arr){
            if (complex.equals(oldValue)){
                oldValue = newValue;
                break;
            }
        }
    }

    static void displayArrayContent(Complex[] arr){
        for (Complex complex: arr){
            System.out.println(complex.toString());
        }
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    @Override
    public boolean equals(Object obj) {
        Complex other = (Complex) obj;
        return real == other.real && imaginary == other.imaginary;
    }
}


