package com.udacity.shoestore.screens.shoedatail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding
import com.udacity.shoestore.screens.shoelist.ShoeListViewModel
import timber.log.Timber

private lateinit var viewModel: ShoeListViewModel

class ShoeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_detail,
        container, false)

        // Get the viewmodel
        viewModel = ViewModelProvider(this).get(ShoeListViewModel::class.java)

        binding.shoeListViewModel = viewModel
        binding.lifecycleOwner = this

//        viewModel.shoe.observe(this, Observer {
//            findNavController().navigate(R.id.action_shoeDetailFragment_to_shoeListFragment)
//        })

        // TODO (3): Need to decide if these bindings are still neccessary if
        // I successfully implemented data-binding in fragment_shoe_detail
        binding.cancelButton.setOnClickListener {
            findNavController().navigate(R.id.action_shoeDetailFragment_to_shoeListFragment)
            Timber.i("onSaved is fired!")
        }

        binding.saveButton.setOnClickListener {
            findNavController().navigate(R.id.action_shoeDetailFragment_to_shoeListFragment)
            Timber.i("OnCancel is fired!")
        }

        return binding.root
    }

}