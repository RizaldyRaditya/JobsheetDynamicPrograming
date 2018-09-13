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
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Berat : ");
        
        int jumlahberat = input.nextInt();
        int berat [] =  {7, 5, 4, 3, 2};
        int jumlah;
        int bayaran;
        int total = 0;
        
        for(int a = 0; a < berat.length; a++){
        if(jumlahberat >= berat [a] ) {
            jumlah = jumlahberat / berat[a];
            jumlahberat = jumlahberat % berat[a];
            if(berat[a] == 7 ) {
                bayaran = 10000*jumlah;
            }
            else if(berat[a] == 5) {
                bayaran = 70000*jumlah;
            }
            else if(berat[a] == 4) {
                bayaran = 5000*jumlah;
            }
            else if(berat[a] == 3) {
                bayaran = 3000*jumlah;
            }
            else {
                bayaran = 2000*jumlah;
            }
            total += bayaran;
            System.out.println("Berat " +berat[a]+ "Kg "+"sebanyak : "+ jumlah + "\nSeharga "+bayaran);
        }
        }
        System.out.println("Total Harga = Rp."+total);
        }
}
