fun main(){
    var arrayNum = Array(3){IntArray(3)}

    for (i in 0..2){
        for (j in 0..2){
            print("Enter Matrix index of [$i][$j]: ")
            arrayNum[i][j] = readLine()!!.toInt()
        }

    }
    println("Normal Matrix is")
    for (i in 0..2){
        for (j in 0..2){
            print(arrayNum[i][j])
            print(" ")
        }
        println()
    }

    println("Matrix Transpose is")
    for (i in 0 .. 2){
        for (j in 0..2){
            print(arrayNum[j][i])
            print(" ")
        }
        println()
    }
}