package br.edu.ifsp.scl.ads.pdm.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.edu.ifsp.scl.ads.pdm.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setClickListeners()

    }


    private fun clearFields(){
        binding.editName.text.clear()
        binding.editPhone.text.clear()
        binding.editEmail.text.clear()
        binding.checkbox.isChecked = false
        binding.radioGroupSex.clearCheck()
    }

    override fun onClick(view: View) {
        val id = view.id

        if(id == binding.buttonClear.id){
            clearFields()
        }else if(id == binding.buttonSave.id){

        }
    }

    private fun setClickListeners(){

        binding.buttonClear.setOnClickListener(this)

        binding.buttonSave.setOnClickListener(this)

    }
}