package com.udacity.shoestore.screens.shoelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding


class ShoeListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentShoeListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list,
            container, false)

        binding.toShoeDetailButton.setOnClickListener {
            findNavController().navigate(R.id.action_shoeListFragment_to_shoeDetailFragment)
        }

        return binding.root
    }

}