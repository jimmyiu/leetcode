package p121

object Solution {
  fun maxProfit(prices: IntArray): Int {
    var min = Int.MAX_VALUE
    var result = 0
    for (current in prices) {
      if (min > current) {
        min = current
      }
      val currentSpot = current - min
      if (result < currentSpot) {
        result = currentSpot
      }
    }
    return result
  }
}