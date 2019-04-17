package com.example.vendingmachine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //???がユーザにお金の投入を促す
        //ユーザがお金入れる
        //自販機がユーザのお金受け取る
        //自販機が受け取った金額数える
        //自販機で買える商品のライト光らせる
        //???がユーザに商品の購入を促す(取り消しか購入か)
        //購入の場合
            //ユーザが商品の購入を行う
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
