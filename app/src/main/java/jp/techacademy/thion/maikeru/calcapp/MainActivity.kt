package jp.techacademy.thion.maikeru.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent=Intent(this,SecondActivity::class.java)
        val a:Double=editText1.text.toString().toDouble()
        val b:Double=editText2.text.toString().toDouble()
        var c:Double=0.00
        c=a+b
        val d=c.toString()
        intent.putExtra("VALUE1","${editText1.text.toString().toInt()}")

        Log.d("UIPARTS","$a")
        Log.d("UIPARTS","$b")
        Log.d("UIPARTS","$c")
        Log.d("UIPARTS",d)
        startActivity(intent)
    }
}