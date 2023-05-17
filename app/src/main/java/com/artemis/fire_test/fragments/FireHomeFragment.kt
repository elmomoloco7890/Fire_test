package com.artemis.fire_test.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.artemis.fire_test.R
import com.artemis.fire_test.databinding.FragmentFireHomeBinding


class FireHomeFragment : Fragment() {

    private var binding: FragmentFireHomeBinding ?= null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fireHomeBinding = FragmentFireHomeBinding.inflate(inflater, container, false)
        binding = fireHomeBinding
        return fireHomeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            fireHomeFragment = this@FireHomeFragment
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun goToNested(){
        findNavController().navigate(R.id.action_fireHomeFragment_to_fireNestedFragment)
    }
}