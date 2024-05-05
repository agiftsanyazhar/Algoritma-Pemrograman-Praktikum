/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak6a1;

import java.util.Scanner;

/**
 *
 * @author Agiftsany Azhar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Praktikum 6");
        System.out.println(" ");
        
        System.out.println("Nomor 1 Menentukan Jumlah Digit Penyusun");
        int n, bil, a, b, c, d, hasil;
        
        System.out.print("Masukkan bilangan: ");
        n = input.nextInt();
        
//        System.out.print("Masukkan digit: ");
//        bil = input.nextInt();
//        
//        if (bil==4){
//            System.out.print("Masukkan "+bil+" digit angka : ");
//            n = input.nextInt();
//            d     = n%10;
//            c     = n/10%10;
//            b     = n/100%10;
//            a     = n/1000%10;
//            hasil = a+b+c+d;
//            System.out.println("Hasil = "+hasil);
//        } else if (bil==3){
//            System.out.print("Masukkan "+bil+" digit angka : ");
//            n = input.nextInt();
//            c     = n%10;
//            b     = n/10%10;
//            a     = n/100%10;
//            hasil = a+b+c;
//            System.out.println("Hasil = "+hasil);
//        } else if (bil==2){
//            System.out.print("Masukkan "+bil+" digit angka : ");
//            n = input.nextInt();
//            b     = n%10;
//            a     = n/10%10;
//            hasil = a+b;
//            System.out.println("Hasil = "+hasil);
//        } else if (bil==1){
//            System.out.print("Masukkan "+bil+" digit angka : ");
//            n = input.nextInt();
//            System.out.println("Hasil = "+n);
//        } else System.out.println("Error");
        
        if (n>0&&n<10000){
            if (n>0&&n<10){
                System.out.println("Hasil = "+n);
            } else if (n>=10&&n<100){
                b     = n%10;
                a     = n/10%10;
                hasil = a+b;
                System.out.println("Hasil = "+hasil);
            } else if (n>=100&&n<1000){
                c     = n%10;
                b     = n/10%10;
                a     = n/100%10;
                hasil = a+b+c;
                System.out.println("Hasil = "+hasil);
            } else if (n>=1000&&n<10000){
                d     = n%10;
                c     = n/10%10;
                b     = n/100%10;
                a     = n/1000%10;
                hasil = a+b+c+d;
                System.out.println("Hasil = "+hasil);
            }
        } else System.out.println("Error");
        System.out.println(" ");
        
        System.out.println("Nomor 2 Bilangan Berdigit 6");
        int o, digit1, digit2, digit3, digit4, digit5, digit6, hit, bilGenap;
        
        System.out.print("Masukkan bilangan bulat positif : ");
        o = input.nextInt();
        
        digit6     = o%10;
        digit5     = o/10%10;
        digit4     = o/100%10;
        digit3     = o/1000%10;
        digit2     = o/10000%10;
        digit1     = o/100000%10;
        hit        = 0;
        bilGenap   = 0;
        
        if (o>=100000&&o<1000000){
            if (digit1%2==0){
                System.out.println("Digit genap = " + digit1);
                hit = hit+1;
                bilGenap = (bilGenap+digit1)*10;
            } if (digit2%2==0){
                System.out.println("Digit genap = " + digit2);
                hit = hit+1;
                bilGenap = (bilGenap+digit2)*10;
            } if (digit3%2==0){
                System.out.println("Digit genap = " + digit3);
                hit = hit+1;
                bilGenap = (bilGenap+digit3)*10;
            } if (digit4%2==0){
                System.out.println("Digit genap = " + digit4);
                hit = hit+1;
                bilGenap = (bilGenap+digit4)*10;
            } if (digit5%2==0){
                System.out.println("Digit genap = " + digit5);
                hit = hit+1;
                bilGenap = (bilGenap+digit5)*10;
            } if (digit6%2==0){
                System.out.println("Digit genap = " + digit6);
                hit = hit+1;
                bilGenap = (bilGenap+digit6)*10;
            }
            bilGenap = bilGenap/10;
            System.out.println("Jumlah digit genap = "+hit);
            System.out.println("Digit baru = "+bilGenap);
        } else System.out.println("Error");
    }
    
}
