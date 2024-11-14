package p141

object Solution {
  fun hasCycle(head: ListNode?): Boolean {
    val values = mutableSetOf<ListNode>()
    var current = head
    while (current?.next != null) {
      if (values.contains(current)) return true
      values.add(current)
      current = current.next
    }
    return false
  }

  data class ListNode(var `val`: Int) {
    var next: ListNode? = null
  }
}