/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author gekbi
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HitungVolumeBalok B = new HitungVolumeBalok();
        B.setLebar(3);
        B.setPanjang(6);
        B.setTinggi(2);
     
        System.out.println("Volume Balok adalah : ");
        System.out.println(B.getHasil());
    }
    
}
