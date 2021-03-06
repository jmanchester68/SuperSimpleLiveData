package org.bridgelearning.supersimplelivedata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import org.bridgelearning.supersimplelivedata.databinding.FragmentNameViewBinding


class NameViewFragment : Fragment() {
    private lateinit var model: NameViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
        ): View {
        val binding = FragmentNameViewBinding.inflate(inflater)

        //define the lifecycleOwner
        binding.lifecycleOwner = this

        // Get the ViewModel.
        model = ViewModelProvider(this).get(NameViewModel::class.java)

        //Bind the ViewModel to the fragment_name_view.xml variable
        binding.simpleViewModel = model

        //Create an onClickListener for the Change Name button
        binding.buttonChangeName.setOnClickListener {
            //call the changeName function in the NameViewModel
            model.changeName()
        }
        return binding.root
    }
}