/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;

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

        ArrayList<Menu> listaMenus = new ArrayList<>();

        MenuNinios menuNinos1 = new MenuNinios("Niños 01", 2.0, 1.0, 1.50);
        menuNinos1.calcularSubtotal();
        listaMenus.add(menuNinos1);
        MenuNinios menuNinos2 = new MenuNinios("Niños 02", 3.0, 1.0, 1.50);
        menuNinos2.calcularSubtotal();
        listaMenus.add(menuNinos2);
        MenuEconomico menuEconomico = new MenuEconomico("Econo 001", 4.0, 25);
        menuEconomico.calcularSubtotal();
        listaMenus.add(menuEconomico);
        MenuDia menuDia = new MenuDia("Dia 001", 5.0, 1.0, 1.0);
         menuDia.calcularSubtotal();
        listaMenus.add(menuDia);
        MenuCarta menuCarta = new MenuCarta("Carta 001", 6.0, 1.5, 2.0, 10);
        menuCarta.calcularSubtotal();
        listaMenus.add(menuCarta);

        Cuenta cuenta = new Cuenta("Rene Elizalde", listaMenus,10);
        

        System.out.println(cuenta.toString());
    }

}
