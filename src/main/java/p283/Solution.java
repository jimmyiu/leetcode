package p283;

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        while (left < nums.length && nums[left] != 0) left++;
        for (int right = left + 1; right < nums.length; right++) {
            if (nums[right] != 0) {
                swap(nums, left++, right);
            }
        }
    }

    private void swap(int[] nums, int x, int y) {
        final int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}
