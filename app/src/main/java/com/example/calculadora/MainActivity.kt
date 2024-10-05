package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var resIni : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater) //para no usar findViewById
        setContentView(binding.root)

        binding.btn0.setOnClickListener(this)
        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btn5.setOnClickListener(this)
        binding.btn6.setOnClickListener(this)
        binding.btn7.setOnClickListener(this)
        binding.btn8.setOnClickListener(this)
        binding.btn9.setOnClickListener(this)
        binding.btnDot.setOnClickListener(this)
        binding.btnEquals.setOnClickListener(this)
        binding.btnDiv.setOnClickListener(this)
        binding.btnMult.setOnClickListener(this)
        binding.btnMin.setOnClickListener(this)
        binding.btnPlus.setOnClickListener(this)
        binding.btnDel.setOnClickListener(this)
        binding.btnPerc.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            binding.btn0.id -> addRes(binding.btn0.text.toString())
            binding.btn1.id -> addRes(binding.btn1.text.toString())
            binding.btn2.id -> addRes(binding.btn2.text.toString())
            binding.btn3.id -> addRes(binding.btn3.text.toString())
            binding.btn4.id -> addRes(binding.btn4.text.toString())
            binding.btn5.id -> addRes(binding.btn5.text.toString())
            binding.btn6.id -> addRes(binding.btn6.text.toString())
            binding.btn7.id -> addRes(binding.btn7.text.toString())
            binding.btn8.id -> addRes(binding.btn8.text.toString())
            binding.btn9.id -> addRes(binding.btn9.text.toString())
            binding.btnDot.id -> addRes(binding.btnDot.text.toString())
            binding.btnEquals.id -> addRes(binding.btnEquals.text.toString())
            binding.btnDiv.id -> addRes(binding.btnDiv.text.toString())
            binding.btnMult.id -> addRes(binding.btnMult.text.toString())
            binding.btnMin.id -> addRes(binding.btnMin.text.toString())
            binding.btnPlus.id -> addRes(binding.btnPlus.text.toString())
            binding.btnDel.id -> addRes(binding.btnDel.text.toString())
            binding.btnPerc.id -> addRes(binding.btnPerc.text.toString())
        }
    }

    fun addRes(txtBtn: String){
        resIni += txtBtn
        binding.res.text = resIni
    }


}
