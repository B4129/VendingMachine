package com.example.vendingmachine.valueobject.money

class Money(val value:Any) {
    init {
        //BillもしくはCoin以外を弾く
    }
    //お金の計算メソッド
}