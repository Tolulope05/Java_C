class Computer {
  public void  playMusic(){
        // behanviour
        System.out.println("Music Playing..");
    }
    public  String getMeAPen(int cost)
    {
        if (cost >= 10) {
            return "Pen";
        } else {

            return "Nothing";
        }
    }
}
public class Main {
    public static void main(String[] args) { // start of execution
Computer obj = new Computer();
obj.playMusic();
String str = obj.getMeAPen(2);
System.out.println(str);

    }
}

