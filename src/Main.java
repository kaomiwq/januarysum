import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int days = 31;
        int[] rainfall = new int[days];

        int sum = 0;
        for (int i = 0; i < rainfall.length; i++) {
            rainfall[i] = random.nextInt(  5 - 1 + 1 ) + 1;
            System.out.print(String.format("Колличество осадков в %d день : ", i + 1, rainfall[i]));
            System.out.println(rainfall[i]);
            sum = sum + rainfall[i];
        }
        System.out.println(" ");
        System.out.print("Общая сумма выпавших осадков: ");
        System.out.println(sum);

    }
}