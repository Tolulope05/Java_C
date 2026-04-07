 class Student {

    int rollno;
    String name;
    int marks;

}

public class Main {
    public static void main(String[] args) {
        // LOOPS THAT WORK FOR ARRAYS
        // // Array of OBJECTs
        // Student s1 = new Student();
        // s1.rollno = 1;
        // s1.name = "Navin";
        // s1.marks = 88;

        // Student s2 = new Student();
        // s2.rollno = 2;
        // s2.name = "David";
        // s2.marks = 45;

        // Student s3 = new Student();
        // s3.rollno = 3;
        // s3.name = "Mark";
        // s3.marks = 12;


        // Student students[] = new Student[3];
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        //     System.out.println( students[i].name + " : " + students[i].marks);
        // }

        int nums[] = new int[4];
        nums[0] = 3;
        nums[1] = 1;
        nums[2] = 4;
        nums[3] = 2;

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println( nums[i]);
        // }
        for(int i : nums){
            System.out.println(i);
        }


    }
}