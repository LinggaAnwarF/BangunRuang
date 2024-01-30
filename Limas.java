
package menghitung;

public class Limas extends BangunRuang{
  
        float a;
        float ts;
        float tl;
        
        float volume(){
            float volume = a * ts * tl / 3 / 2;
            System.out.println("Volume Limas Segitiga: " + volume);
            return volume;
        }
    }

