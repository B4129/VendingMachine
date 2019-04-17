package com.example.vendingmachine.machine


interface IMachine {
    fun countMoney():Int
    fun outputMoney():Int
    fun onButtonLight()
    fun offButtonLight()
}
