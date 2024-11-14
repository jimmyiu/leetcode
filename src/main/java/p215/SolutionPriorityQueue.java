package p215;

import java.util.PriorityQueue;

public class SolutionPriorityQueue {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            priorityQueue.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            priorityQueue.add(nums[i]);
            priorityQueue.remove();
        }
        return priorityQueue.peek();
    }
}
