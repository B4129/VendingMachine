package com.example.vendingmachine.drink

import java.lang.IllegalArgumentException

class Size(
    val value:Int

) {
    init {
        if(value != 350 or 500)throw IllegalArgumentException("サイズ異常")
    }
}