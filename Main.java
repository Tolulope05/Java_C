public class Main {

    public static void main(String[] args) {
        // STRING BUFFER
     StringBuffer sb = new StringBuffer("NAVIN");
     // STRING BUFFER GIVES YOU A BUFFER SIZE 16 with () and 21 with ("NAVIN")
    //  It gives extra 16 buffer to prevent relocation
    sb.append(" READY");
    // sb.deleteCharAt(2);
    // sb.delete(2, 7);
    // sb.insert(0, "JAVA ");
    // sb.insert(2, "JAVA ");
    sb.setLength(3);
    System.out.println(sb);
    System.out.println(sb.capacity());
    // String str = sb.toString();
    // System.out.println(str);
    
     
    }
}