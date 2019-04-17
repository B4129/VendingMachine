package com.example.vendingmachine.valueobject.money

class Bill(val value: Int) {
    init {
        if (value == 1000 or 2000 or 5000 or 10000) throw IllegalArgumentException()
    }
}