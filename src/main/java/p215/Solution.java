package p215;

import java.util.Arrays;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1, targetIndex = nums.length - k;
        while (left < right) {
            int pivotIndex = partition(nums, left, right);
            if (pivotIndex == targetIndex) {
                return nums[targetIndex];
            } else if (pivotIndex < targetIndex) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }
        return nums[targetIndex];
    }

    private int partition(int[] nums, int left, int right) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        int pivot = nums[(left + right) >>> 1];
        int lo = left, hi = right;
        for (int i = left; i <= right; i++) {
            if (copy[i] < pivot) {
                nums[lo++] = copy[i];
            } else if (copy[i] > pivot) {
                nums[hi--] = copy[i];
            }
        }
        for (int i = lo; i <= hi; i++) {
            nums[i] = pivot;
        }
        return (lo + hi) >>> 1;
    }

    private static void debugNums(int[] nums, int left, int right) {
        for (int i = left; i <= right; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("");
    }

    private static void swap(int[] nums, int lo, int i) {
        final int tmp = nums[lo];
        nums[lo] = nums[i];
        nums[i] = tmp;
    }
}
