package p242

object Solution {
  fun isAnagram(s: String, t: String): Boolean {
    if (s == t) return true
    val map1 = s.groupingBy { it }.eachCount()
    val map2 = t.groupingBy { it }.eachCount()
    return map1 == map2
  }
}