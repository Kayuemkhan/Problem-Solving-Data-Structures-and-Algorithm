fun main() {
    fun add(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber + secondNumber
    }

    val hello = "hello"

    var total =0

    var num = getNum()


    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")


}

fun getNum(): Int {
    return  1

}

