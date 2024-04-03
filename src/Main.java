import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      while (true){
          System.out.println("Введите число: ");
          String a = new Scanner(System.in).nextLine();
          if(a.matches("\\d+") && a.length() < 10){
              int newA = Integer.parseInt(a);
              System.out.println(newA);
          }
          else {
              System.out.println("это не число");
          }
      }
    }
}
