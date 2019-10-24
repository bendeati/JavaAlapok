package bdc_lista_tetelek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author bendevchannel
 */
public class Bdc_lista_tetelek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hozzunk létre egy listát - egész számok tárolására
        ArrayList<Integer> szamok = new ArrayList<>();
        Random r = new Random();
        //generálunk 20 számot [-10,50]: 61 db szám
        for (int i = 0; i < 20; i++) {
            szamok.add(r.nextInt(61)-10);
        }
        System.out.println("A lista elemei:");
        System.out.println(szamok);
        
        //Összegzés
        int osszeg = 0;
        for (int i = 0; i < szamok.size(); i++) {
            osszeg += szamok.get(i);
        }
        System.out.println("A lista elemeinek összege: " + osszeg);
        
        //Összegzés másként
        int osszeg2 = 0;
        osszeg2 = szamok.stream().map((szam) -> szam).reduce(osszeg2, Integer::sum);
        System.out.println("Az összeg másként: " + osszeg2);
        
        //Megszámlálás
        //Számoljuk meg a negatív számokat! <0
        int dbNegativ = 0;
        for (Integer szam : szamok) {
            if(szam < 0)
            {
                dbNegativ++;
            }
        }
        System.out.println("Negatív számok darabszáma: " + dbNegativ);
        
        //Szélsőérték keresés - A legkisebb szám!
        int min = szamok.get(0);
        //int min2 = Integer.MAX_VALUE;
        for (Integer szam : szamok) {
            if(szam < min)
            {
                min = szam;
            }
        }
        System.out.println("A legkisebb érték: " + min);
        
        //rendezzük a lista elemeit!
        //Collections.sort(szamok);
        
        
        for (int i = 0; i < szamok.size()-1; i++) {
            for (int j = i+1; j < szamok.size(); j++) {
                if(szamok.get(i) > szamok.get(j))
                {
                    int cs = szamok.get(i);
                    //szamok.get(i) = szamok.get(j);
                    szamok.set(i,szamok.get(j));
                    //szamok.get(j) = cs;
                    szamok.set(j, cs);
                }
            }
        }
        
        System.out.println(szamok);
    }
    
}
