package hackerrank

import org.junit.jupiter.api.Test

class MeetingSchedulesTest {
  @Test
  fun `test 1`() {
    MeetingSchedules.findAvailabilities(
      120,
      arrayOf(
        "16 00 17 00",
        "10 30 14 30",
        "20 45 22 15",
        "10 00 13 15",
        "09 00 11 00"
      )
    )
  }
  @Test
  fun `test 2`() {
    MeetingSchedules.findAvailabilities(
      60,
      arrayOf(
        "08 00 10 15",
        "22 00 23 15",
        "17 00 19 00",
        "07 00 09 45",
        "09 00 13 00",
        "16 00 17 45",
        "12 00 13 30",
        "11 30 12 30"
      )
    )
  }
  @Test
  fun `test 3`() {
    MeetingSchedules.findAvailabilities(
      1,
      arrayOf(
        "00 01 00 02"
      )
    )
  }
  @Test
  fun `test 4`() {
    MeetingSchedules.findAvailabilities(
      120,
      arrayOf(
        "10 00 14 00",
        "11 30 12 30",
        "15 00 15 01"
      )
    )
  }
}