package p121

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import toIntArray

class SolutionTest {
  @ParameterizedTest
  @CsvSource(
    "0",
    "3",
    "10",
  )
  fun `given single day price, should always return 0`(pricesStr: String) {
    val prices = pricesStr.toIntArray()
    // when
    val actual = Solution.maxProfit(prices)
    // then
    assertThat(actual).isEqualTo(0)
  }
  @ParameterizedTest
  @CsvSource(
    "3-2-1",
    "0-0-0",
  )
  fun `given non-increasing prices, should always return 0`(pricesStr: String) {
    val prices = pricesStr.toIntArray()
    // when
    val actual = Solution.maxProfit(prices)
    // then
    assertThat(actual).isEqualTo(0)
  }
  @ParameterizedTest
  @CsvSource(
    "0-1-10000",
    "0-1-1-10000",
  )
  fun `given increasing prices, should return the difference between first and last element`(pricesStr: String) {
    val prices = pricesStr.toIntArray()
    // when
    val actual = Solution.maxProfit(prices)
    // then
    assertThat(actual).isEqualTo(10000)
  }
  @ParameterizedTest
  @CsvSource(
    "0-3-2-10, 10",
    "0-3-2-10-0, 10",
    "10-0-3-2-10-0, 10",
    "11-0-3-2-10-0, 10",
    "7-1-5-3-6-4, 5",
    "7-6-4-3-1, 0",
    "2-1-2-1-0-1-2, 2",
    "10-5-10-0, 5",
    "3-2-6-5-0-3, 4",
    "15-20-0-10, 10",
  )
  fun `given random trend prices, should return the maximum different of the strictly increasing sequence`(
    pricesStr: String,
    expected: Int
  ) {
    val prices = pricesStr.toIntArray()
    // when
    val actual = Solution.maxProfit(prices)
    // then
    assertThat(actual).isEqualTo(expected)
  }
}