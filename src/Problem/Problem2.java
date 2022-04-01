import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == b && c != a || b == c && a != b || a == c && a != b) {
            System.out.println("RIGHT");
        } else {
            System.out.println("NOT RIGHT");
        }
    }
}
