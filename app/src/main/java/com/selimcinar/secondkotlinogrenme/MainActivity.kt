package com.selimcinar.secondkotlinogrenme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Kotlin Ogreniyorum */
        println("Merhaba Kotlin")  //yazdırma komutu
        println(5 * 10)

        /*DEGİŞKENLER */
        //var değişken tanımlamada kullanılan tanım
        var a = 5
        var b = 10

        println(a * b)
        var toplam = a + b
        println(toplam)
        var yas = 50
        yas = 12
        println(yas / 5 * 8)

        //camelCase  değişken yazım şeklidir.
        //snake_case değişken yazım şeklidir.
        //val sabit tanımlamada kullanılan tanım

        val x = 10
        val yasSonucu = yas * x
        val pi = 3.14
        println(yasSonucu)


        //Kotlin Veri tipleri
        //Numbers veri tipleri
        /* Byte  :  8 bit -128 , 127
           Short : 16 bit -32768 ,32767
           Int   : 32 bit -2,147,483,648  ve + 2,147,483,647
           Long  : 64 bit -9,223,372,036,854,775,808 ve + lısıs
        * */

        //Tamsayı veri tipi Int
        /* Int tamsayı veri tipi
         */

        println("------Int------")

        //Defining(tanımlama)
        val benimIntegerim : Int

        //Initizaling (başlatma,değer atama)
        benimIntegerim = 5

        //Hem tanım hem değer verme
        var yeniInteger : Int = 20

        //Değişkeni yazdırma log ekranda
        println(benimIntegerim / 2)
        println(yeniInteger)


        /*Long tamsayı veri tipi */

        println("-----Long------")

        var benimLong :Long  = 100
        benimLong = 300000000
        println(benimLong)



        /*Ondalıklı sayılar Double & float
        * Float : 32 bit  3.612345
        * Double : 64 bit 3.1546458761347541
        * */

        println("--------Double & Float-------")

        val pi2 = 3.14
        println(pi2 * 2)

        val floatPi : Float = 3.14f
        println(floatPi * 2 )


        val yeniDouble = 5.0
        println(yeniDouble / 2)



        /* String yazı metin veri tipi
        *
        *  */
        println("-------String metin veri tipi ------")

        val benimString = "Benim yeni metnim"
        println( benimString.length) // string metin yazı uzunluğunu gösterir.


        val isim = "Selim"
        val soyisim = "Çınar"
        var tamisim = isim + soyisim  // Stringlerde + işareti yan yana yazdırır.
        tamisim = isim + " " + soyisim
        println(tamisim)


        val yeniBirString : String
        yeniBirString = "10"

        val baskaBirString = "20"

        println(yeniBirString + baskaBirString)

        //Boolean doğrumu  yanlışmı True or false
        println("-------Boolean--------")

        var benimBoolean = true
        benimBoolean = false
        /*
        * < -> Küçüktür
        * > -> Büyüktür
        * == -> eşittir
        * != -> eşit değildir
        * <= -> küçük eşittir
        * >= -> büyük eşittir
        * && -> ve
        * || -> veya
        * */

        println(3 < 5)
        println(4!=4)


        /*Veri tipi dönüştürme*/

        println("--------Dönüştürme------")

        var benimInt = 10
        var benimLongaCevrilenInt =  benimInt.toLong() //Integer değeri londa çevirdi
        println(benimLongaCevrilenInt)

        var kullaniciGirdisi = "50"
        var kullaniciInt = kullaniciGirdisi.toInt() // String değeri ıntegere dönüştürdü

        println(kullaniciInt / 2 )


        /*Koleksiyonlar yapı türleri
        * Birden fazla veri veritipi tutarlar.
        * */

        //Array - Dizi
        println("--------Dizi-------")
        val stringOrnegi = "Selim"
        val benimDizim = arrayOf(stringOrnegi,"Çınar","46","Fenerbahçe","Valencia")

        // diziler index mantığı ile çalışır,0.indeks - 1.indeks gibi

        //index
        println( benimDizim[0])       // 0.indeksi yazdırır.
        println(benimDizim.get(1))    // 1.indeksi yazdırır.

        benimDizim[2] = "1907"        // 2.indeksin değerini değiştirir.
        println(benimDizim.get(2))    // 2.indeksi yazdırır.

        benimDizim.set(3,"Batshuayi") // 3.indeksin değeri değiştirilir.
        println(benimDizim[3])

        val numaraDizisi = doubleArrayOf(1.0,2.0,3.5)
        println(numaraDizisi.get(2))  // 2 .indeksi getirir.

        val karisikDizi = arrayOf("Selim",24,16.5,true,false)
        println(karisikDizi.get(3))
        karisikDizi.forEach {
            println(it)
        }

        //ArrayList - Listeler
        println("--------ArrayList--------")

        val isimListesi = arrayListOf<String>("Selim","Çınar","Fenerbahçe")   //<Veritipi> hangi tipte olucağını yazdırır.

        println(isimListesi[0])
        println(isimListesi.get(1))
        //ArrayListe ekleme işlemleri
        isimListesi.add("Yusuf")
        isimListesi.add("Hp")
        println(isimListesi.get(4))


        val karisikArrayList = arrayListOf<Any>()    //Any: Herhangi bir sınıftan değer verilebilir.
        karisikArrayList.add("Selim")
        karisikArrayList.add("Çınar")
        karisikArrayList.add(1907)
        karisikArrayList.add(true)


        val intArrayList = ArrayList <Int> ()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))




        //Set   Tekrar eden veriler olmaz 1,1,1,2 gibi 1 tane 1 olarak okur.
        println("-------Set---------")

        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2: ${ornekDizi[2]}")
        println("index 3: ${ornekDizi[3]}")
        println("index 4: ${ornekDizi[4]}")
        ornekDizi.forEach {
            println(it)
        }

        println(ornekDizi.size)  ///Dizinin eleman uzunluğunu getirir.

        val benimSet = setOf<Int>(7,8,9,9,9,8,10)
        println(benimSet.size)  // benimSetin uzunluğunu getirir.

        // For Each  Her biri için  dizi set tüm değerleri yazdırır.
        benimSet.forEach {
            println(it)
        }

        //HashSet javadan kalma bir terim
        val digerSet = HashSet<String>()
        digerSet.add("Selim")
        digerSet.add("Selim")
        digerSet.add("Selim")
        digerSet.add("Çınar")

        digerSet.forEach {
            println(it)
        }

        //Map haritalamak (key-value pairing) değer anahtar eşleştirme- Hashmap de olabilir sözlük de denir.

        println("-------Map-----")

        val yemekDizisi = arrayOf("Elma","Et","Tavuk")
        val kaloriDizisi = arrayOf(100,300,200)
        println("${yemekDizisi[0]}'nın kalorisi : ${kaloriDizisi[0]}  ")

        val yemekKaloriMap = hashMapOf<String,Int>()
        yemekKaloriMap.put("Elma",100)    //put:koymak  eklemek
        yemekKaloriMap.put("Et",300)
        yemekKaloriMap.put("Tavuk",200)

        println(yemekKaloriMap.get("Et"))
        println(yemekKaloriMap.get("Elma"))
        println(yemekKaloriMap.get("Tavuk"))

        val benimMapim = HashMap <String,String> ()
        benimMapim.put("Örnek","Değer")
        benimMapim.put("Hash","Hashdeğeri")

        //Mape ekleme 2
        val yeniMap = hashMapOf<String,Int>("Selim" to 122 ,"Örnek" to 90)
        println(yeniMap.get("Selim"))



        /*Matematiksel İşlemler*/
        println("---------Matematiksel İşlemler-------")

        var sayi = 8
        println(sayi)

        // değer artırma işlemi
        sayi = sayi + 1
        println(sayi)

        // değer artırma işlem ++ azaltma işlemi --
        sayi--
        println(sayi)

        var digerSayi = 10

        //Koşul
        // && -> Ve
        // || -> Veya

        println(digerSayi > sayi && 2>3)
        println(digerSayi > sayi || 2>3)

        println(8+7)
        println(10-4)
        println(20*5)
        println(10/2)

        //Remainder - Kalanı bulmak
        println(10%2)

        println(11 % 3)


        // koşul işlemleri Eğer kontrolleri
        // If Kontrolleri
        println("--------If Statements (Eğer Kontrolleri )------")

        val skor = 10

        if( skor <10  ) {
            println("Oyunu kaybettin!")
        }

        else if(skor >= 10 && skor < 20 ) {
            println("Skorun 10 ve 20 arasında , çok iyi skor aldın.")
        }
        else if (skor >=20 && skor<30 ){
            println("Skorun 20 ve 30 arasında , rekorlar kırıyorsun")
        }
        else {
            println("Skorun 30'un üstünde , efsane oynadın")
        }

        //When yapısı switch-case'e benzer.
        var notRakami = 2
        var notStringi = ""

        when(notRakami) {
            0-> notStringi = "Geçersiz not"
            1-> notStringi = "Zayıf"
            2-> notStringi = "Kötü"
            3-> notStringi = "Orta"
            4-> notStringi = "İyi"
            else -> notStringi = "Pek iyi"
        }

        //Döngüler kısmı
        //For döngüsü
        println("-------For Döngüsü------")

        val baskaBirDizi = arrayOf(5,10,15,20,25,30)
        val q = baskaBirDizi[0] / 5 +3
        println(q)


        println("Döngü başladı")
        for (num in baskaBirDizi){
                println(num / 5 +3)
        }
        println("Döngü bitti")

        for (indeks in baskaBirDizi.indices)
        {
            println(baskaBirDizi[indeks] / 5 + 3)
        }

        //Range 0..9
        for (b in 0..9) {
            println(b)
        }

        val benimDigerStringDizim = ArrayList<String>()
        benimDigerStringDizim.add("Selim")
        benimDigerStringDizim.add("Çınar")

        for (str in benimDigerStringDizim){
            println(str)
        }
        benimDigerStringDizim.forEach {
            println(it)
        }

        //While döngüsü
        println("-------While Döngüsü-------")

        var j = 0
        if(j<=10) {
            println(j)
            j=j+1
        }


    }


}