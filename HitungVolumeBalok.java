
package tugas2;

/**
 *
 * @author gekbi
 */
public class HitungVolumeBalok {
     private double panjang, lebar, tinggi, hasil;
    
    public void setPanjang( double pj){
        panjang = pj;
    }
    public double getPanjang(){
        return this.panjang;
    }
    public void setLebar(double lb){
        lebar = lb;
    }
    public double getLebar(){
        return this.lebar;
    }
    
    public void setTinggi(double t){
        tinggi = t;
    }
    public double getTinggi(){
        return this.tinggi;
    }
      
    public double getHasil(){
        return this.hasil;
    }
    public double volume(String Hasil){
        this.hasil= this.lebar * this.panjang * this.tinggi;
        return this.hasil;
    }
    
}
