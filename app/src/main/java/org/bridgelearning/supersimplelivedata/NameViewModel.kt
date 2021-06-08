package org.bridgelearning.supersimplelivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class NameViewModel : ViewModel() {

    private val _currentName = MutableLiveData<String>()
    private val names  = listOf("Isaac Newton","Blaise Pascal","Albert Einstein", "Steven Hawking", "Carl Sagan",
    "Marie Curie", "Nikola Tesla", "Galileo Galilei", "Richard Feynman", "George Washington Carver", "Louis Pasteur")
    val currentName: LiveData<String> = _currentName

    init {
        initName()
    }

    //Puts instruction text in the TextView at startup
    private fun initName () {
        _currentName.value = "Click Change Name to cycle through list of names"
    }

    //changeName function called from the onClickListener in the NameViewFragment
    //the MutableLiveData val _currentName is updated with the new name
    //The currentName LiveData val will automatically update with the new name
    fun changeName () {
        val listSize = names.size

        //get random number to select a new name
        val index = Random.nextInt(until = listSize)
        //update the value of the MutableLiveData val with the next name
        _currentName.value = names[index]
    }
}
