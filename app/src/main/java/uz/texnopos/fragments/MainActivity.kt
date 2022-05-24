package uz.texnopos.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.texnopos.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFirst.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, FirstFragment()).commit()
        }

        binding.btnSecond.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, SecondFragment()).commit()
        }
    }
}
