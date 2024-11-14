package p242

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class SolutionTest {
  @ParameterizedTest
  @CsvSource(
    "cat,cat",
    "anagram,nagaram",
  )
  fun `given anagram strings, return true`(s: String, t: String) {
    val actual = Solution.isAnagram(s, t)
    assertThat(actual).isTrue()
  }
  @ParameterizedTest
  @CsvSource(
    "rat,car"
  )
  fun `given non-anagram strings, return false`(s: String, t: String) {
    val actual = Solution.isAnagram(s, t)
    assertThat(actual).isFalse()
  }
}
