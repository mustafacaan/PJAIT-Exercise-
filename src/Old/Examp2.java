public class Examp2 {
    public static void main(String[] args){
        int[]arr={1,4,2,5};
        int c =0;
        for(int i=0;i<arr.length/2;i++){
            c=arr[i];
            arr[i]=arr[arr.length/2+i];
            arr[arr.length/2+i]=c;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}