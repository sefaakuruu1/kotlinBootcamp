package com.sefakuru.kotlinbootcamp.ifyapisi

fun main() {
    val yas=19
    val isim ="Ahmet"

    if(yas>=18){
        println("Resitsiniz")
    }
    else{
        println("resit Degilisiniz")
    }

    if(isim=="Ahmet"){
        println("Merhaba $isim")
    }else if(isim=="mehmet"){
        println("Mehemt")
    }
    else{
        println("tanınmayan kişi")
    }

    val ka="admin"
    val sifre= 123456
    if(ka=="admin" && sifre==123456) {
        println("hosgeldiniz")
    }
    else{
            println("hatalı giriş")
        }
    val gun =89
    when(gun){
        1 -> println("Pazartesi")
        2 -> println("sali")
        3 -> println("carsamba")
        4 -> println("persembe")
        5 -> println("cuma")
        6 -> println("cumartesi")
        7 -> println("pazar")
        else-> println("boyle bir gun yok")
    }
    }
