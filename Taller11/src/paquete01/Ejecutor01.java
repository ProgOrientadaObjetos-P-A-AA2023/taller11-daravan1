/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       MenuNinios menuNinos1 = new MenuNinios("Niños 01", 4.50, 2.0, 1.0, 1.50);
        MenuNinios menuNinos2 = new MenuNinios("Niños 02", 5.5, 3.0, 1.0, 1.50);
        MenuEconomico menuEconomico = new MenuEconomico("Econo 001", 3.0, 4.0, 25);
        MenuDia menuDia = new MenuDia("Dia 001", 7.0, 5.0, 1.0, 1.0);
        MenuCarta menuCarta = new MenuCarta("Carta 001", 10.10, 6.0, 1.0, 2.0, 10);
        
        Cuenta cuenta = new Cuenta("Rene Elizalde", 10);
        cuenta.agregarMenu(menuNinos1);
        cuenta.agregarMenu(menuNinos2);
        cuenta.agregarMenu(menuEconomico);
        cuenta.agregarMenu(menuDia);
        cuenta.agregarMenu(menuCarta);

        System.out.println(cuenta.toString());
    }
    

}
