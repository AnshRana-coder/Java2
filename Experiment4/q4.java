import java.util.Scanner;

class Complex {
    double real, imag;

    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    Complex subtract(Complex c) {
        return new Complex(real - c.real, imag - c.imag);
    }
    Complex multiply(Complex c) {
        double r = real * c.real - imag * c.imag;
        double i = real * c.imag + imag * c.real;
        return new Complex(r, i);
    }
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class q4 {
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");
        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter real part ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part ");
        double i1 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);

        System.out.print("Enter real part ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part");
        double i2 = sc.nextDouble();
        Complex c2 = new Complex(r2, i2);

        System.out.print("Sum: ");
        c1.add(c2).display();

        System.out.print("Difference: ");
        c1.subtract(c2).display();

        System.out.print("Product: ");
        c1.multiply(c2).display();
    }
}
