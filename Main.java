class Computer {
  public void  playMusic(){
        // behanviour
        System.out.println("Music Playing..");
    }
    public  String getMeAPen(int cost)
    {
        return "Pen";
    }
}
public class Main {
    public static void main(String[] args) { // start of execution
Computer obj = new Computer();
obj.playMusic();
String str = obj.getMeAPen(10);
System.out.println(str);

    }
}

