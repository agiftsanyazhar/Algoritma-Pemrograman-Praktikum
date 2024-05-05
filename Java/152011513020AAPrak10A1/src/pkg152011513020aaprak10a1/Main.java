/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak10a1;

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
        int n;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 10");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Mencetak Bagian Kanan Belah Ketupat");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for (int i=1; i<=n+(n-1); i++){
            System.out.println(" ");
            for (int j=1; j<=n; j++){
                if(i==j){
                    System.out.print("*");
                } else if (i+j==n*2){
                    System.out.print("*");
                } else System.out.print(" ");
            }
        } System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Mencetak Bagian Atas Belah Ketupat");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for (int i=1; i<=n; i++){
            System.out.println(" ");
            for (int j=1; j<=n+(n-1); j++){
                if(i+j==n+1){
                    System.out.print("*");
                } else if (j-i==n-1){
                    System.out.print("*");
                } else System.out.print(" ");
            }
        } System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3 Mencetak Bagian Kiri Belah Ketupat");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for (int i=1; i<=n+(n-1); i++){
            System.out.println(" ");
            for (int j=1; j<=n; j++){
                if(i+j==n+1){
                    System.out.print("*");
                } else if (i-j==n-1){
                    System.out.print("*");
                } else System.out.print(" ");
            }
        } System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 4 Mencetak Bagian Bawah Belah Ketupat");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for (int i=1; i<=n; i++){
            System.out.println(" ");
            for (int j=1; j<=n+(n-1); j++){
                if(i==j){
                    System.out.print("*");
                } else if (i+j==n*2){
                    System.out.print("*");
                } else System.out.print(" ");
            }
        } System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 5 Mencetak Belah Ketupat");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        System.out.println(" ");
        
        for (int i=0; i<n; i++){
            for (int j=0; j<=n-i; j++){
                System.out.print(" ");
            } for (int j=0; j<=2*i; j++){
                if(j==0||j==2*i){
                    System.out.print("*");
                } else System.out.print(" ");
            } System.out.println(" ");
        }
        
        for (int i=n-2; i>=0; i--){
            for (int j=0; j<=n-i; j++){
                System.out.print(" ");
            } for (int j=0; j<=2*i; j++){
                if(j==0||j==2*i){
                    System.out.print("*");
                } else System.out.print(" ");
            } System.out.println(" ");
        }
    }
}
