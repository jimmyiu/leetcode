package p27

import ArgProvider
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.ArgumentsSource

class SolutionTest {
  @Test
  fun `given nums is an empty array, should always return k = 0, and nums remains empty`() {
    val nums = intArrayOf()
    val value = 1 // whatever
    // when
    val k = Solution.removeElement(nums, value)
    //
    assertThat(k).isEqualTo(0)
    assertThat(nums).isEmpty()
  }
  @Test
  fun `given nums contains all elements are the inputted value`() {
    val value = 1
    val nums = intArrayOf(value, value, value)
    // when
    val k = Solution.removeElement(nums, value)
    //
    assertThat(k).isEqualTo(0)
  }
  @Test
  fun `given (3,2) and remove 3, should return (2) and 1`() {
    val nums = intArrayOf(3, 2)
    val value = 3
    // when
    val k = Solution.removeElement(nums, value)
    // then
    assertThat(k).isEqualTo(1)
    assertThat(nums).startsWith(2)
  }
  @ParameterizedTest
  @ArgumentsSource(TestCaseProvider::class)
  fun `given test case 1`(nums: IntArray, value: Int, k: Int, expected: IntArray) {
    // when
    val actual = Solution.removeElement(nums, value)
    // then
    assertThat(actual).isEqualTo(k)
    assertThat(nums).startsWith(*expected)
  }

  class TestCaseProvider : ArgProvider(
    arguments(intArrayOf(3, 2, 2, 3), 3, 2, intArrayOf(2, 2)),
//    arguments(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2, 5, intArrayOf(0, 1, 3, 0, 4)),
  )
}