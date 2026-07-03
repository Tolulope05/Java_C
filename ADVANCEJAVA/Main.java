/**
 * ANOTATION
 */
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheMethodWhichBelongToThisClass();
    }
}

class A {
    public void showTheMethodWhichBelongToThisClass() {
        System.out.println("IN A SHOW");
    }
}

class B extends A {
    @Override // ANNOTATION: I am trying to override the method
    public void showTheMethodWhichBelongToThisClass() {
        System.out.println("IN B SHOW");
    }
}