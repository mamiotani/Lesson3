package jp.techacademy.mami.ootani

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3)

        dog.move()

        val hunman = Human("大谷真実", 26,  "ボランティア活動")

        human.say()
        human.think()
    }
}