package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Kullanicinin girdigi degeri okumak icin kullanacagiz scanner degiskeni.
        // C# ta Console.ReadLine() static oldugu icin degisken olusturmadan kullanabiliyoruz, ama burada bir Scanner nesnesi yaratmak gerekiyor.
        String input; //okudugmuz degeri tutacagimiz string degiskenimiz
        boolean continueToWorking = true; //Do While dongusu kosul gecerli oldugu surece calisir. Yani bu degisken True oldukca dongu donmeye devam edecek.
        Math math = new Math(); //Tum orneklerin bulundugu classimiz. Hepsini bu class altinda topladim.

        do {
            //Her dongu basinda kullaniciya secenekleri yazdirarak belirtiyoruz.
            System.out.println("Select operation; \n");
            System.out.println("(1 to 11) for run Math Operations");
            System.out.println("(C) for close the app");
            input = sc.next().trim(); //Olusturmus oldugumuz Scanner nesnesini kullanarak satiri okuduk ve Trim() fonksiyonu ile okudugumuz degerin basi ve sonundaki bosluklari sildik.

            //Switch case ayni IF/ ELSE IF ... / ELSE gibi bir yapi. Switch te bir deger belirtiyoruz, buna gore bu deger asagidaki hangi Case ile uyusuyorsa program oradan devam ediyor.
            switch (input.toUpperCase()) { // Orngin kullanici 2 degerini girdiginde sadece 2. Case calisir.
                case "1":
                    math.Example1(); //Math classimizdak' Example1() fonksiyonumuzu calistiriyoruz.
                    break;
                case "2":
                    math.Example2();
                    break;
                case "3":
                    math.Example3();
                    break;
                case "4":
                    math.Example4();
                    break;
                case "5":
                    math.Example5();
                    break;
                case "6":
                    math.Example6();
                    break;
                case "7":
                    math.Example7();
                    break;
                case "8":
                    math.Example8();
                    break;
                case "9":
                    math.Example9();
                    break;
                case "10":
                    math.Example10();
                    break;
                case "11":
                    math.Example11();
                    break;
                case "C":
                    continueToWorking = false; // Eger kullanici input olarak 'c' veya 'C' girdi ise continueToWorking degiskenimizin degerini FALSE yapiyoruz boylece asagidaki WHILE kontrolune geldiginde pronram Switchten cikip sonlanacak.
                    break;
                default:
                    System.out.println("Wrong input!"); // Kullanicinin girdigi deger hicbir CASE ile uyusmazsa burasi calisir.
                    break;
            }
        }while (continueToWorking); //Herhangi bir CASE calistiktan sonra continueToWorking eger TRUE ise program Switch@in basina doner.
    }
}
