public class Examp1 {
    public static void main(String[] args) {

        int[]arr={1, 2, 3, 4, 5, 6, 7, 8};
        int count=0;


        for(int i=0;i<arr.length;i++) {
            if (arr[i] % 2==0) {
                count++;
            }
        }
        int[] brr=new int[count];
        for(int i=0, x=0;i< arr.length;i++){
            if (arr[i] % 2==0){
                brr[brr.length - 1 - x] = arr[i];
                ++x;
            }
        }
        for (int i=0;i< brr.length;i++){
        System.out.print(brr[i]+" ");
        }
    }
}