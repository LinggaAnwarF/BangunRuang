
package menghitung;


public class kubus extends BangunRuang {
    float sisi;
    float s;
    
float volume(){
   float volume = s * s * s;
   System.out.println("Volume kubus: " + volume);
   return volume;
}


float lp(){
   float lp = 6 * s * s;
   System.out.println("Luas Permukaan kubus: " + lp);
   return lp;
}
}