class Computer {
    // METHOD OVERLOADING: Two or three nethids with same name but different paramters
    public int add(int n1, int n2, int n3){
        int result = n1+n2+n3;
        return result;
    }
    public double add(double n1, int n2){
        double result = n1+n2;
        return result;
    }
}
public class Main {
    public static void main(String[] args) { // start of execution
        Computer obj = new Computer();
        int r1=    obj.add(5, 4,5);
        double r2=    obj.add(5, 4);
        System.out.println(r1);
        System.out.println(r2);
    }
}

