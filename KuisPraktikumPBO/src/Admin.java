/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nurpujiyatun
 */
public class Admin implements Seleksi {
  private String nama,nim;
  private int ratarata;
  private int nilai1,nilai2,nilai3,nilai4;
  private String lihatAkhir;
    
    Public AdminLab (String nama,String nim,int nilai1,int nilai2,int nilai3,int nilai4){
        this.nama = nama;
        this.nim  = nim;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
      return null;
        
    }
    
    public int hitungRataRata() {
        ratarata = (nilai1+nilai2+nilai3+nilai4)/4;
        return ratarata;
    }
    public int getRataRata(){
        return hitungRataRata();
    }
    
    public String lihatAkhir(){
        if (getRataRata()>85 && getRataRata()<101){
            System.out.println("Keterangan : Lolos");
            System.out.println("Yeah!  "+nim+" SELAMAT ANDA DITERIMA SEBAGAI ADMIN LABORATORIUM");
        }else {
            System.out.println("Keterangan : Gagal");
            System.out.println("Hello! "+nim+"JANGAN MENYERAH & TETAP SEMANGAT");
        }
      return null;
}
}