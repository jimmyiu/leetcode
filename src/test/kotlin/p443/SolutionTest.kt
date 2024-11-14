package p443

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun test() {
    val chars = charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')
    val actual = compress(chars)
    System.out.println(chars);
    assertThat(actual).isEqualTo(6)
    assertThat(chars).startsWith('a', '2', 'b', '2', 'c', '3')
  }

  @Test
  fun test2() {
    val chars = charArrayOf('a')
    val actual = compress(chars)
    assertThat(actual).isEqualTo(1)
    assertThat(chars).startsWith('a')
  }

  private fun compress(chars: CharArray): Int {
    var solution = p443.Solution()
    return solution.compress(chars)
  }
}