import java.util.Arrays;

class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 2, 7, 89, 45, 23, 54 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}