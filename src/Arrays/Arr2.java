import java.util.Scanner;
public class Arr2 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        String in =scan.nextLine();
        int j = 0;

        String [][] arr = {{"Kenya",  "Nairobi"}, {"Rwanda", "Kigali"},{"Gambia", "Banjul"},
                {"Ghana",  "Accra"},{"Niger",  "Niamey"},  {"Zambia", "Lusaka"} };
        boolean found = false;
        for (int i = 0; i< arr.length;i++ ){
            if(in.equalsIgnoreCase(arr[i][0])){

                System.out.println(arr[i][0]);
                found = true;
                break;

            }
        }
        if (!found){
            System.out.println("This Country Not Available");
        }
    }
}