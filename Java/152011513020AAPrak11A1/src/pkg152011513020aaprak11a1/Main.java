/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak11a1;

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
        int n, m, p, bil, dig=0, nMax, posisi=0, t, y;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 11");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        int [] x1 = new int[n];
        
        for (int i=0; i<=n-1; i++){
            System.out.print("Masukkan X["+i+"] : ");
            x1[i] = input.nextInt();
        } for (int i=0; i<=n-1; i++){
            System.out.print("X"+(i+1)+" : " + x1[i] + "        ");
        } System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2");
        System.out.println("-------------------------------------------------");
        
        int [] x2 = new int[5];
        
        for (int i=0; i<5; i++){
            System.out.print("Masukkan X["+i+"] : ");
            x2[i] = input.nextInt();
        } for (int i=0; i<5; i++){
            System.out.print("X"+(i+1)+" : " + x2[i] + "        ");
        }System.out.println(" ");
        
        System.out.println("");
        System.out.println("Dibalik:");
        
        p     = x2[0];
        x2[0] = x2[3];
        x2[3] = p;
        
        for (int i=0; i<=4; i++){
            System.out.print("X"+(i+1)+" : " + x2[i] + "        ");
        } System.out.println(" ");
        
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        int [] x3 = new int[n];
        
        for (int i=0; i<=n-1; i++){
            System.out.print("Masukkan X["+i+"] : ");
            x3[i] = input.nextInt();
        } for (int i=0; i<=n-1; i++){
            System.out.print("X"+(i+1)+" : " + x3[i] + "        ");
        } System.out.println(" ");
        
        System.out.println(" ");
        System.out.print("Masukkan bilangan : ");
        m = input.nextInt();
        
        int [] y3 = new int[m];
        
        for (int j=0; j<=m-1; j++){
            System.out.print("Masukkan Y["+j+"] : ");
            y3[j] = input.nextInt();
        } for (int j=0; j<=m-1; j++){
            System.out.print("Y"+(j+1)+" : " + y3[j] + "        ");
        } System.out.println(" ");
        
        int [] z3 = new int[n+m];
        
        for (int i=0; i<=(n+m)-1; i++){
            if (i<=n-1){
                z3[i]=x3[i];
            } else{
                z3[i]=y3[i-n];
            }
        }
        
        System.out.println(" ");
        System.out.println("Hasil :");
        for (int i=0; i<=(n+m)-1; i++){
            System.out.print("Z"+(i+1)+" : " + z3[i]  + "        ");
        } System.out.println(" ");
        
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 4");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        
        if (n>=100){
            
            bil=n;
            
            //menghitung banyak digit
            while(bil!=0){
                bil=bil/10;
                dig=dig+1;
            }
            
            int [] x4 = new int[dig];
            
            //menentukan x[i]
            for (int i=dig-1; i>=0; i--){
                x4[i] = n%10;
                n     = n/10;
                System.out.print("X"+(i+1)+" : " + x4[i] + "        ");
            } System.out.println(" ");
            
            //menentukan nilai terbesar
            nMax = x4[0];
            
            for (int i=0; i<dig; i++){
                if(x4[i]>nMax){
                    nMax    = x4[i];
                    posisi  = i;
                } 
            } 
            
            System.out.println(" ");
            System.out.println("Nilai terbesar = "+ nMax);
            System.out.println("Posisi data ke-"+ (posisi+1));
            System.out.println(" ");
            
            System.out.println("Hasil penukaran digit terbesar ke digit pertama:");
            
            t          = nMax;
            x4[posisi] = x4[0];
            x4[0]      = t;
            
            for (int i=0; i<dig; i++){
                System.out.print("X"+(i+1)+" : " + x4[i] + "        ");
            } System.out.println(" ");
            
            //penggeseran array
            y = x4[0];
            
            for (int i=1; i<dig; i++){
                x4[i-1] = x4[i];
            } x4[dig-1] = y;
            
            System.out.println(" ");
            System.out.println("Hasil penggesaran array:");
            
            for (int i=0; i<dig; i++){
                System.out.print("X"+(i+1)+" : " + x4[i] + "        ");
            }
            
        } else System.out.println("Error");
        
        System.out.println(" ");
    }
    
}
