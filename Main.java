public class Main {

    public static void main(String[] args) {
        // STRING BUFFER
     StringBuffer sb = new StringBuffer("NAVIN");
     // STRING BUFFER GIVES YOU A BUFFER SIZE 16 with () and 21 with ("NAVIN")
    //  It gives extra 16 buffer to prevent relocation
     System.out.println(sb.capacity());
     
    }
}