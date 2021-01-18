package com.udacity.shoestore

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.udacity.shoestore.models.Shoe


class SharedViewModel: ViewModel() {

    // Create an empty shoe list
    private var _shoeList = MutableLiveData<ArrayList<Shoe>>()
    val shoeList: LiveData<ArrayList<Shoe>>
        get() = _shoeList

    // Initialize shoe ready for binding
    var shoe = Shoe("", 0.0, "", "")

    fun onSave(v: View, shoe: Shoe?) {
        // add the current shoe detail into the list
        if (shoe != null) {
            _shoeList.value?.add(shoe)

        // instantiate a new shoe
            this.shoe = Shoe("", 0.0, "", "")
        }

        // Navigate back to shoe list screen
        v.findNavController().navigateUp()
    }

    init {
        _shoeList.value = ArrayList()
    }

}