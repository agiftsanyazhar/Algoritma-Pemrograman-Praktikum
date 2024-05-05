/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak5a1;

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
        System.out.println("Praktikum 5");
        System.out.println(" ");
        
        System.out.println("Nomor 1 Menentukan Jumlah Digit Penyusun");
        int n, a, b, c, d, e, hasil;
        
        System.out.print("Masukkan bilangan bulat positif : ");
        n = input.nextInt();
        
        if (n>0&&n<100000){
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
            } else if (n>=10000&&n<100000){
                e     = n%10;
                d     = n/10%10;
                c     = n/100%10;
                b     = n/1000%10;
                a     = n/10000%10;
                hasil = a+b+c+d+e;
                System.out.println("Jumlah digit penyusunnya = "+hasil);
            }
        } else System.out.println("Error");
        System.out.println(" ");
        
        System.out.println("Nomor 2 Menentukan Jumlah Digit yang Genap");
        int o, digit1, digit2, digit3, digit4, digit5, hit = 0;
        
        System.out.print("Masukkan bilangan bulat positif : ");
        o = input.nextInt();
        
        if (o>=10000&&o<100000){
            digit5     = o%10;
            digit4     = o/10%10;
            digit3     = o/100%10;
            digit2     = o/1000%10;
            digit1     = o/10000%10;
            if (digit1%2==0){
                hit = hit+1;
            } if (digit2%2==0){
                hit = hit+1;
            } if (digit3%2==0){
                hit = hit+1;
            } if (digit4%2==0){
                hit = hit+1;
            } if (digit5%2==0){
                hit = hit+1;
            } System.out.println("Jumlah digit genap = "+hit);
        } else System.out.println("Error");
        System.out.println(" ");
        
        System.out.println("Nomor 3 Menentukan Apakah Ada Digit yang Kembar");
        int p, d1, d2, d3, d4, d5;
        
        System.out.print("Masukkan bilangan bulat positif : ");
        p = input.nextInt();
        
        d5     = p%10;
        d4     = p/10%10;
        d3     = p/100%10;
        d2     = p/1000%10;
        d1     = p/10000%10;
        
        if (p>0&&p<10000){
                if(d1==d2){
                System.out.println("Ada digit yang kembar");
            } else if(d1==d2){
                System.out.println("Ada digit yang kembar");
            } else if(d1==d3){
                System.out.println("Ada digit yang kembar");
            } else if(d1==d4){
                System.out.println("Ada digit yang kembar");
            } else if(d1==d5){
                System.out.println("Ada digit yang kembar");
            } else if(d2==d3){
                System.out.println("Ada digit yang kembar");
            } else if(d2==d4){
                System.out.println("Ada digit yang kembar");
            } else if(d2==d5){
                System.out.println("Ada digit yang kembar");
            } else if(d3==d4){
                System.out.println("Ada digit yang kembar");
            } else if(d3==d5){
                System.out.println("Ada digit yang kembar");
            } else if(d4==d5){
                System.out.println("Ada digit yang kembar");
            } else System.out.println("Tidak ada digit yang kembar");
        } else System.out.println("Error");
        
    }
    
}
