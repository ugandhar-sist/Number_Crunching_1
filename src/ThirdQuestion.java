import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1, num2, digit, sum1 = 0, sum2 = 0;
        num1 = scanner.nextLong();
        num2 = scanner.nextLong();

        while (num1 > 0) {
            digit = num1 % 10;
            sum1 += Math.pow(10, digit);
            num1 /= 10;
        }

        while (num2 > 0) {
            digit = num2 % 10;
            sum2 += Math.pow(10, digit);
            num2 /= 10;
        }

        if (sum1 == sum2) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not");
        }

        scanner.close();
    }
}
