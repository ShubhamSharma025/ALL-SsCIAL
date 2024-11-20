import java.util.Arrays;

public class quicksort {

    public static void main(String[] args) {
        int[] array = {4, 6, 2, 5, 7, 9, 1, 3};

        System.out.println("Before sorting: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("After sorting: " + Arrays.toString(array));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
