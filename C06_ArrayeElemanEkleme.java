package day21_Odevarrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {
        String[]sinifListesi={"Ali","Veli","Ahmet","Mehmet"};
        String eklenecekIsim="Mahmut";

        String[]yeniSinifListesi=C05_ArrayeElementEkleme.isimEkleme(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(yeniSinifListesi));

     }
}
