fun main(args: Array<String>) {
    var rows = 5
    for( outside in 1 .. rows){
        for(inside in 1..outside){
            print("*")
        }
    println()
    }
    for( outside in rows-1 downTo 1){
        for(inside in 1..outside){
            print("*")
        }
        println()
    }

}