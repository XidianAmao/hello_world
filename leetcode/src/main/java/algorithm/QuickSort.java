package algorithm;

import java.util.Arrays;

/**
 * 快排，双边循环法
 * 从数组两边交替遍历元素
 */
public class QuickSort {
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

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int left = start;
        int right = end;
        //!=
        while (left != right) {
            //<= 有相同数字时候，要比较小于等于的情况

            //如果定义最左侧为中间数，则需要先从右侧开始判断要交换的数
            while (left < right && arr[right] > pivot) {
                right--;
            }

            while (left < right && arr[left] <= pivot) {
                left++;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        //选定的基准数一直位于最左侧，所以最后需要和重合点的值交换
        //pivot和指针重合点交换，
        arr[start] = arr[left];
        arr[left] = pivot;

        return left;
    }
}
