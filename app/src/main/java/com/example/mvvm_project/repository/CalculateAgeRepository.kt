package com.example.mvvm_project.repository

import androidx.lifecycle.MutableLiveData
import com.example.mvvm_project.model.Person

interface CalculateAgeRepository {
    fun calculateYourAge(name:String,age:String): MutableLiveData<Person>
}