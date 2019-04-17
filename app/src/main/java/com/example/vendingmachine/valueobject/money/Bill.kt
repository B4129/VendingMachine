package com.example.vendingmachine.valueobject.money

class Bill(value: Int):IMoney {
    override val valueArrayList:MutableList<Int> = mutableListOf(5,10,50,100,500)
    init {
        if (value !in valueArrayList) throw IllegalArgumentException()
    }
}