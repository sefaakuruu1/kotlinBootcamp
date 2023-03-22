package com.sefakuru.kotlinbootcamp.degiskenler

fun main() {
    var ogrenciAdi ="Ahmet"
    var ogrenciYas =23
    var ogrenciBoy= 1.98
    var ogrenciBasHarf='A'
    var ogrenciDevamEdiyorMu = true

    println(ogrenciAdi)
    println(ogrenciBoy)
    println(ogrenciBasHarf)
    println(ogrenciDevamEdiyorMu)
    println(ogrenciYas)

   var urun_id:Int =3416
    //silik şeekilde oluyorsa olsa da olur olmasa da olur demektir

 var urun_adi:String="MackBook pro"
 var urun_Adet:Int=100
 var urun_fiyat:Int=42999
 var urun_tedarikci:String="Apple"

 println("ürün adi : $urun_adi")
 println("ürün adet : $urun_Adet")
 println("ürün fiyat : $urun_fiyat")
 println("ürün tedarikci : $urun_tedarikci")

    var a=10
    var b=20
    println("$a x $b : ${a*b}")

    //var kullandıgımız zaman degeri ileride değiştirebiliriz
    val numara=90
    println(numara)
    //numara=111 dersek hata verir çünkü val değiştirilemez
    // val kullanmak depolama konusunda daha işlevseldir


     // TÜR DÖNÜŞÜMLERİ
    //sayısaldan sayısala
  val  i= 42
    val d = 72.95
    val sonuc1=i.toDouble()
    println(sonuc1)
//doubledan inte donustururken veri kaybı olur
    val sonuc2=d.toInt()
    println(sonuc2)
//sayısaldan metine
    val sonuc4=d.toString()
    println(sonuc4)

    //metinden sayısala
    val yazi ="67,54"
    val sonuc5=yazi.toDoubleOrNull()

    //yontem1
    if(sonuc5!=null){
        println(sonuc5)
    }
    else {
        println("donusum hatasi")
    }

    sonuc5?.let {

        println(it)
    }
    }