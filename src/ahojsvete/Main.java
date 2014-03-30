/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ahojsvete;

/**
 *
 * @author mpx
 */
public class Main {
    public double bmi;
    public char jmeno;
    //private int vyska;
    //private int vaha;

    public Main()
    {

    }
    public void spocitatBMI(double vyska, int vaha)
    {
        vyska = (vyska/100);
        bmi = vaha/(Math.pow(vyska, 2));
    }

    public void vypsatVysledek()
    {
        System.out.println("Tvoje BMI: " + bmi);
    }

    public static void main(String[] args) {
        Main Kristynka = new Main();
        Main Martinek = new Main();

        //Kristynka.spocitatBMI(164,63);
        //Kristynka.vypsatVysledek();

    }
}
