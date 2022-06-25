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

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FirstFragment())
            .addToBackStack(FirstFragment::class.java.simpleName + "$")
            .commit()

        binding.btnFirst.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FirstFragment())
                .addToBackStack(FirstFragment::class.java.simpleName)
                .commit()
        }

        binding.btnSecond.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SecondFragment())
                .addToBackStack(SecondFragment::class.java.simpleName)
                .commit()
        }

        binding.btnBack.setOnClickListener {
            val count = supportFragmentManager.backStackEntryCount
            if (count == 1) {
                val name = supportFragmentManager.getBackStackEntryAt(0).name
                if (name == FirstFragment::class.java.simpleName + "$") {
                    finish()
                }
            }
            supportFragmentManager.popBackStack()
        }
    }

    override fun onBackPressed() {
        if (supportFragmentManager.getBackStackEntryAt(0).name == FirstFragment::class.java.simpleName + "$") finish()
        super.onBackPressed()
    }
}
