package com.example.mvvm_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.mvvm_project.databinding.ActivityMainBinding
import com.example.mvvm_project.model.Person
import com.example.mvvm_project.viewModel.CalculateAgeViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val calculateAgeViewModel:CalculateAgeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.btnCalculate.setOnClickListener{
                val name=binding.edName.text.trim().toString()
                val age=binding.edAge.text.trim().toString()
              calculateAgeViewModel.calculateAge(name,age).observe(this, Observer {
                  Person -> binding.tvAge.text="${Person.name}, your age: ${Person.age}"
              })
            }

    }
}

