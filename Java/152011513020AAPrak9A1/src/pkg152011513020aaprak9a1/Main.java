/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak9a1;

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
        int n, bil, bil2, bil3, digit=0, digit2=0, digit3=0, digit1=0, 
                digit2_2=0, baru;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 9");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Mencetak Pola Bilangan Persegi");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for (int i=0;i<n;i++){
             for (int j=1;j<=n;j++){
                 bil = i+j*2+((n-1)*i);
                 System.out.print((bil<10?" ":"")+bil + "       ");
             } System.out.println(" ");
        } System.out.println("");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Mencetak Pola Bilangan Segitiga Siku-Siku "
                 + "Atas");
        System.out.println("-------------------------------------------------");
         
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for (int i=1;i<=n;i++){
             for (int j=n-(n-i);j<=n;j++){
                 bil = 3*j;
                 System.out.print((bil<10?" ":"")+bil + "       ");
             } System.out.println(" ");
        } System.out.println("");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3 Mencetak Pola Bilangan Segitiga Siku-Siku "
                 + "Bawah");
        System.out.println("-------------------------------------------------");
         
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        for (int i=0;i<n;i++){
             for (int j=1;j<=n-(n-(i+1));j++){
                 bil = 2*(j+i);
                 System.out.print((bil<10?" ":"")+bil + "       ");
             } System.out.println(" ");
        } System.out.println("");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 4 Menentukan Banyaknya Digit Bilangan");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        do {
            n     = n/10;
            digit = digit+1;
        } while (n!=0);
        System.out.println("Jumlah digit = " + digit);
        System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 5 Menerima Input Sebuah Bilangan Bulat "
                + "Positif, kemudian Pisahkan Digitnya dan Kalikan "
                + "dengan 10m-1 (m : posisi digit terhitung dari kanan) "
                + "kemudian Tampilkan Hasilnya");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        bil2 = n;
        
        while (bil2!=0){
            bil2    = bil2/10;
            digit2  = digit2+1;
        }
        
        while (digit2!=0) {
            bil2    = (n/((int)Math.pow(10, digit2-1)))*((int)Math.pow(10, digit2-1));
            digit2  = digit2-1;
            n       = n-bil2;
            System.out.println("Hasil = " + bil2);
        }System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 6 Buatlah Flowchart dan Pseudocode untuk menerima "
                + "input sebuah bilangan bulat positif, kemudian tukarkan "
                + "letak digit pertama dan kedua");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        bil3 = n;
        
        while (bil3!=0){
            bil3    = bil3/10;
            digit3  = digit3+1;
        }
        
        digit1   = n/(int)(Math.pow(10, digit3-1));
        n        = n-digit1*(int)(Math.pow(10, digit3-1));
        digit2_2 = n/(int)(Math.pow(10, digit3-2));
        n        = n-digit2_2*(int)(Math.pow(10, digit3-2));
        
        baru     = digit1*(int)(Math.pow(10, digit3-2)) + 
                digit2_2*(int)(Math.pow(10, digit3-1)) + n;
        
        System.out.println("Hasil : " + baru);
    }
    
}
