import java.util.Scanner;

class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Bike");
    }
}

public class q2 {
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tyres: ");
        int N = sc.nextInt();
        sc.close();

        Vehicle v;

        switch (N) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
        }

        v.display();
    }
}
