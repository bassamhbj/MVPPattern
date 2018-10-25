package Presenter

import Model.TimeModel

class MainViewPresenter(val view: MainViewListener) {

    private var _timeModel: TimeModel

    init {
        _timeModel = TimeModel()
    }

    fun setCurrentTime(){
        view.setCurrentTime(_timeModel.getCurrentTime())
    }

    fun setCurrentDay(){
        view.setCurrentDay(_timeModel.getCurrentDay())
    }

    fun setFullDate(){
        view.setFullDate(_timeModel.getFullDate())
    }

    interface MainViewListener{
        fun setCurrentTime(currentTime: String)
        fun setCurrentDay(currentDay: String)
        fun setFullDate(fullDate: String)
    }
}