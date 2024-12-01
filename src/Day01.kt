import kotlin.math.abs

fun main() {

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")

    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()

    input.forEach { line ->
        val values = line.split("   ").map { it.toInt() }
        list1.add(values[0])
        list2.add(values[1])
    }

    list1.sort()
    list2.sort()

    val solution1 = list1.mapIndexed { index, i -> abs(i-list2[index]) }.sum()

    val solution2 = list1.sumOf { i ->
        i * list2.count { i == it }
    }

    println(solution1)
    println(solution2)
}
