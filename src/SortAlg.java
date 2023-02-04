import java.util.Arrays;

public class SortAlg {

    private static void swap(int i, int j, int[] arr) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    public static void mergeSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        mergeSort(left, right, arr);
    }

    private static void mergeSort(int left, int right, int[] arr) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(left, mid, arr);
        mergeSort(mid + 1, right, arr);
        merge(left, right, mid, arr);
    }

    private static void merge(int left, int right, int mid, int[] arr) {
        int[] leftHalf = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightHalf = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int indexLeft = 0, indexRight = 0;
        int indexArr = left;

        while (indexLeft < leftHalf.length && indexRight < rightHalf.length) {
            if (leftHalf[indexLeft] < rightHalf[indexRight]) {
                arr[indexArr] = leftHalf[indexLeft];
                indexLeft++;
            } else {
                arr[indexArr] = rightHalf[indexRight];
                indexRight++;
            }
            indexArr++;
        }

        while (indexLeft < leftHalf.length) {
            arr[indexArr++] = leftHalf[indexLeft++];
        }
        while (indexRight < rightHalf.length) {
            arr[indexArr++] = rightHalf[indexRight++];
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(i, j, arr);
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(i, min, arr);
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                }
            }
        }
    }
}
