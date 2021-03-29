/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5.pkg2022431708.latihan54.kordinat;

/**
 *
 * @author HP
 */
public class WarnaKordinat {
    
    private String namaWarna;
    
   WarnaKordinat(int x, int y, String namaWarna){
            
       x = 10;
       y = 4;
       this.namaWarna = "Jingga";
       
    }
   
   public void setNama(String namaWarna){
       this.namaWarna = namaWarna;
   }
   
   public String getNamaWarna(){
       return namaWarna;
   }
    
}
