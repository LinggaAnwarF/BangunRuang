
package menghitung;


public class Balok extends BangunRuang {

    float s;
    float p;
    float t;
    float l;
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
    

