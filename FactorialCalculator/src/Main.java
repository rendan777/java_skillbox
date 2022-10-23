import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число, а я выдам факториал:");
        int value = new Scanner(System.in).nextInt();

        int finalValue = 1;
        for (int i = 1; i <= value; i = i + 1){
            finalValue *= i;
        }
        System.out.println("");
        System.out.println("Факториал числа "+ value + " равен "+ finalValue);
    }
}