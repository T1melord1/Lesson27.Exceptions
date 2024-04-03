import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
      int a = new Scanner(System.in).nextInt();
      int b = new Scanner(System.in).nextInt();
      if (b == 0){
          throw new Exception("Делить на 0 нельзя!");
      }
        System.out.println( a / b);


    }

}