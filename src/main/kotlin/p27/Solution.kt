package p27

object Solution {
  fun removeElement(nums: IntArray, `val`: Int): Int {
    if (nums.isEmpty()) return 0
    val count = nums.count { it == `val` }
    if (count == 0) return nums.size
    else if (count == nums.size) return 0

    var processed = 0;
    var matchedCount = 0;
    var current = 0;

    while (processed < nums.size) {
      if (nums[current] == `val`) {
        matchedCount++
        // replace the matching value by a non-processed value
        nums[current] = nums[nums.size - matchedCount]
      } else {
        current++
      }
      processed++
    }
    return nums.size - matchedCount
  }

  private fun IntArray.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
  }
}