package list;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2020/2/6 11:14 上午
 */
public class LeetCode1300 {
    public static void main(String[] args) {
        LeetCode1300 l = new LeetCode1300();
//        int[] arr = {60864, 25176, 27249, 21296, 20204};
//        int target = 56803;
        int[] arr = {4,9,3};
        int target = 10;
        int bestValue = l.findBestValue(arr, target);
        System.out.println(bestValue);
    }

    public int findBestValue(int[] arr, int target) {
        int left = 0;
        int right = 100_000;

        while (left < right) {
            int mid = (left + right) >>> 1;
            int sum = calculateSum(arr, mid);
            // 计算第 1 个大于等于 target 的阈值
            if (sum < target) {
                // 严格小于的一定不是解
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // 比较阈值线分别定在 left - 1 和 left 的时候与 target 的接近程度
        int sum1 = calculateSum(arr, left - 1);
        int sum2 = calculateSum(arr, left);
        if (target - sum1 <= sum2 - target) {
            return left - 1;
        }
        return left;
    }

    private int calculateSum(int[] arr, int threshold) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.min(num, threshold);
        }
        return sum;
    }
}
