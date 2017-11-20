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
public class Klient {

    private static String imie;
    private static String nazwisko;
    private static String wojewodztwo;
    private static String przedzial;
    private static double  bilet;

    //inicjacja pól dla Klasy Klient
    public Klient(double bilet) {
        this.bilet = bilet;
        Random losuj_wojewodztwo = new Random();
        int i = losuj_wojewodztwo.nextInt(6);
        switch (i) {
            case 0:
                wojewodztwo = "Mazowieckie";
                break;

            case 1:
                wojewodztwo = "Podlaskie";
                break;

            case 2:
                wojewodztwo = "Małopolskie";
                break;

            case 3:
                wojewodztwo = "Wielkpolskie";
                break;

            case 4:
                wojewodztwo = "Kujawskopomorskie";
                break;

            case 5:
                wojewodztwo = "Łódzkie";
                break;

            default:
                wojewodztwo = "zla wojewodztwo";
                break;

        }
        Random losuj_przedział = new Random();
        int j = losuj_przedział.nextInt(3);
        switch (j) {
            case 0:
                przedzial = "dziecko";
                break;

            case 1:
                przedzial = "młodzież";
                
            case 2:
                przedzial = "dorosły";
                break;

            default:
                przedzial = "zły przedział";
                break;

        }

        Random losuj_Imię = new Random();
        int h = losuj_Imię.nextInt(3);
        switch (h) {
            case 0:
                imie = "Mateusz";
                break;

            case 1:
                imie = "Franek";
                break;

            case 2:

                imie = "Zbigniew";
                break;

            default:
                imie = "złe imie";
                break;

        }

        Random losuj_nazwisko = new Random();
        int l = losuj_nazwisko.nextInt(3);
        switch (l) {
            case 0:
                nazwisko = "Kowalski";
                break;
            case 1:
                nazwisko = "Zapędowski";
                break;
            case 2:
                nazwisko = "Kwaśniewski";
                break;
            default:
                nazwisko = "zła nazwisko";
                break;
        }

    }
        public Klient() {
            bilet = 10;
        }
            


    String getImie() {
        return imie;
    }
        String getCena() {           
        return Double.toString(bilet);

    }

    String getNazwisko() {
        return nazwisko;
    }

    String getWojewodztwo() {
        return wojewodztwo;
    }

    String getPrzedzial() {
        return przedzial;
    }

}
