
package pbo5.pkg2022431708.latihan54.kordinat;


public class PBO52022431708Latihan54Kordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kordinat k = new Kordinat(10, 4);
        WarnaKordinat w = new WarnaKordinat(10, 4,"Jingga");
        
        
        System.out.println("Warna Koordinat : "+w.getNamaWarna() );
        System.out.println("Kordinat Sumbu x : "+k.getX()+", Y : "+k.getY() );

        
    }
    
}
