/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak3a1;

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
        System.out.println("Praktikum 3");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("Nomor 1 Penjumlahan Waktu");
        int j, m, mKemudian, mTemp, jTemp, jHasil, jFinal;
        
        System.out.print("Masukkan jam              : ");
        j = input.nextInt();
        System.out.print("Masukkan menit            : ");
        m = input.nextInt();
        System.out.print("Masukkan menit kemudian   : ");
        mKemudian = input.nextInt();

        mTemp   = m+mKemudian;
        
        if (mTemp>=60){
            m         = mTemp%60;
            jTemp     = mTemp/60;
            jHasil    = j+jTemp;
            if (jHasil>=24){
                jFinal = jHasil%24;
                System.out.println("Jam "+jFinal+"."+(m < 10 ? "0" : "")+m);
            } else {
                System.out.println("Jam "+jHasil+"."+(m < 10 ? "0" : "")+m);
            }
        } else if (j>=24){
            jFinal = j%24;
            System.out.println("Jam "+jFinal+"."+(m < 10 ? "0" : "")+m);
        } else System.out.println("Jam "+j+"."+mTemp);
        System.out.println(" ");
      
        System.out.println("Nomor 2 Pengurangan Waktu");     
        int h, min, minLalu, minTemp, minHasil, hTemp, hHasil, hFinal;
        
        System.out.print("Masukkan jam          : ");
        h = input.nextInt();
        System.out.print("Masukkan menit        : ");
        min = input.nextInt();
        System.out.print("Masukkan menit lalu   : ");
        minLalu = input.nextInt();
        
        minTemp = min-minLalu;
        
        if (h>24){
            h = h%24;
        } if (minTemp < 0){
            minHasil   = minTemp%60+60;
            hTemp      = minTemp/60-1;
            hHasil     = h+hTemp;
            if (hHasil < 0){
                hFinal = hHasil%12+12;
                System.out.println("Jam "+hFinal+"."+minHasil);
            } else {
                System.out.println("Jam "+hHasil+"."+minHasil);
            }
        } else {
            System.out.println("Jam "+h+"."+minTemp);
        }
    }
    
}
