package day21_Odevarrays;

public class C02_EnUzunVeKisaKelime {
    // Soru 2- Verilen String bir array’de
    // en uzun ve en kisa String’leri yazdiran bir method olusturun
    public static void main(String[] args) {
        String[]isimler={"Mehmet", "Ali", "Burak","Zekeriya", "Abidin"};
        enUzunVeEnKisaIsimler(isimler);


    }

    public static void enUzunVeEnKisaIsimler(String[] isimler) {
        String enUzunIsim=isimler[0];
        String enKisaIsim=isimler[0];
        for (int i = 1; i <isimler.length; i++)  {
            if(isimler[i].length()>enUzunIsim.length()){
                enUzunIsim=isimler[i];
            }
            if(isimler[i].length()<enKisaIsim.length()){
                enKisaIsim=isimler[i];
            }

        }
        System.out.println("Arraydeki en Uzun Isim = " + enUzunIsim);
        System.out.println("Arraydeki en Kisa Isim = " + enKisaIsim);

    }
}
