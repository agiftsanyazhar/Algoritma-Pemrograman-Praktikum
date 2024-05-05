/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaa1;

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
        System.out.println("Praktikum 2");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("Nomor 1 Hitung Luas Segitiga");
        int a, t;
        double luassegitiga;
        
        System.out.print("Masukkan alas     : ");
        a = input.nextInt();
        System.out.print("Masukkan tinggi   : ");
        t = input.nextInt();
        
        luassegitiga = 0.5*a*t;
        System.out.println("Luas segiiga = "+luassegitiga+"");
        System.out.println(" ");
            
        System.out.println("Nomor 2 Pembagian Dua Bilangan");
        double x, y, hasil;
        
        System.out.print("Masukkan x : ");
        x = input.nextDouble();
        System.out.print("Masukkan y : ");
        y = input.nextDouble();
        
        if (y!=0){
            hasil = x/y;
            System.out.println("Hasil = "+hasil+"");
        } else System.out.println("Tidak terdefinisi");
        System.out.println(" ");
        
        System.out.println("Nomor 3 Hitung Keliling Lingkaran");
        int r;
        double kelilinglingkaran;
        
        System.out.print("Masukkan r : ");
        r = input.nextInt();
        
        kelilinglingkaran = 2*3.14*r;
        System.out.println("Keliling lingkaran = "+kelilinglingkaran+"");
        System.out.println(" ");
        
        System.out.println("Nomor 4 Hitung Luas Lingkaran");
        int r2;
        double luaslingkaran;
        
        System.out.print("Masukkan r : ");
        r2 = input.nextInt();
        
        luaslingkaran = 3.14*r2*r2;
        System.out.println("Luas lingkaran = "+luaslingkaran+"");
        System.out.println(" ");
        // TODO code application logic here
    }
    
}
