class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class q4 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        c.draw();
        s.draw();
    }
}
