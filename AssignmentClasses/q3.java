class Grandfather {
    void show() {
        System.out.println("I am Grandfather");
    }
}

class Father extends Grandfather {
    void display() {
        System.out.println("I am Father");
    }
}

class Son extends Father {
    void print() {
        System.out.println("I am Son");
    }
}

public class q3 {
    public static void main(String[] args) {
        Son s = new Son();
        s.show();
        s.display();
        s.print();
    }
}
