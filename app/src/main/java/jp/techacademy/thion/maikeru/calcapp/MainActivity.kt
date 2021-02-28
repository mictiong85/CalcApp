package jp.techacademy.thion.maikeru.calcapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var hasBeenClicked=0
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent=Intent(this, SecondActivity::class.java)
        val a:Double=editText1.text.toString().toDouble()
        val b:Double=editText2.text.toString().toDouble()
        var c:Double=0.00

        if(a!=null && b!=null){
            when(v.id){
                R.id.button1 -> {
                    Log.d("Button", "1")
                    c = a + b
                }
                R.id.button2 -> {
                    Log.d("Button", "2")
                    c = a - b
                }
                R.id.button3 -> {
                    Log.d("Button", "3")
                    c = a * b
                }
                R.id.button4 -> {
                    Log.d("Button", "4")
                    c = a / b
                }

            }
            intent.putExtra("VALUE1", c)
            startActivity(intent)
        } else{
            val snackbar=Snackbar.make(v, "Pls Input Digit", Snackbar.LENGTH_LONG)
            snackbar.show()
        }




    }
}