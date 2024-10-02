import java.util.Arrays;

public class InsertionSort {
    //sorting logic
    public static void inSort(int[] arr){
        for(int i =1; i<arr.length; i++){
            int currEle = arr[i];
            int j = i-1;
            while(j>=0 && currEle <arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] =currEle;
        }
    }
    public static void main(String[] args) {
        int[] arr = {78,56,23,20,25,89,90};
        inSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
