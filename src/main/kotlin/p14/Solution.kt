package p14

object Solution {
  fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var result = ""
    val minLength = strs.minBy { it.length }.length
    for (i in 0..<minLength) {
      val char = strs[0][i]
      if (strs.all { it[i] == char }) {
        result += char
      } else {
        break
      }
    }
    return result
  }
}