package algorithm;

import java.util.Arrays;

public class HeapSort {
    /**
     * 下沉调整
     *
     * @param array       待调整的堆
     * @param parentIndex 要下沉的父节点
     * @param length      堆的有效大小
     */
    public static void downAdjust(int[] array, int parentIndex, int length) {
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            //如果有右孩子，且右孩子大于左孩子的值，则定位到右孩子
            if (childIndex + 1 < length && array[childIndex + 1] > array[childIndex]) {
                childIndex++;
            }
            //如果父节点小于任何一个孩子的值，则直接跳出
            if (temp >= array[childIndex]) {
                break;
            }
            //无须真正交换，单向赋值即可
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;
    }

    /**
     * 堆排序（升序）
     *
     * @param array 待调整的堆
     */
    public static void heapSort(int[] array) {
        //1。把无序数组构建成最大堆
        for (int i = array.length / 2; i >= 0; i--) {
            downAdjust(array, i, array.length - 1);
        }
        System.out.println(Arrays.toString(array));
        //2.循环删除堆顶元素，移到集合尾部，调整堆产生新的堆顶
        for (int i = array.length - 1; i > 0; i--) {
            //最后1个元素和第1个元素进行交换
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            //下沉调整最大堆
            downAdjust(array, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
