/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak8a1;

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
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 8");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Menampilkan Bilangan Genap Positif "
                + "yang Lebih Kecil dari Bilangan");
        System.out.println("-------------------------------------------------");
        int n, hit=0, hit2=0, hit3=0, cek=0, bagi, jumlah=0, megan, megen, bil1, 
                bil2, a=0, b=0, cek2=0;
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        System.out.print("Output: ");
        for (int i=1;i<n;i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        } System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Menampilkan Bilangan Positif yang "
                + "Habis Dibagi 4 tetapi Tidak Habis Dibagi 3");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
       
        System.out.print("Output: ");
        for (int i=1;i<n;i++){
            if(i%4==0&&i%3!=0){
                System.out.print(i + " ");
            }
        } System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3 Menampilkan Jumlahan dari Bilangan "
                + "yang Diperoleh di Soal Nomor 2");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for (int i=1;i<n;i++){
            if(i%4==0&&i%3!=0){
                System.out.print(i + " ");
                hit = hit+i;
            }
        } 
        System.out.println(" ");
        System.out.println("Output: " + hit);
        System.out.println(" ");

        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 4 Menampilkan Banyaknya Bilangan "
                + "yang Diperoleh di Soal Nomor 2");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for (int i=1;i<n;i++){
            if(i%4==0&&i%3!=0){
                System.out.print(i + " ");
                hit2 = hit2+1;
            }
        } 
        System.out.println(" ");
        System.out.println("Output: " + hit2);
        System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 5 Banyaknya Bilangan Soal Nomor 4 "
                + "Digunakan untuk Mengambil Bilangan dari Barisan Soal Nomor 2");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for (int i=1;i<n;i++){
            if(i%4==0&&i%3!=0){
                System.out.print(i + " ");
                hit3 = hit3+1;
            }
        } 
        System.out.println(" ");
        bagi = hit3/2;
        for (int j=1;j<n;j++){
            if(j%4==0&&j%3!=0){
                cek = cek+1;
                if (cek==bagi){
                    System.out.println("Output: " + j);
                }
            }
        } System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 6 Menampilkan Median Soal Nomor 2");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for (int i=1;i<n;i++){
            if(i%4==0&&i%3!=0){
                System.out.print(i + " ");
                jumlah = jumlah+1;
            }
        } System.out.println(" ");
        
        if(jumlah%2!=0){
            megan = (jumlah+1)/2;
            
            for (int j=1; j<n; j++){
                if(j%4==0&&j%3!=0){
                    cek2 = cek2+1;
                    if(cek2==megan){
                        System.out.println("Median ganjil = "+ j);
                    }
                }
            }
        } else {
            bil1 = jumlah/2;
            bil2 = bil1+1;
            
            for (int j=1; j<n; j++){
                if(j%4==0&&j%3!=0){
                    cek2 = cek2+1;
                    
                    if(cek2==bil1){
                        a = a+j;
                    } if(cek2==bil2){
                        b = b+j;
                    }
                }
            }
            megen = (a+b)/2;
            System.out.println("Median genap = "+ megen);
        }
    }
}