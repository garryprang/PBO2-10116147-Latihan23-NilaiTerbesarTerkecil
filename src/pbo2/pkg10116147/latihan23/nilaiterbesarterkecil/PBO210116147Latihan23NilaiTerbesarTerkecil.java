/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan23.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menampilkan nilai terbesar dan terkecil.
 */

public class PBO210116147Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i,jum_nilai,terbesar = 0,terkecil = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= PROGRAM NILAI MAHASISWA =======");
        System.out.print("Masukkan nama petugas\t\t: ");
        String petugas = scanner.next();
        System.out.print("Masukkan banyaknya mahasiswa\t: ");
        jum_nilai = scanner.nextInt();
        
        int nilai_mhs[] = new int[jum_nilai];
        for (i =0; i < jum_nilai; i++){
            System.out.printf("Masukan Nilai Mahasiswa ke-%d\t: ", i+1);
            nilai_mhs[i] = scanner.nextInt();
        }
        
        System.out.println();
        System.out.println("======== HASIL NILAI MAHASISWA ========");
        terkecil = nilai_mhs[0];
        for (i = 0; i < jum_nilai; i++) {
            System.out.printf("Nilai mahasiswa ke-%1$d\t: %2$d%n", i+1, nilai_mhs[i]);
            if (nilai_mhs[i] < terkecil){
                terkecil = nilai_mhs[i];
            }
            if (nilai_mhs[i] > terbesar){
                terbesar = nilai_mhs[i];
            }
        }
        
        System.out.println("Nilai terbesar\t\t: "+terbesar);
        System.out.println("Nilai terkecil\t\t: "+terkecil);      
        System.out.println("Petugas\t\t\t: " + petugas);
        System.out.println();
        System.out.println("Developed by Garry Prang"); 
    }
    
}
