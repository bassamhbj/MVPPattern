import Presenter.MainViewPresenter

import java.util.Scanner

fun main(args: Array<String>){
    var main = MainView()
    main.program()
}

class MainView : MainViewPresenter.MainViewListener {
    var _presenter: MainViewPresenter

    init {
        _presenter = MainViewPresenter(this)
    }

    fun program(){
        println("Please, select and option: ")
        println("${Tools.ActionMode.TIME.value} - Get current time")
        println("${Tools.ActionMode.DAY.value} - Get current day")
        println("${Tools.ActionMode.FULL_DATE.value} - Get full date")
        println("${Tools.ActionMode.END.value} - Exit")

        print("Option: ")

        val scanner = Scanner(System.`in`)
        var action = scanner.nextInt()

        println("Processing...")

        processAction(action)
    }

    private fun processAction(action:Int){
        when(action){
            Tools.ActionMode.TIME.value -> _presenter.setCurrentTime()
            Tools.ActionMode.DAY.value -> _presenter.setCurrentDay()
            Tools.ActionMode.FULL_DATE.value -> _presenter.setFullDate()
            Tools.ActionMode.END.value -> return
        }
    }

    /* --- Override Methods --- */
    override fun setCurrentTime(currentTime: String) {
        println("Current time: $currentTime")
        program()
    }

    override fun setCurrentDay(currentDay: String) {
        println("Current day: $currentDay")
        program()
    }

    override fun setFullDate(fullDate: String) {
        println("Full Date: $fullDate")
        program()
    }
}