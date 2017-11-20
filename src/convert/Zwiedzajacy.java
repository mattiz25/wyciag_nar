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
public class Zwiedzajacy extends Klient {
    //inicjacja pól dla Klasy Zwiedzajacy

    private static String miejsce;

    public Zwiedzajacy(double bilet) {
        super(bilet);
        Random losuj_miejsce = new Random();
        int i = losuj_miejsce.nextInt(6);
        switch (i) {
            case 0:
                miejsce = "Siedlce";
                break;

            case 1:
                miejsce = "Warszawa";
                break;

            case 2:
                miejsce = "Krakow";
                break;

            case 3:
                miejsce = "Gdańsk";
                break;

            case 4:
                miejsce = "Łódź";
                break;

            case 5:
                miejsce = "Dziewule";
                break;

            default:
                miejsce = "zla instrukcja";
                break;

        }
    }

    String getMiejsce() {
        return miejsce;
    }

}
