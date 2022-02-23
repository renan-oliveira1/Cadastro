package br.edu.ifsp.scl.ads.pdm.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
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
            var message: String = binding.editName.text.toString()
            message += "\n " + binding.editPhone.text.toString()
            message += "\n " + binding.editEmail.text.toString()
            if(binding.checkbox.isChecked){
                message += "\n Aceita ingressar na lista de e-mails"
            }else{
                message += "\n Não ceita ingressar na lista de e-mails"
            }

            if(binding.radioMen.isChecked){
                message += "\n " + binding.radioMen.text.toString()
            }else if(binding.radioWoman.isChecked){
                message += "\n " + binding.radioWoman.text.toString()
            }else{
                message += "\n Sexo não selecionado"
            }
            message += "\n " + binding.spinnerState.selectedItem.toString()
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }

    private fun setClickListeners(){

        binding.buttonClear.setOnClickListener(this)

        binding.buttonSave.setOnClickListener(this)

    }
}