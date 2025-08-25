import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 12:");
        int value = new Scanner(System.in).nextInt();

        if (value < 0 || value > 12) {
            System.out.println("Error");
            return;
        }

        int count = 1;

        for (int i = 1; i <= value; i++) {
            count *= i;
        }
        System.out.println("Факториал числа " + value + " = " + count);
    }
}