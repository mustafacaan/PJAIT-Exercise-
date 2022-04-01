
import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        boolean variable = (a % 2 == 0 && b % 2 == 0 || a % 3 == 0 && b % 5 == 0);

        System.out.println(variable);
    }
}
