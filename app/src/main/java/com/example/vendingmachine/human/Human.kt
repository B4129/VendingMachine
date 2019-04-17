package com.example.vendingmachine.human

import com.example.vendingmachine.valueobject.drink.IDrink
import com.example.vendingmachine.valueobject.money.Wallet

class Human(
    val wallet: Wallet
     //TODO 所持しているドリンク情報を持たせたい
) {
    fun insertMoney(wallet:Wallet){
       //TODO  自販機にお金を入れる処理
    }

    fun drinkDrink(drink:IDrink){
        //TODO ドリンクを飲む処理
    }
    fun buyWallet(wallet:Wallet){
        //TODO 財布をグレードアップする処理
    }
}