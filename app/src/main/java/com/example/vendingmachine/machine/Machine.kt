package com.example.vendingmachine.machine

import com.example.vendingmachine.valueobject.Rack

class Machine:IMachine {

    val rack= Rack()
    override fun countMoney(money: Any) {
        if(isCheckMoney(money))
            //お金を数える処理

    }

    override fun receiveMoney(money: Any) {

        countMoney()
        onButtonLight()
    }

    private fun isCheckMoney(money:Any):Boolean{
        if (/*Money型以外の場合*/true) {
            announce.say("正しい通貨を入れて下さい")
            return true
        }
    }

    override fun outputMoney(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onButtonLight(buttonNumber: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onButtonClick(buttonNumber: Int) {
        //お金が足りないとか番号があるかどうかのチェック
        offButtonLight()
        countMoney()
        //自販機が数えた金額が押したボタンの金額以上の場合
            //商品の在庫を減らす
            //商品を出す
            //お釣りを出す
        //自販機が数えた金額が押したボタンの金額以下の場合
            //お金を入れる処理に戻す(return)
            //自販機が取り消し処理を行う
    }



}