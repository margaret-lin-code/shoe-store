package com.udacity.shoestore.screens.shoelist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber


class ShoeListViewModel: ViewModel() {

    // Create a empty shoe list
    val shoeList = mutableListOf<String>()

    // The current shoe
    private val _shoe = MutableLiveData<String>()
    val shoe: LiveData<String>
        get() = _shoe

    init {
        _shoe.value = "No shoe added yet"
    }

    // TODO (2): need to know why this is not fired in Logcat even though I set the
    // data minding in fragment_shoe_detail
    // It's not firing because
    fun onSave() {
        Timber.i("onSaved is fired!")
    }

    fun onCancel() {
        Timber.i("OnCancel is fired!")
    }

}