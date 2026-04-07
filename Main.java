
public class Main {
    public static void main(String[] args) { // start of execution
        //MULTI DIMENSIONAL ARRAYS (JAGGED ARRAY)
             int nums[][]= new int[3][]; // 3 row, JAGGED ARRAY
             // WE HAVE TO SPECIFY THE COLUMNS SIZES
             nums[0] = new int[3];
             nums[1] = new int[4];
             nums[2] = new int[2];
   

        for(int i =0; i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }
    
        for(int n[]: nums){
            for(int m : n){
                System.out.print("PICKING VALUE "+ m + " ");
            }
            System.out.println();
        } // EHANCED FORLOOP
    }
}

