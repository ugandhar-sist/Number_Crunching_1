import java.util.Scanner;

public class SeventhQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long originalNumber = scanner.nextLong();

        if (isPalindrome(originalNumber)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        scanner.close();
    }
    public static boolean isPalindrome(long number) {
        long reversedNumber = 0;
        long originalNumber = number;

        while (number != 0) {
            long digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
