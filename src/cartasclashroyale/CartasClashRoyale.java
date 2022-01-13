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
        String[] cartas = new String[15];
        
        asigno_cartas(cartas);
    }

    private static void asigno_cartas(String[] cartas) {
        cartas[0] = "Guerrero0";
        cartas[1] = "Guerrero1";
        cartas[2] = "Guerrero2";
    }
    
}
