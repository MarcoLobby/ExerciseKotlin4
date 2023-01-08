package it.DevelHope.ExerciseKotlin4

// Write a loop that prints numbers from 1 to 100, increasing by 2 (so 1, 3, 5...). Use two different printing functions for values below 50 and values above 50.

fun main(){
    for (i in 1..100 step 2){
        if (i < 50){printSmall(i)}
        else {printBig(i)}
    }
}

fun printSmall(number: Int) {
    println("Small Number $number")
}

fun printBig(number: Int) {
    println("Big Number $number")
}




