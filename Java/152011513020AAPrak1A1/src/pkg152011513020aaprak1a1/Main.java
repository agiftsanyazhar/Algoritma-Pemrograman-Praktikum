/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak1a1;

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
        System.out.println("Praktikum 1");
        System.out.println(" ");
        int bilbul1 = 4;
        int bilbul2 = 5;
        int bilbul3 = 6;
        System.out.println(bilbul1 + " " + bilbul2 + " " +bilbul3);
        System.out.println("");
            
        int a=7, b=8, c=9;
        System.out.println("Nilai:\na = "+a+" \nb = "+b+" \nc c "+c+" ");
        System.out.println("");
            
        Scanner masukkan =  new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat : ");
        int bil1 = masukkan.nextInt();
        System.out.println("Nilai bilangan bulat = "+bil1+"");
        System.out.println("");

        System.out.print("Masukkan bilangan real : ");
        double bilR1 = masukkan.nextDouble();
        System.out.println("Nilai bilangan real = "+bilR1+"");
        System.out.println("");

        System.out.print("Masukkan string : ");
        String s1 = masukkan.next();
        System.out.println("Nilai string 1 = "+s1+"");
        String s2 = masukkan.nextLine();
        System.out.println("Nilai string 2 = "+s2+"");
        System.out.println("");

        boolean c1 = 2 > 3, c2 = 5==4+1;
        System.out.println("Nilai kondisi:\nc1 (2 > 3) = "+c1+" \nc2 (5=4+1) = "+c2+"");
        // TODO code application logic here
    }
    
}
