fun main() {

    var i = 0
    while (i < 100){
        if (i < 50) {
            println("$i continue")
            ++i
            continue
        }else if (i == 50){
            println("$i break")
            break
        }
    }

}