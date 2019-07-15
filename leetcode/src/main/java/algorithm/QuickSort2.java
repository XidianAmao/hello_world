package algorithm;

import java.util.Arrays;

/**
 * 快排，单边循环法
 * 从数组的一端遍历元素
 */
public class QuickSort2 {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 4, 6, 5, 3, 2, 8, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int index = partition(arr, start, end);
        quickSort(arr, start, index - 1);
        quickSort(arr, index + 1, end);
    }

    @SuppressWarnings("all")
    private static int partition(int[] arr, int start, int end) {
        //基准元素
        int pivot = arr[start];
        //标记元素
        int mark = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < pivot) {
                mark++;
                int temp = arr[mark];
                arr[mark] = arr[i];
                arr[i] = temp;
            }
        }
        arr[start] = arr[mark];
        arr[mark] = pivot;
        return mark;
    }
}
