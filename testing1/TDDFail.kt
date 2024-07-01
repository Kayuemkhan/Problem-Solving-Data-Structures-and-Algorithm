package testing1

import atomictest.eq

fun main() {
//    calculateBMI(160, 68) eq "Normal weight"
//    calculateBMI(100, 68) eq "Underweight"
//    calculateBMI(200, 68) eq "Overweight"

//    val result = 10.add(5)  // equivalent to 10.add(5)
//    println(result) //
//
//    val ints = listOf(99, 3, 5, 7, 11, 13)
//    ints eq "[99, 3, 5, 7, 11, 13]"
//
    val list = listOf(1,2,3,4)

    for ( i in 10 downTo 0){
        println(i)
    }

}

fun calculateBMI(
    lbs: Int,
    height: Int
): String {
    val bmi = lbs / (height * height) * 703.07
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}

infix fun Int.add(other: Int): Int {

    println(this)
    println(other)
    return this + other
}