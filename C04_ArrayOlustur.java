package day21_Odevarrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {


    // Soru 4- Kullanicidan bir array’in boyutunu
    // ve tum elementlerini alarak bir array olusturup,
    // bu array’i bize donduren bir method olusturun
   
       yeniArrayOlusturma();


}

    public static void yeniArrayOlusturma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array'in boyutunu yazin");
        int uzunluk= scanner.nextInt();
        String[] yeniArray=new String[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.print(i+".index : ");
            yeniArray[i]=scanner.next();

        }
        System.out.println(Arrays.toString(yeniArray));

        }
    }



    
