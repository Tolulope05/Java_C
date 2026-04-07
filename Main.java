
public class Main {
    public static void main(String[] args) { // start of execution
        //MULTI DIMENSIONAL ARRAYS
        int nums[][]= new int[3][4]; // 3 row, 4 columns
    //   int random = (int)Math.random(); // double value converted into int
        for(int i =0; i<=2;i++){
            for(int j=0;j<=3;j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i =0; i<=2;i++){
            System.out.println("ROW: " + nums[i]);
            for(int j=0;j<=3;j++){

                System.out.print("    COLUMN: "+ nums[i][j]);
            }
            System.out.println();
        }
        for(int n[]: nums){
            for(int m : n){
                System.out.print("PICKING VALUE "+ m + " ");
            }
            System.out.println();
        }
    }
}

