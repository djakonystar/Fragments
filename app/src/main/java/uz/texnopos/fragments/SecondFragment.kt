package uz.texnopos.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.texnopos.fragments.databinding.FragmentSecondBinding

class SecondFragment: Fragment(R.layout.fragment_second) {
    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSecondBinding.bind(view)

        binding.apply {
            btn1.setOnClickListener {
                requireActivity().supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, DetailFragment())
                    .commit()
            }

            btn2.setOnClickListener {
                requireActivity().supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, DetailFragment())
                    .commit()
            }

            btn3.setOnClickListener {
                requireActivity().supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, DetailFragment())
                    .commit()
            }
        }
    }
}
