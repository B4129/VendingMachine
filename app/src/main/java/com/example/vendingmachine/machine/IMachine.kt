package com.example.vendingmachine.machine


interface IMachine {
    fun countMoney()
    fun receiveMoney():Boolean
    fun outputMoney():Int
    fun onButtonLight()
    fun offButtonLight()
    fun onButtonClick(buttonNumber:Int)
}
