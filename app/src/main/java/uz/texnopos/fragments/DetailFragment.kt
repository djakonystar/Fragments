package uz.texnopos.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.texnopos.fragments.databinding.FragmentDetailBinding

class DetailFragment: Fragment(R.layout.fragment_detail) {
    private lateinit var binding: FragmentDetailBinding

    companion object {
        const val KEY = "keyForMe"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentDetailBinding.bind(view)

        val msg = arguments?.getString(KEY) ?: "Unknown"

        binding.tvText.text = getString(R.string.btn_click_message, msg)
    }
}
