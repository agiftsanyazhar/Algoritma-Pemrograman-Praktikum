/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak4a1;

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
        System.out.println("Praktikum 4");
        System.out.println(" ");
        System.out.println("Nomor 1 Mencari Banyaknya Bilangan");
        int a, b, c, hit=0;
        
        System.out.print("Masukkan bilangan pertama   : ");
        a = input.nextInt();
        System.out.print("Masukkan bilangan kedua     : ");
        b = input.nextInt();
        System.out.print("Masukkan bilangan ketiga    : ");
        c = input.nextInt();
        
        if (a>10&&a<20){
            hit+=1;
        } if (b>10&&b<20){
            hit+=1;
        } if (c>10&&c<20){
            hit+=1;
        } System.out.println("Banyaknya bilangan di antara 10 dan 20 adalah "
                +hit);
        
        System.out.println(" ");
        System.out.println("Nomor 2 Mencari Hari");
        int n;
        System.out.print("Hari ke-");
        n = input.nextInt();
        
        if (n==1){
            System.out.println("Hari ke-"+n+" adalah Senin");
        } else if (n==2){
            System.out.println("Hari ke-"+n+" adalah Selasa");
        } else if (n==3){
            System.out.println("Hari ke-"+n+" adalah Rabu");
        } else if (n==4){
            System.out.println("Hari ke-"+n+" adalah Kamis");
        } else if (n==5){
            System.out.println("Hari ke-"+n+" adalah Jumat");
        } else if (n==6){
            System.out.println("Hari ke-"+n+" adalah Sabtu");
        } else if (n==7){
            System.out.println("Hari ke-"+n+" adalah Ahad");
        } else System.out.println("Error");
    }
    
}
