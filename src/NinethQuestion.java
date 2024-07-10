import java.util.Scanner;

public class NinethQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num, temp, revnum = 0, revsq = 0, sq = 0;
        num = scanner.nextLong();
        scanner.close();

        temp = num;
        while (temp != 0) {
            revnum = revnum * 10 + temp % 10;
            temp /= 10;
        }

        sq = num * num;
        revsq = revnum * revnum;

        temp = revsq;
        revsq = 0;

        while (temp != 0) {
            revsq = revsq * 10 + temp % 10;
            temp /= 10;
        }

        if (sq == revsq) {
            System.out.println("Adam Number");
        } else {
            System.out.println("Not an Adam Number");
        }
    }
}
