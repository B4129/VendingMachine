package com.example.vendingmachine.valueobject.money

class Coin(val value: Int ) {
    init {
        if (value == 10 or 50 or 100 or 500) throw IllegalArgumentException()
    }
}