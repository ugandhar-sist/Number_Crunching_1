import java.util.Scanner;

public class EigthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0, rev = 0;
        num = scanner.nextInt();
        int temp = num;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        temp = sum;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (sum * rev == num) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
