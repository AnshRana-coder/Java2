
class BaseException extends Exception {}
class LevelTwoException extends BaseException {}
class LevelThreeException extends LevelTwoException {}

class A {
    void display() throws BaseException {
        throw new BaseException();
    }
}

class B extends A {
    void display() throws LevelTwoException {
        throw new LevelTwoException();
    }
}

class C extends B {
    void display() throws LevelThreeException {
        throw new LevelThreeException();
    }
}

public class q3{
    public static void main(String[] args) {
        A obj = new C();  // Upcasting
        try {
            obj.display();
        } 
        catch (BaseException e) {
            System.out.println("ANSH RANA 24CSU275");
            System.out.println("Caught exception from hierarchy: " + e);
        }
    }
}
