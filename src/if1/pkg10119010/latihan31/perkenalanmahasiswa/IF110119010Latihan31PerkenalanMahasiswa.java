/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk menampilkan identtitas
 *                     Mahasiswa baru
 */
public class IF110119010Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa obj = new Mahasiswa();
        obj.nim = "10119010";
        obj.nama = "Maulana Imam Malik";
        System.out.println("Hello Everyone");
        System.out.println("My NIM is " + obj.nim);
        System.out.println("My Name is " + obj.nama);
        obj.perkenalkanDiri();
    }
    
}
