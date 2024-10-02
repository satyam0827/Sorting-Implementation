import java.util.Arrays;

public class MergeSort {

    //conquer
    public static void merge(int [] arr, int starIdx,int endIdx, int midIdx){

        int[] merged = new int[endIdx-starIdx+1];

        int left = starIdx;
        int right = midIdx+1;
        int i = 0;

        while (left<=midIdx && right<=endIdx) {
            if(arr[left]<arr[right]){
                merged[i++] = arr[left++];
            }else{
                merged[i++] = arr[right++];
            }
        }
        while (left<=midIdx) {
            merged[i++] = arr[left++];
        }

        while (right<=endIdx) {
            merged[i++] =arr[right++];
        }

        for(int j = 0,k= starIdx; j<merged.length; k++,j++){
                arr[k]  = merged[j];
        }

    }

//divide
    public static void divide(int[] arr, int starIdx, int endIdx) {
        if (starIdx >= endIdx) {
            return;
        }

        int mid = starIdx + (endIdx - starIdx) / 2;
        divide(arr, starIdx, mid);
        divide(arr, mid + 1, endIdx);
        merge(arr, starIdx, endIdx, mid);
    }

    //main function
    public static void main(String[] args) {
        int[] arr = { 78, 56, 23, 20, 25, 89, 90 };
        divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
