/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1AHITM
 * ----------------------------------------------------------
 * Übungsnr.:   13
 * Übungstitel: Radius
 * Autoren:     Quirin Ecker
 * Version:     1.0
 * Datum:       27.10.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Berechnung des Umfangs und der Fläche
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * Berechnung des Umfangs und der Fläche mit Math.PI.
 *
 * ----------------------------------------------------------
*/

import java.util.Scanner;
import java.lang.Math;

public class Ecker_Radius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double umfang;
        double flaeche;
        String ausgabeumfang;
        String ausgabeflaeche;

        System.out.print("Radius: ");
        double radius = scanner.nextDouble();

        umfang = 2 * radius * Math.PI;
        ausgabeumfang = "Umfang des Kreises : ";

        flaeche = radius * radius * Math.PI;
        ausgabeflaeche = "Flaeche des Kreises : ";


        System.out.printf("%s %.2f mm \n" , ausgabeumfang , umfang);
        System.out.printf("%s %.2f mm \n" , ausgabeflaeche , flaeche);





    }
}
