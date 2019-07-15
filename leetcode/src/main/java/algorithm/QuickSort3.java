package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 快排，非递归实现
 * 引入一个存储map类型元素的栈，用于存储每一次交换变动时起始的下标和结束下标
 */
public class QuickSort3 {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 4, 6, 5, 3, 2, 8, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        Stack<Map<String, Integer>> quickSortStack = new Stack<Map<String, Integer>>();
        //整个数列的起始下标，以哈希的形式入栈
        Map rootParam = new HashMap();
        rootParam.put("start", start);
        rootParam.put("end", end);
        quickSortStack.push(rootParam);

        while (!quickSortStack.empty()) {
            Map<String, Integer> param = quickSortStack.pop();
            int pivot = partition(arr, param.get("start"), param.get("end"));
            if (param.get("start") < pivot - 1) {
                Map<String, Integer> left = new HashMap<String, Integer>();
                left.put("start", param.get("start"));
                left.put("end", pivot - 1);
                quickSortStack.push(left);
            }
            if (param.get("end") > pivot + 1) {
                Map<String, Integer> right = new HashMap<String, Integer>();
                right.put("start", pivot + 1);
                right.put("end", param.get("end"));
                quickSortStack.push(right);
            }
        }
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
