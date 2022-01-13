/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartasclashroyale;

/**
 *
 * @author miki
 */
public class CartasClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        
        
        String[] cartas = new String[15];

        asigno_cartas(cartas);        
        asigno_cartas2(cartas);

        

    }

    private static void asigno_cartas(String[] cartas) {
        cartas[0] = "Guerrero0";
        cartas[1] = "Guerrero1";
        cartas[2] = "Guerrero2";
    }
    
    private static void asigno_cartas2(String[] cartas) {
        cartas[3] = "Guerrero0profe";
        cartas[4] = "Guerrero1profe";
        cartas[5] = "Guerrero2profe";
    }
}
