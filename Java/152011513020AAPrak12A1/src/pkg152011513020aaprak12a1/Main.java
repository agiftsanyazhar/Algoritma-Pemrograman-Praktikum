/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak12a1;

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
        int a, n, m, max, baris=0, kolom=0;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 12");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan n : ");
        n = input.nextInt();
        System.out.print("Masukkan bilangan m : ");
        m = input.nextInt();
        
        int [][] x1 = new int [n][m];
        
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print("Masukkan X[" + i + "]" + "[" + j + "] : ");
                x1[i][j] = input.nextInt();
            }
        } for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print("X[" + (i+1) + "]" + "[" + (j+1) + "]" 
                        + " : " + x1[i][j] + "     ");
            } System.out.println(" ");
        } System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2");
        System.out.println("-------------------------------------------------");
        
        int [][] x2 = new int [3][4];
        
        for (int i=0; i<3; i++){
            for (int j=0; j<=3; j++){
                System.out.print("Masukkan X[" + i + "]" + "[" + j + "] : ");
                x2[i][j] = input.nextInt();
            }
        } for (int i=0; i<3; i++){
            for (int j=0; j<=3; j++){
                System.out.print("X[" + (i+1) + "]" + "[" + (j+1) + "]" 
                        + " : " + x2[i][j] + "     ");
            } System.out.println(" ");
        } System.out.println(" ");
        
        System.out.println("Dibalik:");
        
        a        = x2[0][2];
        x2[0][2] = x2[2][2];
        x2[2][2] = a;
        
        for (int i=0; i<3; i++){
            for (int j=0; j<=3; j++){
                System.out.print("X[" + (i+1) + "]" + "[" + (j+1) + "]" 
                        + " : " + x2[i][j] + "     ");
            } System.out.println(" ");
        } System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3");
        System.out.println("-------------------------------------------------");
        
        int [][] x3 = new int [3][4];
        
        for (int i=0; i<3; i++){
            for (int j=0; j<=3; j++){
                System.out.print("Masukkan X[" + i + "]" + "[" + j + "] : ");
                x3[i][j] = input.nextInt();
            }
        } for (int i=0; i<3; i++){
            for (int j=0; j<=3; j++){
                System.out.print("X[" + (i+1) + "]" + "[" + (j+1) + "]" 
                        + " : " + x3[i][j] + "     ");
            } System.out.println(" ");
        } System.out.println(" ");
        
        System.out.println("Dibalik:");
        
        for (int i=0; i<3; i++){
            a        = x3[i][1];
            x3[i][1] = x3[i][3];
            x3[i][3] = a;
        }
        
        for (int i=0; i<3; i++){
            for (int j=0; j<=3; j++){
                System.out.print("X[" + (i+1) + "]" + "[" + (j+1) + "]" 
                        + " : " + x3[i][j] + "     ");
            } System.out.println(" ");
        } System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 4");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Masukkan bilangan n : ");
        n = input.nextInt();
        System.out.print("Masukkan bilangan m : ");
        m = input.nextInt();
        
        int [][] x4 = new int [n][m];
        
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print("Masukkan X[" + i + "]" + "[" + j + "] : ");
                x4[i][j] = input.nextInt();
            }
        } for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print("X[" + (i+1) + "]" + "[" + (j+1) + "]" 
                        + " : " + x4[i][j] + "     ");
            } System.out.println(" ");
        } System.out.println(" ");
        
        max = x4[0][0];
        
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (x4[i][j]>max){
                    max   = x4[i][j];
                    baris = i+1;
                    kolom = j+1;
                }
            }
        }
        
        System.out.println("Nilai maksimum = " + max);
        System.out.println("Baris ke-" + baris + " kolom ke-" + kolom);
    }
    
}
