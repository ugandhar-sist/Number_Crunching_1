import java.util.Scanner;

public class ForthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num, fact = 1, sum = 0, temp;
        num = scanner.nextLong();
        temp = num;

        while (num != 0) {
            for (int checkFactor = 1; checkFactor <= num % 10; checkFactor++) {
                fact *= checkFactor;
            }
            sum += fact;
            fact = 1;
            num /= 10;
        }

        if (temp == sum) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a strong number");
        }

        scanner.close();
    }
}
