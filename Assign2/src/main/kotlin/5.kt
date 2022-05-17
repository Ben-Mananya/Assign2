fun main(){
    var arrayScore = IntArray(10)

    for(i in 1..10) {
        var score = (49..99).random()
        println("Score of student $i is $score")
        arrayScore[i - 1] = score
        }
    println()

    println("Calculation Grade..")
    for (i in 0..9) {
            when (arrayScore[i]) {
                in 80..100 -> println("Grade of student " + (i + 1) + " is A")
                in 75..79 -> println("Grade of student "+ (i + 1) + " is B+")
                in 70..74 -> println("Grade of student "+ (i + 1) + " is B")
                in 65..69 -> println("Grade of student "+ (i + 1) + " is C+")
                in 60..64 -> println("Grade of student "+ (i + 1) + " is C")
                in 55..59 -> println("Grade of student "+ (i + 1) + " is D+")
                in 50..54 -> println("Grade of student "+ (i + 1) + " is D")
                in 0..49 -> println("Grade of student "+ (i + 1) + " is F")
                else -> println("ไปเรียนใหม่นะ...")
            }

        }
    }
