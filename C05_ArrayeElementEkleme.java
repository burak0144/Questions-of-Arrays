package day21_Odevarrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
    public static void main(String[] args) {
        String [] isimler={"Ali","Mehmet","Veli"};
        String eklenecekIsim="Burak";

        isimler=isimEkleme(isimler,eklenecekIsim);
        System.out.println(Arrays.toString(isimler));
    }

    public static String[] isimEkleme(String[] isimler, String eklenecekIsim) {
        String[] yeniListe=new String[isimler.length+1];

        for (int i = 0; i <isimler.length ; i++) {
            yeniListe[i]=isimler[i];


        }
        System.out.println(Arrays.toString(yeniListe));
        // System.out.println(Arrays.toString(yeniListe)); son indexi bos null
         yeniListe[yeniListe.length-1]=eklenecekIsim;  //son indexe eklenecek ismi atadik
        return yeniListe;
    }
}
