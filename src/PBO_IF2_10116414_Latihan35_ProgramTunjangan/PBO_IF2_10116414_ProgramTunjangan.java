/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan35_ProgramTunjangan;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program tunjangan
 */
public class PBO_IF2_10116414_ProgramTunjangan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Pegawai kar = new Pegawai();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        kar.status = scn.next();

        kar.HasilHitung(kar.status, kar.gajiPokok);

    }
}
