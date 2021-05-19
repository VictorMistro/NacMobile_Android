package com.br.nac02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.br.nac02.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var bindings: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindings = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return bindings.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindings.next.setOnClickListener {
            val x = Integer.parseInt(bindings.input1.text.toString())
            val y = Integer.parseInt(bindings.input2.text.toString())
            val resultado = x.plus(y)
            val action = HomeFragmentDirections.actionHomeFragmentToResultFragment(resultado)
            findNavController().navigate(action)
        }
    }

}