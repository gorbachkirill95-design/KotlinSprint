package org.example.lesson1

fun main() {

    val allSeconds: Int = 6480
    val hours: Int = allSeconds / 3600
    val minutes: Int = (allSeconds % 3600) / 60
    val seconds: Int = allSeconds % 60
    var hourString: String = hours.toString()
    var minuteString: String = minutes.toString()
    var secondString: String = seconds.toString()

    if (hourString.length == 1) {
        hourString = "0$hours"
    }
    if (minuteString.length == 1) {
        minuteString = "0$minuteString"
    }
    if (secondString.length == 1) {
        secondString = "0$secondString"
    }

    println("Общее время в космосе: $hourString:$minuteString:$secondString")

//    println("Общее время в космосе: %02d:%02d:%02d".format(hours, minutes, seconds))
//    потом я нагуглил про метод .format,
//    оставил оба варианта


}