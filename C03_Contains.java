package day21_Odevarrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {


    // Soru 3- Kulanicidan aldiginiz bir ismin,verilen array’de olup olmadigini kontrol edip,
    // bize true veya false sonucu donen bir method olusturun.
    String []isimler={"Mehmet", "Ali", "Burak","Zekeriya", "Abidin"};

    Scanner scanner=new Scanner(System.in);
        System.out.println("kontrol etmek istediginiz ismi girin");
        String arananIsim=scanner.nextLine().substring(0,1).toUpperCase();
        Boolean arananIsimVarMi=contains(isimler,arananIsim);
       // System.out.println(arananIsimVarMi);  bu sekilde de yazdirilabilinir
        if(arananIsimVarMi==true){
            System.out.println("aranan isim mevcuttur");
        }else {
            System.out.println("aranan isim yoktur");
        }

}

    public static Boolean contains(String[] isimler, String arananIsim) {
        Boolean sonuc=false;
        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].contains(arananIsim)){
                sonuc=true;
        }



    }   return sonuc;
}}