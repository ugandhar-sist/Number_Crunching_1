import java.util.Scanner;

public class TenthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int k = scanner.nextInt();
        scanner.close();
        long reversedNumber = reverseLastKDigits(number, k);
        System.out.println(reversedNumber);
    }
    public static long reverseLastKDigits(long number, int k) {
        String numStr = Long.toString(number);
        if (k <= 0 || k > numStr.length()) {
            throw new IllegalArgumentException("Invalid value of k");
        }
        String lastKDigits = numStr.substring(numStr.length() - k);
        String reversedLastKDigits = new StringBuilder(lastKDigits).reverse().toString();
        String reversedNumStr = numStr.substring(0, numStr.length() - k) + reversedLastKDigits;
        return Long.parseLong(reversedNumStr);
    }
}
