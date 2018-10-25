package Model

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class TimeModel {
    fun getCurrentTime(): String{
        var time = LocalDateTime.now()

        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
    }

    fun  getCurrentDay(): String{
//        var calendar = Calendar.getInstance()
        return "in development...."
    }

    fun getFullDate(): String{
        var time = LocalDateTime.now()

        return time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
    }
}