package hackerrank

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PassingSubjectsTest {
  @Test
  fun `given test case`() {
    assertThat(
      maxSubjectsNumber(
        answered = arrayOf(2, 4),
        needed = arrayOf(4, 5),
        q = 1
      )
    ).isEqualTo(1)
  }
  @Test
  fun `all passed`() {
    assertThat(
      maxSubjectsNumber(
        answered = arrayOf(4, 4),
        needed = arrayOf(0, 0),
        q = 0
      )
    ).isEqualTo(2)
  }
  @Test
  fun `large int`() {
    assertThat(
      maxSubjectsNumber(
        answered = arrayOf(1, 2, 3, 4, 5, 0, 0),
        needed = arrayOf(100, 100, 100, 100, 100, 100, 100),
        q = 1000000000
      )
    ).isEqualTo(7)
  }

  @Test
  fun `no pass`() {
    assertThat(
      maxSubjectsNumber(
        answered = arrayOf(1, 2, 3, 4, 5, 0, 0),
        needed = arrayOf(100, 100, 100, 100, 100, 100, 100),
        q = 0
      )
    ).isEqualTo(0)
  }

  @Test
  fun `random`() {
    assertThat(
      maxSubjectsNumber(
        answered = arrayOf(1, 2, 3, 4, 5, 0, 999_999_999),
        needed = arrayOf(1, 100, 5, 100, 100, 0, 1_000_000_000),
        q = 2
      )
    ).isEqualTo(3)
  }

  private fun maxSubjectsNumber(answered: Array<Int>, needed: Array<Int>, q: Int): Int {
    return PassingSubjects.maxSubjectsNumber(
      answered.toIntArray(), needed.toIntArray(), q
    )
  }
}