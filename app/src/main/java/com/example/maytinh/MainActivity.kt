package com.example.maytinh

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var cong:Int = 0
        var tru:Int = 0
        var nhan:Int = 0
        var chia:Int = 0
        var A:Double ?= null
        var B:Double ?= null
        var temp:Double = 0.0
        var dot:Int ?=null
        val bt_0 = findViewById<Button>(R.id.bt_0)
        val bt_1 = findViewById<Button>(R.id.bt_1)
        val bt_2 = findViewById<Button>(R.id.bt_2)
        val bt_3 = findViewById<Button>(R.id.bt_3)
        val bt_4 = findViewById<Button>(R.id.bt_4)
        val bt_5 = findViewById<Button>(R.id.bt_5)
        val bt_6 = findViewById<Button>(R.id.bt_6)
        val bt_7 = findViewById<Button>(R.id.bt_7)
        val bt_8 = findViewById<Button>(R.id.bt_8)
        val bt_9 = findViewById<Button>(R.id.bt_9)
        val bt_dot = findViewById<Button>(R.id.bt_dot)
        val bt_bang = findViewById<Button>(R.id.bt_bang)
        val bt_cong = findViewById<Button>(R.id.bt_cong)
        val bt_tru = findViewById<Button>(R.id.bt_tru)
        val bt_nhan = findViewById<Button>(R.id.bt_nhan)
        val bt_chia = findViewById<Button>(R.id.bt_chia)
        val bt_del = findViewById<Button>(R.id.bt_del)
        val bt_delOne = findViewById<Button>(R.id.bt_delOne)

        val textNum = findViewById<TextView>(R.id.textNum)

        bt_0.setOnClickListener {
            if(dot == 1) textNum.text = textNum.text.toString()+bt_0.text.toString()
            else if(A == null) textNum.text = (textNum.text.toString().toDouble()*10+bt_0.text.toString().toDouble()).toString()
            else {
                temp = temp*10+bt_0.text.toString().toDouble()
                textNum.text = temp.toString()
            }
        }
        bt_1.setOnClickListener {
            if(dot == 1) textNum.text = textNum.text.toString()+bt_1.text.toString()
            else if(A == null) textNum.text = (textNum.text.toString().toDouble()*10+bt_1.text.toString().toDouble()).toString()
            else {
                temp = temp*10+bt_1.text.toString().toDouble()
                textNum.text = temp.toString()
            }
        }
        bt_2.setOnClickListener {
            if(dot == 1) textNum.text = textNum.text.toString()+bt_2.text.toString()
            else if(A == null) textNum.text = (textNum.text.toString().toDouble()*10+bt_2.text.toString().toDouble()).toString()
            else {
                temp = temp*10+bt_2.text.toString().toDouble()
                textNum.text = temp.toString()
            }
        }
        bt_3.setOnClickListener {
            if(dot == 1) textNum.text = textNum.text.toString()+bt_3.text.toString()
            else if(A == null) textNum.text = (textNum.text.toString().toDouble()*10+bt_3.text.toString().toDouble()).toString()
            else {
                temp = temp*10+bt_3.text.toString().toDouble()
                textNum.text = temp.toString()
            }
        }
        bt_4.setOnClickListener {
            if(dot == 1) textNum.text = textNum.text.toString()+bt_4.text.toString()
            else if(A == null) textNum.text = (textNum.text.toString().toDouble()*10+bt_4.text.toString().toDouble()).toString()
            else {
                temp = temp*10+bt_4.text.toString().toDouble()
                textNum.text = temp.toString()
            }
        }
        bt_5.setOnClickListener {
            if(dot == 1) textNum.text = textNum.text.toString()+bt_5.text.toString()
            else if(A == null) textNum.text = (textNum.text.toString().toDouble()*10+bt_5.text.toString().toDouble()).toString()
            else {
                temp = temp*10+bt_5.text.toString().toDouble()
                textNum.text = temp.toString()
            }
        }
        bt_6.setOnClickListener {
            if(dot == 1) textNum.text = textNum.text.toString()+bt_6.text.toString()
            else if(A == null) textNum.text = (textNum.text.toString().toDouble()*10+bt_6.text.toString().toDouble()).toString()
            else {
                temp = temp*10+bt_6.text.toString().toDouble()
                textNum.text = temp.toString()
            }
        }
        bt_7.setOnClickListener {
            if(dot == 1) textNum.text = textNum.text.toString()+bt_7.text.toString()
            else if(A == null) textNum.text = (textNum.text.toString().toDouble()*10+bt_7.text.toString().toDouble()).toString()
            else {
                temp = temp*10+bt_7.text.toString().toDouble()
                textNum.text = temp.toString()
            }
        }
        bt_8.setOnClickListener {
            if(dot == 1) textNum.text = textNum.text.toString()+bt_8.text.toString()
            else if(A == null) textNum.text = (textNum.text.toString().toDouble()*10+bt_8.text.toString().toDouble()).toString()
            else {
                temp = temp*10+bt_8.text.toString().toDouble()
                textNum.text = temp.toString()
            }
        }
        bt_9.setOnClickListener {
            if(dot == 1) textNum.text = textNum.text.toString()+bt_9.text.toString()
            else if(A == null) textNum.text = (textNum.text.toString().toDouble()*10+bt_9.text.toString().toDouble()).toString()
            else {
                temp = temp*10+bt_9.text.toString().toDouble()
                textNum.text = temp.toString()
            }
        }
        bt_dot.setOnClickListener {
            dot = 1
            textNum.text = textNum.text.toString().toDouble().toInt().toString()+"."
        }

        bt_cong.setOnClickListener {
            cong = 1
            tru = 0
            nhan = 0
            chia = 0
            dot = 0
            bt_cong.setTextColor(Color.RED)
            bt_tru.setTextColor(Color.WHITE)
            bt_nhan.setTextColor(Color.WHITE)
            bt_chia.setTextColor(Color.WHITE)
            A = textNum.text.toString().toDouble()
        }
        bt_tru.setOnClickListener {
            cong = 0
            tru = 1
            nhan = 0
            chia = 0
            dot = 0
            bt_tru.setTextColor(Color.RED)
            bt_cong.setTextColor(Color.WHITE)
            bt_nhan.setTextColor(Color.WHITE)
            bt_chia.setTextColor(Color.WHITE)
            A = textNum.text.toString().toDouble()
        }
        bt_nhan.setOnClickListener {
            cong = 0
            tru = 0
            nhan = 1
            chia = 0
            dot = 0
            bt_nhan.setTextColor(Color.RED)
            bt_tru.setTextColor(Color.WHITE)
            bt_cong.setTextColor(Color.WHITE)
            bt_chia.setTextColor(Color.WHITE)
            A = textNum.text.toString().toDouble()
        }
        bt_chia.setOnClickListener {
            cong = 0
            tru = 0
            nhan = 0
            chia = 1
            dot = 0
            bt_chia.setTextColor(Color.RED)
            bt_tru.setTextColor(Color.WHITE)
            bt_nhan.setTextColor(Color.WHITE)
            bt_cong.setTextColor(Color.WHITE)
            A = textNum.text.toString().toDouble()
        }
        bt_bang.setOnClickListener {
            B = textNum.text.toString().toDouble()
            if(cong == 1) textNum.text = (A!!+B!!).toString()
            else if(tru == 1) textNum.text = (A!!-B!!).toString()
            else if(nhan == 1) textNum.text = (A!!*B!!).toString()
            else if(chia == 1) textNum.text = (A!!/B!!).toString()
            cong = 0
            tru = 0
            nhan = 0
            chia = 0
            bt_nhan.setTextColor(Color.WHITE)
            bt_tru.setTextColor(Color.WHITE)
            bt_cong.setTextColor(Color.WHITE)
            bt_chia.setTextColor(Color.WHITE)
            A = B
            temp = 0.0
        }
        bt_del.setOnClickListener {
            textNum.text = "0"
            A = null
            B = null
            temp = 0.0
            cong = 0
            tru = 0
            nhan = 0
            chia = 0
            dot = null
            bt_nhan.setTextColor(Color.WHITE)
            bt_tru.setTextColor(Color.WHITE)
            bt_cong.setTextColor(Color.WHITE)
            bt_chia.setTextColor(Color.WHITE)
        }
        bt_delOne.setOnClickListener {
            textNum.text = (textNum.text.toString().toDouble().toInt()/10).toDouble().toString()
        }
    }

}