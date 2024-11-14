package p88

object SolutionKt {
  fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    if (n == 0) return
    if (m == 0) return `fill array by first n number of elements`(from = nums2, to = nums1, n = n)
    var mLast = m
    var nLast = n
    for (lastIndex in m + n - 1 downTo 0) {
      if (mLast == 0 || nLast == 0) {
        merge(nums1, mLast, nums2, nLast)
        break
      }
      val max = nums1[mLast - 1] to nums2[nLast - 1]
      if (max.first > max.second) {
        nums1[lastIndex] = max.first
        mLast--
      } else {
        nums1[lastIndex] = max.second
        nLast--
      }
    }
  }

  private fun `fill array by first n number of elements`(from: IntArray, to: IntArray, n: Int) {
    for (i in 0..<n) {
      to[i] = from[i]
    }
  }
}