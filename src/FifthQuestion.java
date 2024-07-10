import java.util.Scanner;

public class FifthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int originalNumber = number;
        int numDigits = 0;
        while (number != 0) {
            number /= 10;
            numDigits++;
        }
        number = originalNumber;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
        scanner.close();
    }
}
