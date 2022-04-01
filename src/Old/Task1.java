import java.util.Scanner;

public class Task1 {
  public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = n;
        int min = n;

        while ((n = scan.nextInt())!=0){
            if (n <= min) {
                min = n;
            }
            if (n >= max){
                max = n ;
            }
        }
        System.out.println(min);
        System.out.println(max);
  }
}