import java.util.Arrays;

public class SelectionSort {
    //function to find smallest number
    public static int findSmallest(int[] arr,int start){
        int res = start;

        for(int i = start; i<arr.length; i++){
            if(arr[res]>arr[i]){
                res =i;
            }
        }
        return res;
    }
    //function to swap the elements
    public static void swapIt(int[] arr, int a, int b){
            int temp  = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
    }
//Selection sorting implementation
    public static void sortIt(int[] arr){
        for(int i =0; i<arr.length; i++){
            int smallest = findSmallest(arr,i);
            swapIt(arr, i, smallest);
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,5,10,7,3,80,25,20};
        sortIt(arr);
        System.out.println(Arrays.toString(arr));
    }
}
