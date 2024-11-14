package p88

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class SolutionTest {
  @Test
  fun `test boundary case, n = 0`() {
    val nums1 = intArrayOf(1, 3)
    runMerge(nums1, intArrayOf())
    // then
    val expected = nums1
    assertThat(nums1).containsExactly(*expected)
  }
  @ParameterizedTest
  @CsvSource(
    "1",
    "1;2;4;5"
  )
  fun `test boundary case, m = 0`(nums2Str: String) {
    val nums2 = toIntArray(nums2Str)
    val n = nums2.size
    val nums1 = IntArray(n)
    runMerge(nums1, nums2)
    // then
    val expected = nums2;
    assertThat(nums1).containsExactly(*expected)
  }
  @ParameterizedTest
  @CsvSource(
    "1;0,2,1;2",
    "1;2;3;0;0;0,2;5;6,1;2;2;3;5;6",
    "4;0;0;0;0;0,1;2;3;5;6,1;2;3;4;5;6",
  )
  fun `test merge case`(nums1Str: String, nums2Str: String, expectedStr: String) {
    val nums1 = toIntArray(nums1Str)
    val nums2 = toIntArray(nums2Str)
    runMerge(nums1, nums2)
    // then
    val expected = toIntArray(expectedStr)
    assertThat(nums1).containsExactly(*expected)
  }

  private fun runMerge(nums1: IntArray, nums2: IntArray) {
    SolutionKt.merge(nums1, nums1.size - nums2.size, nums2, nums2.size)
  }

  private fun toIntArray(nums2Str: String) = nums2Str.split(';').map { it.toInt() }.toIntArray()
}