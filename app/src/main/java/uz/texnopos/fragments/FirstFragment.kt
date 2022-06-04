package uz.texnopos.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.texnopos.fragments.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
    private lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFirstBinding.bind(view)

        binding.apply {
            btn1.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(DetailFragment.KEY, "Button 1 from First")
                val fragment = DetailFragment()
                fragment.arguments = bundle
                requireActivity().supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
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
