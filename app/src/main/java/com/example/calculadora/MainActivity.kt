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
        binding.btnAC.setOnClickListener(this)
        binding.btnPerc.setOnClickListener(this)
    }

    //
    override fun onClick(view: View) {
        when (view.id) {
            binding.btn0.id -> showAddRes(binding.btn0.text.toString())
            binding.btn1.id -> showAddRes( binding.btn1.text.toString())
            binding.btn2.id -> showAddRes( binding.btn2.text.toString())
            binding.btn3.id -> showAddRes( binding.btn3.text.toString())
            binding.btn4.id -> showAddRes( binding.btn4.text.toString())
            binding.btn5.id -> showAddRes( binding.btn5.text.toString())
            binding.btn6.id -> showAddRes( binding.btn6.text.toString())
            binding.btn7.id -> showAddRes( binding.btn7.text.toString())
            binding.btn8.id -> showAddRes( binding.btn8.text.toString())
            binding.btn9.id -> showAddRes( binding.btn9.text.toString())
            binding.btnDot.id -> showAddRes( binding.btnDot.text.toString())
            binding.btnEquals.id -> calculateRes()
            binding.btnDiv.id -> showAddRes( binding.btnDiv.text.toString())
            binding.btnMult.id -> showAddRes( binding.btnMult.text.toString())
            binding.btnMin.id -> showAddRes( binding.btnMin.text.toString())
            binding.btnPlus.id -> showAddRes( binding.btnPlus.text.toString())
            binding.btnDel.id -> showAddRes(binding.btnDel.text.toString())
            binding.btnAC.id -> showAddRes(binding.btnAC.text.toString())
            binding.btnPerc.id -> showAddRes(binding.btnPerc.text.toString())
        }
    }

    /**
     * Función que muestra en pantalla las operaciones
     * y se ha implementado la función de borrado
     */
    fun showAddRes(txtBtn: String) {
        when (txtBtn) {
            // Para borrar un carácter
            binding.btnDel.text -> {
                if (resIni.isNotEmpty()) {
                    resIni = resIni.dropLast(1)
                }
                binding.res.text = resIni
            }
            // Para borrar todo
            binding.btnAC.text -> {
                resIni = ""
                binding.res.text = ""
            }
            // Para los números y operadores
            else -> {
                resIni += txtBtn
                binding.res.text = resIni
            }
        }
    }

    fun calculateRes(){

    }

    fun calculateOp(){

    }

}
