/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan31.perkenalanmahasiswa;

/**
 *
 * @author MIM
 */
public class Mahasiswa {
    public String nim;
    public String nama;
    
    public void perkenalanDiri() {
        System.out.println("Hello Everyone");
        System.out.println("My NIM is ".concat(nim));
        System.out.println("My Name is ".concat(nama).concat("\n"));
    }
}
