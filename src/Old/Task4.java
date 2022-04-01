import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int n = x*2-1;

        for(int i=1;i<=n;i++){
            for(int l=1;l<=n;l++){
                if (l==i || l==n-i+1)
                    System.out.print("*");
                System.out.print(" ");

            }

        System.out.println();
        }


    }
}