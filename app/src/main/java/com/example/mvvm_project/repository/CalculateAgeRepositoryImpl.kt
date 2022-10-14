package com.example.mvvm_project.repository

import androidx.lifecycle.MutableLiveData
import com.example.mvvm_project.model.Person
import java.util.*

class CalculateAgeRepositoryImpl:CalculateAgeRepository {
    override fun calculateYourAge(name: String, age: String):MutableLiveData<Person>{
        val infoMutableLiveData=MutableLiveData<Person>()
        val currentYear=Calendar.getInstance().get(Calendar.YEAR)
        val yourAge= currentYear - age.toInt()
        val person=Person(name,yourAge.toString())
        infoMutableLiveData.postValue(person)
        return infoMutableLiveData
    }
}