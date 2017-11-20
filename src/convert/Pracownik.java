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
public class Pracownik {
    //inicjacja pól dla Klasy Pracownik

    private String imie;
    private String nazwisko;

    public Pracownik() {
        Random losuj_Pracownika = new Random();
        int h = losuj_Pracownika.nextInt(3);
        switch (h) {
            case 0:
                imie = "Huber";
                nazwisko = "Kowalski";

                break;

            case 1:
                imie = "Miłosz";
                nazwisko = "Zapędowski";

                break;

            case 2:

                imie = "Tadeusz";
                nazwisko = "Kwaśniewski";

                break;

            default:
                imie = "złe imie";
                break;
        }
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void zmien_pracownika() {
        String imie1, nazwisko1;
        do {
            System.out.println("1" + imie + nazwisko);
            Random losuj_nastepny = new Random();
            int p = losuj_nastepny.nextInt(3);
            switch (p) {
                case 0:
                    imie1 = "Huber";
                    nazwisko1 = "Kowalski";

                    break;

                case 1:
                    imie1 = "Miłosz";
                    nazwisko1 = "Zapędowski";

                    break;

                case 2:

                    imie1 = "Tadeusz";
                    nazwisko1 = "Kwaśniewski";

                    break;

                default:
                    imie1 = "złe imie";
                    nazwisko1 = "złe nazwisko";
                    break;
            }
        } while (imie1 == this.imie);
        imie = imie1;
        nazwisko = nazwisko1;
    }
//metoda zmieniająca pracownika w zależnośći od 
}
