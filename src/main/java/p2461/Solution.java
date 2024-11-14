package p2461;

import java.util.Hashtable;

class Solution {
    private class Data {
        public Data(int k) {
            this.k = k;
        }
        int k = 0;
        long sum = 0;
        private Hashtable<Integer, Integer> map = new Hashtable<>();

        public void add(int num) {
            sum += num;
            map.merge(num, 1, Integer::sum);
        }

        public void remove(int num) {
            sum -= num;
            int count = map.merge(num, -1, Integer::sum);
            if (count == 0) {
                map.remove(num);
            }
        }

        public boolean isClean() {
            return map.size() == k;
        }
    }

    public long maximumSubarraySum(int[] nums, int k) {
        Data data = new Data(k);
        for (int i = 0; i < k; i++) {
            data.add(nums[i]);
        }
        long max = data.isClean() ? data.sum : 0;
        for (int i = k; i < nums.length; i++) {
            data.remove(nums[i - k]);
            data.add(nums[i]);
            if (data.isClean() && max < data.sum) {
                max = data.sum;
            }
        }
        return max;
    }
}