import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            test1();
            test2();

            test1();
            test2();
        } catch (Exception e) {
            System.out.println("Vvel huynu");
        }


    }
    public static void test1() throws Exception {
        System.out.println("Vvedi A");
        int a = new Scanner(System.in).nextInt();
        System.out.println(a);
    }
    public static void test2() throws IOException{
        System.out.println("Vvedi B");
        int b = new Scanner(System.in).nextInt();
        System.out.println(b);
    }
}