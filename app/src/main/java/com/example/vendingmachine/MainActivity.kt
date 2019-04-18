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
        //???がユーザにお金の投入を促す
        announce.say("お金を投入してください")
        //ユーザがお金入れる
        human.insertMoney()
        //自販機がユーザのお金受け取る
        if (!machine.receiveMoney())
            announce.say("正しい通貨を入れて下さい")
        //自販機が受け取った金額数える
        machine.countMoney()
        //自販機で買える商品のライト光らせる
        machine.onButtonLight()
        //???がユーザに商品の購入を促す(取り消しか購入か)
        announce.say("商品を選んでください")
        //購入の場合

        //ユーザが商品の購入を行う
        machine.onButtonClick()
        //自販機がボタンのライトを消す
        //自販機が受け取った金額数える
        //自販機が数えた金額が押したボタンの金額以上の場合
        //商品の在庫を減らす
        //商品を出す
        //お釣りを出す
        //自販機が数えた金額が押したボタンの金額以下の場合
        //お金を入れる処理に戻す
        //自販機が取り消し処理を行う


    }
}
