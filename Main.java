class Main {
    public static void main(String[] args){
    //    // literals
    //    int num1 = 0b101;
    //    int num2 = 0xEE;
    //    long num3 = 100_00000_0000l;
    //    System.out.println(num1);
    //    System.out.println(num2);
    //    System.out.println(num3);
       // TYPE CONVERSIONS
       // int, float, double, long, char, boolean, string
       byte b = 127;
       int a = 257;
        //   b = a // x b =(byte)a;
        b =(byte)a;
       a = b; // works
float f = 5.6f;
       int x = (int)f;
       System.out.println(a);
       System.out.println(x);

    }
}