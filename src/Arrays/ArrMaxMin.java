public class ArrMaxMin {
    public static void main(String[] args) {
            int[] arr = {-1, 9, 3, 0, -3, 2, 4};
            int[] indMinMax = getMinMaxind(arr);
            printArr(arr);
            System.out.println("Index of min: " + indMinMax[0]);
            System.out.println("Index of max: " + indMinMax[1]);
        }

        static int[] getMinMaxind(int[] arr) {
            int maxValue = arr[0];
            int minValue = arr[0];
            int maxind = 0;
            int minind = 0;
            for (int i = 1;i <arr.length;i++){
                if (arr[i] > maxValue) {
                    maxValue = arr[1];
                    minind = i;
                }
                if (arr[i] < minValue) {
                    minValue = arr[i];
                    minind = i;
                }
            }
            return new int[] {minind,maxind};

        }
        static void printArr(int[]arr) {
            for (int i = 1; i < arr.length; i++)
                System.out.println(arr[i] + " ");

        }



    }
