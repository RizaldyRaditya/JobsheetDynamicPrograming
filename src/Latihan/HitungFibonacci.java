/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Rudi Erwanto
 */
public class HitungFibonacci {
    private static void tampilJudul(String Identitas) {
        System.out.println("Identitas : "+Identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, .... dst.\n");
    }
     public static void main(String[] args) {
        String identitas = "Rizaldy Raditya Erwanto / X RPL 5 / 36";
        
       tampilJudul(identitas);
       int n = tampilInput();
    }
     private static int tampilInput() {
         Scanner input = new Scanner(System.in);
      
         System.out.println("Bilangan k-: ");
         int n = input.nextInt();
         
         return n;
     }
     
}
