package Z13;

public class Task14 {
    public static void main(String [] args){
        int n = -16778115;
        int numA = n & 31;
        int numB = (n >> 7) & 0;
        int[] arr = new int[4];
        System.out.println(numA);
        System.out.println(numB);
        arr[3] = n >>>24;
        arr[2] = (n >>>16) & 0xFF;
        arr[1] = (n >>>8) & 0xFF;
        arr[0] = n & 255;

        for (int c : arr){
            System.out.println(c);
        }
        int m = (n >> 8) & 0xFFFF;
        System.out.println(m);


    }
}
