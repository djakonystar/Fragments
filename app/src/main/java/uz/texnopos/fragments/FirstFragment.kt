package uz.texnopos.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import uz.texnopos.fragments.databinding.FragmentFirstBinding

class FirstFragment: Fragment(R.layout.fragment_first) {
    private lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFirstBinding.bind(view)

        binding.tvText.setOnClickListener {
            Toast.makeText(requireContext(), "${binding.tvText.text}", Toast.LENGTH_SHORT).show()
        }
    }
}
