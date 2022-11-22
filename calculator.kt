fun main()  {
    print("please enter the first number ")
    val num1str = readLine()
    val num1: Int = Integer.parseInt(num1str)


    print("please enter the second number ")
    val num2str = readLine()
    val num2: Int = Integer.parseInt(num2str)


    println("Type 1 for addition")
    println("Type 2 for subtraction")
    println("Type 3 for multiplication")
    println("Type 4 for division")


    val cal = readLine()
    if (cal == "1"){
        print("The sum is ${num1 + num2}")
    }

    if (cal == "2"){
        print("The difference is ${num1 - num2}")
}
    if (cal == "3") {
        print("The product is ${num1 * num2}")
    }
    if (cal == "4"){
        print("The division is ${num1 / num2}")
    }
}