import java.util.Scanner;

public class Problem1  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Maximum" + " " + max);

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("Minimum" + " " + min);

        int mid = a + b + c - (max + min);
        System.out.println("Middle" + " " + mid);
    }
}
