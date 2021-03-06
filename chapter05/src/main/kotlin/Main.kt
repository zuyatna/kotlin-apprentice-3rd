fun main() {
    // Ranges
    // Closed Range
//    val closedRange = 0..5
//    println(closedRange)

    // Half-Open Range
//    val halfOpenRange = 0 until 5
//    println(halfOpenRange)

    // Decreasing Range
//    val decreasingRange = 5 downTo 0
//    println(decreasingRange)

    // For Loops
//    val count = 10

    //    for (i in 1..count) {
//        sum += i
//        print("$sum ")
//    }

    // Repeat Loops
//    sum = 1
//    var lastSum = 0
//    repeat(10) {
//        val temp = sum
//        sum += lastSum
//        print("sum: $sum ")
//        lastSum = temp
//        print("lastSum: $lastSum ")
//        println()
//    }

    // Steps In Loops
//    sum = 0
//    for (i in 1..count step 2) {
//        sum += i
//        println(sum)
//    }

//    sum = 0
//    for (i in count downTo 1 step 2) {
//        sum += i
//        println(sum)
//    }

    // Labeled Statements
//    var sum = 0
//    rowLoop@ for (row in 0 until 8) {
//
//        println()
//        columnLoop@ for (column in 0 until 8) {
//            if (row == column) {
//                continue@rowLoop
//            }
//            sum += row * column
//
//            print("$sum ")
//        }
//    }

    // Mini-Exercises
    // 1.
//    val range = 1..10
//    for (i in range) {
//        println("$i^2 = ${i * i}")
//    }

    // 2. done

    // 3.
//    sum = 0
//    for (row in 1 until 8 step 2) {
////        if (row % 2 == 0) {
////            continue
////        }
//
//        for (column in 0 until 8) {
//            sum += row * column
//        }
//
//        println(sum)
//    }

    // When Expression
//    val number = 10
//    when (number) {
//        0 -> println("zero")
//        else -> println("non-zero")
//    }

    // Returning Values
//    val numberName = when (number) {
//        2 -> "two"
//        4 -> "four"
//        6 -> "six"
//        8 -> "eight"
//        10 -> "ten"
//        else -> {
//            println("unknown number")
//            "unknown"
//        }
//    }
//
//    println(numberName)

    // Advanced When Expression
//    val hourOfDay = 12
//    val timeOfDay: String
//
//    timeOfDay = when (hourOfDay) {
//        in 0..5 -> "early morning"
//        in 6..11 -> "morning"
//        in 12..16 -> "afternoon"
//        in 17..19 -> "evening"
//        in 20..23 -> "late evening"
//        else -> {
//            "invalid hour"
//        }
//    }
//
//    println(timeOfDay)

    // Mini-Exercises
//    // 1.
//    var lifeStage = when (24) {
//        in 0..2 -> "infant"
//        in 3..12 -> "child"
//        in 13..19 -> "teenager"
//        in 20..39 -> "adult"
//        in 40..60 -> "middle aged"
//        else -> {
//            "elderly"
//        }
//    }
//
//    println(lifeStage)
//
//    // 2.
//    val (name, age) = Pair("suyatna", 24)
//    lifeStage = when (age) {
//        in 0..2 -> "an infant"
//        in 3..12 -> "a child"
//        in 13..19 -> "a teenager"
//        in 20..39 -> "an adult"
//        in 40..60 -> "a middle aged"
//        else -> {
//            "elderly"
//        }
//    }
//
//    println("$name is $lifeStage")
//    println()

    // challenges
    // 1. how many iteration = 6
    var sum = 0
    for (i in 0..5) {
        sum += i
        print("$sum ")
    }
    println()
    println()

    // 2. how many instance of "a" = 10
    var aLotOfAs = ""
    println("count: ${aLotOfAs.count()}")

    while (aLotOfAs.length < 10) {
        aLotOfAs += "a"
    }
    println(aLotOfAs)
    println()

    // 3.
//    val (x, y, z) = Triple(1, 5, 0) // on the x/y plane
//    val (x, y, z) = Triple(2, 2, 2) // x = y = z
//    val (x, y, z) = Triple(3, 0, 1) // on the x/z plane
//    val (x, y, z) = Triple(3, 2, 5) // nothing special
    val (x, y, z) = Triple(0, 2, 4) // on the y/z plane

    when {
        x == y && y == z -> println("x = y = z")
        z == 0 -> println("on the x/y plane")
        y == 0 -> println("on the x/z plane")
        x == 0 -> println("on the y/z plane")
        else -> println("nothing special")
    }
    println()

    // 4. a closed range can never be empty. why?
    // because should contain range

    // 5. print a countdown from 10 to 0 without using downTo
    sum = 10
    while (sum >= 0) {
        print("$sum ")

        sum -= 1
    }
    println()

    // 6. print 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0
    var decimalIncrease = 0.0
    while (decimalIncrease <= 1.0) {
        print("${decimalIncrease.toFloat()} ")

        decimalIncrease += 0.1
    }
}