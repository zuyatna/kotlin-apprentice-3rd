fun main() {
    for (day in DayOfTheWeek.values()) {
        println("Day ${day.ordinal}: ${day.name}, is weekend: ${day.isWeekend}")
    }
    println()

    val dayIndex = 0
    val dayAtIndex = DayOfTheWeek.values()[dayIndex]
    println("Day at $dayIndex is $dayAtIndex")

    val tuesday = DayOfTheWeek.valueOf("Tuesday")
    println("Tuesday is day ${tuesday.ordinal}")
    println()

    val today = DayOfTheWeek.today()
    val isWeekend = "It is ${if (today.isWeekend) "" else "not"} the weekend"
    println("It is $today. $isWeekend")

    val secondDay = DayOfTheWeek.Tuesday
    val daysUntil = today.daysUntil(secondDay)
    println("It is $today. $isWeekend. There are $daysUntil days until $secondDay.")
}