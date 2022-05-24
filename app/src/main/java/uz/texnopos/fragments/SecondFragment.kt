package uz.texnopos.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import uz.texnopos.fragments.databinding.FragmentSecondBinding

class SecondFragment: Fragment(R.layout.fragment_second) {
    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSecondBinding.bind(view)

        binding.tvText.setOnClickListener {
            Toast.makeText(requireContext(), "${binding.tvText.text}", Toast.LENGTH_SHORT).show()
        }
    }
}
