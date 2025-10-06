import java.util.*;
abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private double m1, m2, m3;
    A(double m1, double m2, double m3) {
        this.m1 = m1; this.m2 = m2; this.m3 = m3;
    }
    double getPercentage() {
        return (m1 + m2 + m3) / 3.0;
    }
}

class B extends Marks {
    private double m1, m2, m3, m4;
    B(double m1, double m2, double m3, double m4) {
        this.m1 = m1; this.m2 = m2; this.m3 = m3; this.m4 = m4;
    }   
    double getPercentage() {
        return (m1 + m2 + m3 + m4) / 4.0;
    }
}

public class q5 {
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");
        Marks studentA = new A(85, 90, 95);
        Marks studentB = new B(70, 80, 90, 100);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
