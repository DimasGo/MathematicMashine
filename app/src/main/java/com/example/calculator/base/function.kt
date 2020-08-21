package com.example.calculator.base

import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

open class Function : AppCompatActivity() {
    fun ClickButton(){
        btn_0.setOnClickListener{setText("0")}
        btn_1.setOnClickListener{setText("1")}
        btn_2.setOnClickListener{setText("2")}
        btn_3.setOnClickListener{setText("3")}
        btn_4.setOnClickListener{setText("4")}
        btn_5.setOnClickListener{setText("5")}
        btn_6.setOnClickListener{setText("6")}
        btn_7.setOnClickListener{setText("7")}
        btn_8.setOnClickListener{setText("8")}
        btn_9.setOnClickListener{setText("9")}
        btn_point.setOnClickListener{setText(".")}


        btn_min.setOnClickListener  {setText("-")}
        btn_mult.setOnClickListener {setText("*")}
        btn_div.setOnClickListener  {setText("/")}
        btn_sum.setOnClickListener  {setText("+")}

        btn_brck.setOnClickListener  {setText("(")}
        btn_brckt.setOnClickListener {setText(")")}

        btn_ac.setOnClickListener {
            math_operation.text = ""
            result_text.text = ""
        }

        btn_back.setOnClickListener {
            var str = math_operation.text.toString()
            if (str.isNotEmpty()){
                math_operation.text = str.substring(0, str.length - 1)
            }

            result_text.text = ""
        }

        btn_eaq.setOnClickListener {
            try {
                val ex = ExpressionBuilder(math_operation.text.toString()).build()
                val result = ex.evaluate()

                val convert = result.toLong()
                if(result == convert.toDouble()){
                     result_text.text = convert.toString()
                }
                else {
                    result_text.text = result.toString()
                }
            } catch (e:Exception) {
                Log.d("Error", "Error ${e.message}")
            }
        }
    }

    fun setText(str: String){
        if (result_text.text != ""){
           math_operation.text = result_text.text
            result_text.text = ""
        }


        math_operation.append(str)
    }
}