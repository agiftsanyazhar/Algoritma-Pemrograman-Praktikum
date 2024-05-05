/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak13a1;

import java.util.Arrays;
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
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 13");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        int n, m, a, b, c;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Menentukan Nilai Terbesar dari 2 Bilangan");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan n : ");
        n = input.nextInt();
        System.out.print("Masukkan bilangan m : ");
        m = input.nextInt();
        
        System.out.println("Apakah " + n + ">" + m + "? " + higherValue(n,m));
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Menghitung Nilai Perkalian Antara 1*2*3*...*n");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan n : ");
        n = input.nextInt();
        
        System.out.println("Hasil perkalian n: " + productValue(n));
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3 Menentukan Nilai Terbesar dari 3 Bilangan");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan a : ");
        a = input.nextInt();
        System.out.print("Masukkan bilangan b : ");
        b = input.nextInt();
        System.out.print("Masukkan bilangan c : ");
        c = input.nextInt();
        
        System.out.println("Nilai terbesar: " + maximumValue(a, b, c));
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 4 Menampilkan Nilai-Nilai Array");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan n : ");
        n = input.nextInt();
        
        int [] x1 = displayNilaiArray(n);
        
        System.out.println("Hasil: " + Arrays.toString(x1));
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 5 Menentukan Nilai Minimum Array");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan n : ");
        n         = input.nextInt();
        int [] x2 = new int[n];
        
        for (int i=0; i<n; i++){
            System.out.print("Input X[" + i + "] : ");
            x2[i] = input.nextInt();
        }
        int minimum = minimum (x2,n);
        
        System.out.println("Nilai minimum = " + minimum);
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 6 Mengalikan Semua Bilangan Array");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan banyak data = ");
        int dig1   = input.nextInt();
        int dig2[] = new int[dig1];
        
        for(int i=0; i<dig1; i++){
            System.out.print("Input X[" + i + "] : ");  
            dig2[i]=input.nextInt();
        }
        int hasilKali = hasilKali (dig2,dig1);
        System.out.println("Hasil kalinya = " + hasilKali);
    }
    
    //Nomor 1
    public static boolean higherValue (int n, int m){
        boolean hasil;
       
        if (n>m) {
            hasil = true;
        } else{
            hasil = false;
        }
        return hasil;
  }
    
    //Nomor 2
    public static int productValue (int n){
        int hasil=1;
        
        for (int i=1; i<=n; i++){
            hasil = hasil*i;
        }
        return hasil;
    }
    //Nomor 3
    public static int maximumValue (int a, int b, int c){
        int max=a;
        
        if (a>b){
            if (a>c){
                max = a;
            } else {
                max = c;
            }
        } else if (b>c){
            max = b;
        } else max = c;
        return max;
    }
    
    //Nomor 4
    public static int [] displayNilaiArray (int n){
        int [] x1 = new int[n];
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<n; i++){
            System.out.print("Input X[" + i + "] : ");
            x1 [i] = input.nextInt();
        }
        return x1;
    }
    
    //Nomor 5
    public static int minimum (int [] x2, int n){
        int minimum = x2 [0];
        for (int i=0; i<n; i++){
            if (x2[i]<minimum){
                minimum = x2 [i];
            }
        }
        return minimum;
    }
    
    //Nomor 6
     public static int hasilKali(int dig2[], int dig1){
        int hasilKali=1;
        
        for(int i=0; i<dig1; i++){
            hasilKali = hasilKali*dig2[i];
        }
        return hasilKali;
     }
}
