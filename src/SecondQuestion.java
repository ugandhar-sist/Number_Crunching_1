import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        int[] counter = new int[20];

        while (num != 0) {
            counter[(int)(num % 10)]++;
            num /= 10;
        }

        for (int digit = 0; digit < 10; digit++) {
            System.out.println(digit + " occurs " + counter[digit] + " times");
        }

        scanner.close();
    }
}
