package com.example.vendingmachine.valueobject.drink

interface IDrink {
    val status: String
    val name: Name
    val price: Price
    val amount: Amount
    val size: Size
}