import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите положительное число");
        int value = new Scanner(System.in).nextInt();
        for (int i = value; i >= 1; i = i - 1){
            if(value % i == 0){
                System.out.println((value / i) +"*"+ i);
            }
        }
    }
}