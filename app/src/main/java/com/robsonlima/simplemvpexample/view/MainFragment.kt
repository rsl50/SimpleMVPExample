package com.robsonlima.simplemvpexample.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.robsonlima.simplemvpexample.contract.IMainContract
import com.robsonlima.simplemvpexample.databinding.FragmentMainBinding
import com.robsonlima.simplemvpexample.presenter.MainPresenter

class MainFragment : Fragment(), IMainContract.appView {
    // View Binding with 'fragment_main.xml' so we get reference to xml layout objects easier.
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    // Holds the Presenter instance
    private var appPresenter: MainPresenter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Instantiate the Presenter
        appPresenter = MainPresenter(this)
        setupClickListeners()
    }

    /**
     * Setup the button in our fragment to invoke the presenter to get the data.
     */
    private fun setupClickListeners() {
        binding.fragmentButton.setOnClickListener {
            // Invoke Presenter to get data from Model, there is no link between the View and the
            // Model.
            appPresenter?.getUpdatedText()
        }
    }

    /**
     * View method responsible for updating the textView.
     *
     * This method just sets the text, there is no link with the presenter or model here.
     *
     * @param [updatedText] The string to be set on the textView.
     */
    override fun onUpdateText(updatedText: String) {
        binding.fragmentTextView.text = updatedText
    }
}