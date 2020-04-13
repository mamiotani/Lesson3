
package jp.techacademy.mami.ootani

import android.util.Log

class Human: Animal {

    constructor(name: String, age: Int) : super(name, age) {

        fun say() {
            Log.d("kotlintest", "私の名前は" + "(" + this.name + "です。)" + "歳は" + "(" + this.age + "歳です。)")
        }
    }
}

class Human: Thinkable {
    var hobby :String

    constructor(hobby: String) {
        this.hobby= hobby
    }
    override fun think() {
        Log.d("kotlintest", "私は" + "("+ this.hobby + "について考える。)")
    }
}
