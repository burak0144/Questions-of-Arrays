package day21_Odevarrays;

public class C01_Array_MaxSayiyiBulma {
    public static void main(String[] args) {
// Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
        int sayilar[]={4,6,3,7,9,23,235,64};
        enBuyukSayi(sayilar);
    }

    public static void enBuyukSayi(int[] sayilar) {
        int enBuyukSayi=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {
            if(sayilar[i]>enBuyukSayi){
                enBuyukSayi=sayilar[i];
          }
            
        }
        System.out.println("enBuyukSayi = " + enBuyukSayi);
    }
}
