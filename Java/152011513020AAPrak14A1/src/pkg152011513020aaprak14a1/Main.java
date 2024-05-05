/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak14a1;

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
        System.out.println("Praktikum 14");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Menentukan Mean");
        System.out.println("-------------------------------------------------");
        int [] x;
        
        System.out.print("Masukkan bilangan n : ");
        n = input.nextInt();
        x = new int [n];
        
        for (int i=0; i<n; i++){
            System.out.print("Input X[" + i + "] : ");
            x[i] = input.nextInt();
        }
        
        System.out.println("Mean = " + meanArray(x,n));
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Menentukan Digit Minimum");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan n : ");
        n = input.nextInt();
        
        System.out.println("Digit minimum adalah " + digitMinimum(n));
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3 Menjumlahkan Semua Digit");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan n : ");
        n = input.nextInt();
        
        System.out.println("Jumlah semua digit = " + digitSum(n));
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 4 Mengurutkan Bilangan dari Terkecil ke Terbesar");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan n : ");
        n = input.nextInt();
        asc (n);
        
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 5 Menentukan Jumlah Telinga Kelinci");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan n : ");
        n = input.nextInt();
        
        System.out.println("Jumlah semua telinga = " + bunny(n));
    }
    
    //Nomor1
    public static int meanArray(int []x, int n){
        return mean(x, 0, n);
    }
    public static int mean(int [] x, int i, int n){
        if (i==n-1){
            return x[i];
        }
        if (i==0){
            return (x[i] + mean(x, i+1, n))/n;
        }
        return (x[i] + mean(x, i+1, n));
    }
    
    //Nomor 2
    public static int digitMinimum (int n){
        if (n<10){
            return n%10; 
        } else {
            if (n%10<digitMinimum(n/10)){
                return n%10;
            }
            return digitMinimum(n/10);
        }
    }
    
    //Nomor 3
    public static int digitSum(int n){
        if (n==0){
            return n;
        }
        int digit = n%10;
        
        return digit+digitSum(n/10);
    }
    
    //Nomor 4
    static int tambah =0;
    public static void asc (int n){
       
        if (n == 1){
            tambah = tambah+1;
            System.out.print(tambah + " ");
        }
        else{
            tambah = tambah+1;
            System.out.print(tambah + " ");
            asc(n-1);
        }
    }
    
    //Nomor 5
    public static int bunny (int n){
        int ear=0;
        
        if (n%2==0){
            if (n==0){
                return 0;
            }
            ear = bunny (n-1)+3;
        } else {
            if (n==0){
                return 0;
            }
            ear = bunny (n-1)+2;
        }
        return ear;
    }
}
