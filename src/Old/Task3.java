import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w = scan.nextInt();
        int h = scan.nextInt();

        for (int i=1; i <= h; i++ ){
            for (int L = 1; L <= w; L++) {
                if (i == 1 || i == h || L == 1 || L == w)
                    System.out.print(("*"));
                else
                System.out.print(" ");

            }
            System.out.println();
        }


    }
}
