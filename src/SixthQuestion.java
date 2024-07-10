import java.util.Scanner;

public class SixthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long reverse = 0;
        while (number != 0) {
            long digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println(reverse);
        scanner.close();
    }
}
