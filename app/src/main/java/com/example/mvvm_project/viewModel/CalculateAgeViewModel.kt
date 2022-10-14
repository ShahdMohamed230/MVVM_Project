package com.example.mvvm_project.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_project.model.Person
import com.example.mvvm_project.repository.CalculateAgeRepository
import com.example.mvvm_project.repository.CalculateAgeRepositoryImpl

class CalculateAgeViewModel:ViewModel() {
    val calculateAgeRepo:CalculateAgeRepository=CalculateAgeRepositoryImpl()
    fun calculateAge(name:String,age:String):LiveData<Person>
    {
        var personMutableLiveData=calculateAgeRepo.calculateYourAge(name,age)
        return personMutableLiveData
    }
}