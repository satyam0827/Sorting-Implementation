import java.util.Arrays;

public class QuickSort {

    // swap function
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // partition function to get pivot
    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l + 1;
        int j = h;

        while (i <= j) {
            while (i <= h && arr[i] <= pivot) 
                i++;
            while (arr[j] > pivot) 
                j--;

            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);  // place pivot at its correct position
        return j;
    }

    // Quick sort implementation
    public static void quickSort(int[] arr, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return;
        }

        int pivot = partition(arr, startIdx, endIdx);
        quickSort(arr, startIdx, pivot - 1);  
        quickSort(arr, pivot + 1, endIdx);   
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 25, 23, 21};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
