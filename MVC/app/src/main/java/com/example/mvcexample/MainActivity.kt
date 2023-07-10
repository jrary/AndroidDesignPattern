package com.example.mvcexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvcexample.databinding.ActivityMainBinding
import com.example.mvvmexample.module.Database
import java.util.Random

class MainActivity : AppCompatActivity() {

    companion object{
        var MaxNum = 101
    }

    private lateinit var binding : ActivityMainBinding
    private val database: Database = Database()
    private var nowNum = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainPickBtn.setOnClickListener {
            binding.mainNumTv.text = getNum()
        }
        binding.mainAllBtn.setOnClickListener {
            binding.mainNumTv.text = showAllNum()
        }
    }

    private fun getNum(): String{
        val rand = Random()
        nowNum = rand.nextInt(MaxNum) + 1
        database.saveNumber(nowNum)
        return nowNum.toString()
    }

    private fun showAllNum(): String {
        var numTextList = ""
        if (nowNum == -1)
            return numTextList

        val array = database.getAllNumber()

        for (i in 0 until array.size){
            numTextList += array[i].toString() + " "
        }
        return numTextList
    }
}