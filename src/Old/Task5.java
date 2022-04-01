import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxnum = 0;
        int maxsum = 0;
        int x = 0;
        while ((x = scan.nextInt()) != 0) {
            int c = x;
            int sum = 0;
            while (c > 0) {
                sum = sum + c % 10;
                c = c / 10;

            }
           if (sum > maxsum){
               maxsum = sum;
               maxnum = x;
           }

        }
        System.out.println("enter the natural number ( 0 if done)" + " " + maxnum);
        System.out.println("Max sun of digits was" + " "+maxsum);
    }
}