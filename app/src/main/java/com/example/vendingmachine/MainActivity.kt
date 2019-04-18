package com.example.vendingmachine

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.vendingmachine.announce.Announce
import com.example.vendingmachine.human.Human
import com.example.vendingmachine.machine.Machine
import com.example.vendingmachine.valueobject.money.Wallet

class MainActivity : AppCompatActivity() {
    private val announce = Announce()
    private val wallet = Wallet()
    private val machine = Machine()
    private val human = Human(wallet)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        announce.say("お金を投入してください")
        human.insertMoney(10)

        announce.say("商品を選んでください")
        //商品選ぶ処理
        //購入の場合
            //ユーザが商品の購入を行う
            machine.onButtonClick(1)

    }
}
