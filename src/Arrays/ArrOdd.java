public class ArrOdd {
    public static void main (String[] args){
      int[] a = {-1, 9, 3, 0, -3, 2, 4};
        printArr(a);
        System.out.println(" odd: " + numOdd(a));
        System.out.println("even: " + numEven(a));
    }

    static int numOdd(int[] arr) {
        int count = 0;
        for (int i=0; i<arr.length;++i){
            if (arr[i] % 2 != 0) {
                ++count;
            }
        }
        return count;
    }

    static int numEven(int[] arr) {
        int count = 0;
        for (int i=0; i<arr.length;++i){
            if (arr[i] % 2 == 0) {
                ++count;
            }
        }
        return count;
    }



    static void printArr(int[] arr) {
        System.out.print(" [ ");
        for (int i=0;i<arr.length;++i)
            System.out.print(arr[i] + " ");
        System.out.println(" ] ");


    }
}
