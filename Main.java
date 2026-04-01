class Main {
    public static void main(String[] args){
       // TYPE PROMOTION
        int x = 5;
        int y  = 7;
        int z = 8;
        
        // PRINT GREATEST NUMBER
        if (x>y && x>z)
            System.out.println("X");
        else if (y>x && y>z) 
            System.out.println("Y");
        else if (z>x && z>y) 
            System.out.println("Z");
        else 
            System.out.println("None of the conditionds checks out.");
        
    } 
}