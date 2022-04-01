package Old;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String op = scan.next();
        int m = scan.nextInt();

        if (op.equals("+")) {
            System.out.println(n + m);
        }
        if (op.equals("-")) {
            System.out.println(n - m);
        }
        if (op.equals("*")) {
            System.out.println(n * m);
        }
        if (op.equals("/")) {
            System.out.println(n / m);
        }
    }
}
