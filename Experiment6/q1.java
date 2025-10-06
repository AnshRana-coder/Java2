import java.util.*;

class Parent {
    void showParent() {
        System.out.println("This is the Parent class");
    }
}

interface FirstInterface {
    void methodOne();
}

interface SecondInterface {
    void methodTwo();
}

class Child extends Parent implements FirstInterface, SecondInterface {
    public void methodOne() {
        System.out.println("Method from FirstInterface implemented");
    }
    public void methodTwo() {
        System.out.println("Method from SecondInterface implemented");
    }
}

interface ParentInterface {
    void parentMethod();
}
interface ChildInterface extends ParentInterface {
    void childMethod();
}

interface Interface1 {
    void method1();
}
interface Interface2 {
    void method2();
}
interface CombinedInterface extends Interface1, Interface2 {
    void method3();
}

public class q1 {
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");
        System.out.println("=== Part a ===");
        Child obj = new Child();
        obj.showParent();
        obj.methodOne();
        obj.methodTwo();

        System.out.println("\n=== Part b ===");
        ChildInterface childInt = new ChildInterface() {
            public void parentMethod() { System.out.println("Parent method implemented"); }
            public void childMethod() { System.out.println("Child method implemented"); }
        };
        childInt.parentMethod();
        childInt.childMethod();

        System.out.println("\n=== Part c ===");
        CombinedInterface comb = new CombinedInterface() {
            public void method1() { System.out.println("Method 1 implemented"); }
            public void method2() { System.out.println("Method 2 implemented"); }
            public void method3() { System.out.println("Method 3 implemented"); }
        };
        comb.method1();
        comb.method2();
        comb.method3();
    }
}
