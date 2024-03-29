/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Program untuk menentukan nilai terbesar dan terkecil
 * mahasiswa berbasis object, nilai berasal dari masukkan pengguna
 */
public class NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NilaiMahasiswa nilaiMhs = new NilaiMahasiswa();
        Petugas petugas = new Petugas();
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil "
                + "Nilai Mahasiswa=====");
  
        // input petugas
        System.out.print("Masukkan Nama Petugas : ");
        petugas.setNama(scanner.next());
        
        // input banyak mahasiswa
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        nilaiMhs.setJmlMahasiswa(scanner.nextInt());
        
        // input nilai per mahasiswa
        for(int i = 0; i < nilaiMhs.getJmlMahasiswa(); i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" = ");
            nilaiMhs.setNilai(scanner.nextInt());
        }
        
        nilaiMhs.tampilNilai();
        System.out.println("\nPetugas : " + petugas.getNama());
    }
    
}
