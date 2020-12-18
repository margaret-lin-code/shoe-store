package com.udacity.shoestore.screens.shoedatail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding

class ShoeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_detail,
        container, false)


        binding.cancelButton.setOnClickListener {
            findNavController().navigate(R.id.action_shoeDetailFragment_to_shoeListFragment)
        }

        binding.saveButton.setOnClickListener {
            findNavController().navigate(R.id.action_shoeDetailFragment_to_shoeListFragment)
        }

        return binding.root
    }

}