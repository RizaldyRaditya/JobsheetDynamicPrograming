/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author Rudi Erwanto
 */
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Uang : ");
        
        int uang = input.nextInt();
        int pecahan [] = new int [] {5000, 2000, 1000, 500, 100};
        int jumlah;
        
        for(int a = 0; a < pecahan.length; a++) {
            if(uang >= pecahan[a]) {
                jumlah = uang / pecahan[a];
                uang = uang % pecahan[a];
                System.out.println("Pecahan " + pecahan[a] + " sebanyak "+ jumlah +" keping");
            }
        }
    }
}
