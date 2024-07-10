import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long input = scanner.nextLong();
        int no_of_digits = 0;
        long power = 1;

        while (input / power != 0) {
            no_of_digits += 1;
            power *= 10;
        }

        long left_power;
        long right_power;
        int ctr;
        int left_digit;
        int right_digit;
        int sum = 0;
        int diff;

        left_power = power / 10;
        right_power = 1;

        for (ctr = 1; ctr <= no_of_digits / 2; ctr += 1) {
            left_digit = (int) ((input / left_power) % 10);
            right_digit = (int) ((input / right_power) % 10);
            left_power /= 10;
            right_power *= 10;
            diff = Math.abs(left_digit - right_digit);
            sum += diff;
        }

        if (no_of_digits % 2 == 1) {
            sum = sum + (int) ((input / left_power) % 10);
        }

        System.out.println(sum);
    }
}
