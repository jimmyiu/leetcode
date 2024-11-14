package p88;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        int mLast = m - 1, nLast = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (mLast == -1 || nLast == -1) {
                break;
            } else if (nums1[mLast] > nums2[nLast]) {
                nums1[i] = nums1[mLast--];
            } else {
                nums1[i] = nums2[nLast--];
            }
        }
        for (int i = nLast; i >= 0; i--) {
            nums1[i] = nums1[nLast - 1];
        }
    }
}