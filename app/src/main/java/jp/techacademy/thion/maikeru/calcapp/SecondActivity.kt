package jp.techacademy.thion.maikeru.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val value1=intent.getDoubleExtra("VALUE1",0.0)
        Log.d("UI_PARTS","VALUE1=$value1")
        textView1.text= value1.toString()
    }


}