import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Введите число: ");
                int a = new Scanner(System.in).nextInt();
                System.out.println(a);
            } catch (InputMismatchException e){
                System.out.println("Упс, ошибка!");
            }catch (NullPointerException e){
                System.out.println("Нул, о боже!");
            }
    }}
}