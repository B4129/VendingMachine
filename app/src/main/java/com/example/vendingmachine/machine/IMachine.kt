package com.example.vendingmachine.machine


interface IMachine {
    fun countMoney()
    fun receiveMoney()
    fun outputMoney():Int
    fun onButtonLight()
    fun offButtonLight()
    fun onButtonClick(buttonNumber:Int)
    fun offButtonLight(buttonNumber: Int)
    fun onButtonLight(buttonNumber: Int)
    fun countMoney(money: Any)
    fun receiveMoney(money: Any)
}
