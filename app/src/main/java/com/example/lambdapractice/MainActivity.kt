package com.example.lambdapractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    class Player(val name: String, val age: Int, val height: Float)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Find one function (with no parameters) you have used in the past and rewrite it using a lambda expression
        fun fun1(){
            print("Hello world!")
        }
        val newFun1 = { print("Hello world!") }


        //Find two functions that take in one or more parameters and rewrite them using a lambda expression
        fun fun2(name: String){
            print("Hello $name")
        }
        val newFun2 = {name: String -> print("Hello $name")}

        fun fun3(num: Float){
            print("${num * num}")
        }
        val newFun3 = {num: Float -> print("${num * num}")}



        //Find two functions that return a value and rewrite them using a lambda expression
        fun fun4(num: Int): Boolean {
            return num % 2 == 0
        }
        val newFun4 = {num: Int -> num % 2 == 0}

        fun fun5(str1: String, str2: String): Boolean {
            return str1 == str2
        }
        val newFun5 = {str1: String, str2: String -> str1 == str2}




        var players = listOf(
            Player("Wasan", 24, 177F),
            Player("Shuaa", 20, 170F),
            Player("Qoot", 49, 182F),
            Player("Sara", 12, 150F),
            Player("Nana", 44, 168F),
            Player("Aram", 60, 173F),
            Player("Raghad", 25, 190F),
            Player("Wed", 7, 129F),
            Player("Ibrahim", 14, 144F),
            Player("Thoog", 29, 165F),
            Player("Aboodi", 22, 160F),
            Player("Hmoodi", 54, 158F),
            Player("Mark", 45, 181F),
            Player("Donald", 40, 176F),
            Player("Steven", 28, 177F),
            Player("Paul", 37, 192F),
            Player("Andrew", 39, 183F),
            Player("Kevin", 42, 171F),
            Player("George", 53, 166F),
            Player("Ronald", 68, 167F),
        )
        val sort = {player: List<Player> -> player.sortedBy { p -> p.height}.filter { it.height < 150 || it.height > 160}}
        players = sort(players)
        val display = {players.map { p -> Log.d("List", "${p.name} | ${p.age} | ${p.height}") } }
        display()



    }
}