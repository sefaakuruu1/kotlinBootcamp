package com.sefakuru.kotlinbootcamp.standartProgramlama

import android.provider.ContactsContract.CommonDataKinds.Im

fun main() {
    val isim:String="omer"
    val benimDizim= arrayOf(isim,"sefa","ahmet","ali","metin")
    println(benimDizim[0]);
    println(benimDizim.get(3))
    benimDizim.set(2,"faruk")
    println(benimDizim[2])

    val array2= arrayListOf<Any>()//any hiyerarşinin en üstüdür
    array2.add(0,2)
    array2.add(1,"sefa")
    println(array2)


    val newArray=ArrayList<Int>()
    newArray.add(50)
    newArray.add(15)
    newArray.set(0,89)
    println(newArray)

    val mySet = setOf< Int>(1,1,1,2,3,4,5)

    mySet.forEach{
        println(it)
    }
    val mySet2 = hashSetOf<Any>(2,"sefa")
    mySet2.add(12)
     mySet2.forEach{
         println(it)
     }

    val notMap= hashMapOf<String,Int>()
    notMap.put("sefa",90)
    notMap.put("ali",100)
    notMap.put("omer",100)
    println(notMap)
 }