/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert;

import java.util.Random;

/**
 *
 * @author User
 */
public class Uczestnik extends Klient {

    private static String sprzet;
    //inicjacja pól dla Klasy Uczestnik

    public Uczestnik(double bilet) {
        super(bilet);
        Random losuj_sprzet = new Random();
        int i = losuj_sprzet.nextInt(2);
        switch (i) {
            case 0:
                sprzet = "narty";
                break;

            case 1:
                sprzet = "snowboard";
                break;

            default:
                sprzet = "zle dane";
                break;
//
        }
    }

    String getSprzet() {
        return sprzet;
    }

}
