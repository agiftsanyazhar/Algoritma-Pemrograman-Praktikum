/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak7a1;

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
        System.out.println("Praktikum 7");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Menampilkan Semua Faktor Positif dari "
                + "Bilangan yang Gasal");
        System.out.println("-------------------------------------------------");
        int n, jumlah=0, hasil=0, faktor=0;
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        System.out.print("Output: ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(i%2!=0){
                    System.out.print(i+" ");
                }
            }
        } System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Menampilkan Jumlah Semua Faktor Positif dari "
                + "Bilangan");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for(int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i + " ");
                jumlah = jumlah+i;
            }
        } 
        System.out.println(" ");
        System.out.println("Jumlah semua faktor positif dari " + n
                + " adalah " + jumlah);
        System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3 Menampilkan Banyaknya Faktor dari "
                + "Bilangan");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i + " ");
                hasil = hasil+1;
            }
        } 
        System.out.println(" ");
        System.out.println("Banyaknya faktor dari bilangan "+ n
                + " adalah " + hasil);
        System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 4 Menampilkan Bilangan Prima atau Bukan");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
                faktor = faktor+1;
            }
        } if(faktor==2){
            System.out.println(" ");
            System.out.println(n +" merupakan bilangan prima");
        } else {
            System.out.println(" ");
            System.out.println(n +" bukan bilangan prima");
        }
    }
}
