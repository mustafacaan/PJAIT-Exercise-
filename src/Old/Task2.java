import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one   = 0;
        int n = 0;
        boolean consecutive = false;
        while ((n=scan.nextInt()) !=0) {
            if (n == one ) {
                consecutive = true;
            }
            one = n;
        }
        if (consecutive)
            System.out.println("consecutive");
        else
            System.out.println("no consecutive");
    }
}
