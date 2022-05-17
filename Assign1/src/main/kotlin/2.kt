fun main(args: Array<String>) {
    print("Input your score: ")
    val score = readLine()!!.toInt() //readLine() = input

    when (score) {
        in 80..100 -> println("Your grade is A")
        in 75..79 ->  println("Your grade is B+")
        in 70..74 ->  println("Your grade is B")
        in 65..69 ->  println("Your grade is C+")
        in 60..64 ->  println("Your grade is C")
        in 55..59 ->  println("Your grade is D+")
        in 50..54 ->  println("Your grade is D")
        in 0..49 ->  println("Your grade is F")
        else -> println("Input Between 0-100!!!")
    }
/*   if(score>100) {
        println("Input Between 0-100!!!")
    }else if(score>79){
        println("Your grade is A")
    }else if(score>=75){
        println("Your grade is B+")
    }else if(score>=70){
        println("Your grade is B")
    }else if(score>=65){
        println("Your grade is C+")
    }else if(score>=60){
        println("Your grade is C")
    }else if(score>=55){
        println("Your grade is D+")
    }else if(score>=50){
        println("Your grade is D")
    }else if(score>=0){
        println("Your grade is F")
    }else{
        println("Input Between 0-100!!!")
    }*/

}