package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.activity.enableEdgeToEdge
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var txt: String = ""
    private var operationTxt: String = ""
    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var op: Char = ' '

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
        binding.btnAC.setOnClickListener(this)
        binding.btnPerc.setOnClickListener(this)
    }

    /**
     *
     */
    override fun onClick(view: View) {
        when (view.id) {
            binding.btn0.id -> showOperation(binding.btn0.text.toString())
            binding.btn1.id -> showOperation(binding.btn1.text.toString())
            binding.btn2.id -> showOperation(binding.btn2.text.toString())
            binding.btn3.id -> showOperation(binding.btn3.text.toString())
            binding.btn4.id -> showOperation(binding.btn4.text.toString())
            binding.btn5.id -> showOperation(binding.btn5.text.toString())
            binding.btn6.id -> showOperation(binding.btn6.text.toString())
            binding.btn7.id -> showOperation(binding.btn7.text.toString())
            binding.btn8.id -> showOperation(binding.btn8.text.toString())
            binding.btn9.id -> showOperation(binding.btn9.text.toString())
            binding.btnDot.id -> showOperation(binding.btnDot.text.toString())
            binding.btnPerc.id -> showOperation(binding.btnPerc.text.toString())

            //operadores
            binding.btnDiv.id -> calculateOp('/')

            binding.btnMult.id -> calculateOp('*')

            binding.btnMin.id ->  calculateOp('-')

            binding.btnPlus.id -> calculateOp('+')

            binding.btnEquals.id -> calculateRes()

            //borrado
            binding.btnDel.id -> delete(binding.btnDel.id)
            binding.btnAC.id -> delete(binding.btnAC.id)
        }
    }

    /**
     * Función de borrado parcial y total
     */
    fun delete(idBtn: Int) {
        when (idBtn) {
            // Para borrar un carácter
            binding.btnDel.id -> {
                if (txt.isNotEmpty()) {
                    operationTxt = operationTxt.dropLast(1)
                }
                binding.res.text = operationTxt
            }
            // Para borrar todo
            binding.btnAC.id -> {
                txt = ""
                operationTxt = ""
                binding.res.text = ""
            }
        }
    }

    /**
     * Función que muestra en pantalla las operaciones
     */
    fun showOperation(txtBtn: String) {
        txt += txtBtn //para num largos
        operationTxt += txtBtn
        binding.res.text = operationTxt


    }


    /**
     *
     */
    fun calculateOp(op: Char) {
        num1 = txt.toDouble()
        this.op = op
        txt = ""
        operationTxt += " ${op.toString()} "
        binding.res.text = operationTxt
    }

    /**
     *
     */
    fun calculateRes() {
        num2 = txt.toDouble()
        var res: Double = 0.0

        when (op) {
            '+' -> res = num1 + num2
            '-' -> res = num1 - num2
            '*' -> res = num1 * num2
            '/' -> if (num2 != 0.0) num1 / num2 else Double.NaN // Evitar división por 0
        }
        operationTxt += " = $res"
        binding.res.text = operationTxt
    }


}