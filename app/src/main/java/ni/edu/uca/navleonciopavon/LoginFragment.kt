    package ni.edu.uca.navleonciopavon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import ni.edu.uca.navleonciopavon.databinding.FragmentLoginBinding

    class FragmentLogin : Fragment() {
        private lateinit var binding: FragmentLoginBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            arguments?.let {

            }
        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            binding = FragmentLoginBinding.inflate(inflater, container, false)

            return binding.root
        }
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            binding.btnAcceder.setOnClickListener {
                iniciarses()
            }
        }
        fun iniciarses(){
            val usuario=binding.etUsuario.text.toString()
            val contras=binding.tvPassword.text.toString()
            var usuariofin=usuario
            var contrafin=contras
            var user="UCA"
            var contra:String ="DAMO1"

            val entrar= if (usuariofin==user||contrafin==contra ){
                findNavController().navigate(R.id.loginFragment)
            }else  {
                val builder: AlertDialog.Builder? = activity?.let {

                    AlertDialog.Builder(it)
                        .setMessage("Estás seguro de eliminar")
                        .setCancelable(false)
                        .setPositiveButton("aceptar") { dialog, id ->
                            dialog.dismiss()
                        }
                }

            }

        }



    }