package com.sefakuru.kotlinbootcamp.standartProgramlama

fun main() {
    for(i in 1..3){
        println("Dongu1 :$i")
    }
    for(a in 10..20 step 5){ //step :infix function
        println("dongu2 : $a")
    }

    for(b in 20 downTo 10 step 5){
        println("dongu3 :$b")

    }

    var sayac =1
    while (sayac<6){
        println(sayac)
        sayac++
    }

    //break-continue
    //break donguyu durdur - continue o adımı atla basa don
    for(i in 1..5){
        if(i==3){
            break
        }
        println("Döngü 5 : $i")
    }

    for(i in 1..5){
        if(i==3){
            continue
        }
        println("Döngü 6 : $i")
    }
}