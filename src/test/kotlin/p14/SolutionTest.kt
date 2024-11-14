package p14

import ArgProvider
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.ArgumentsSource

class SolutionTest {
  @ParameterizedTest
  @ArgumentsSource(TestCase::class)
  fun `can test`(input: Array<String>, expected: String) {
    // when
    val actual = Solution.longestCommonPrefix(input)
    // then
    assertThat(actual).isEqualTo(expected)
  }

  private class TestCase : ArgProvider(
    arguments(arrayOf<String>(), ""),
    arguments(arrayOf("", ""), ""),
    arguments(arrayOf("flower", "flow", "flight"), "fl"),
    arguments(arrayOf("dog", "racecar", "car"), ""),
    arguments(arrayOf("cir", "car"), "c"),
  )
}