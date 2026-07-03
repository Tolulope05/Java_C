/**
 * INTERFACES TYPES
 * - Normal: has 2 or more methods
 * - Functional (SAM) - Single Abstract method : single methods
 * - Marker: Interface with no method, used to update something to the compiler
 * e.g serialization or deserialization
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