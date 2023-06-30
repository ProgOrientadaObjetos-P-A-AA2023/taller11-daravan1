/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author darav
 */
public class Cuenta {

    private String cliente;
    private double iva;
    private ArrayList<Menu> menus;
    private double total;

    public Cuenta(String c, ArrayList<Menu> me, double i) {
        cliente = c;
        iva = i;
        menus = me;
        total = 0;
    }

    public void establecerCliente(String n) {
        cliente = n;
    }

    public void establecerIva(double n) {
        iva = n;
    }

    public String obtenerCliente() {
        return cliente;
    }
    public double obtenerIva() {
        return iva;
    }

    public void establecerLista(ArrayList<Menu> lista) {
        menus = lista;
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (Menu menu : menus) {
            subtotal = subtotal + menu.calcularSubtotal();
        }
        return subtotal;
    }

    public double calcularValorTotal() {
        return calcularSubtotal() + calcularSubtotal()*(iva / 100);
    }

    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Nombre del cliente: %s\n",
                obtenerCliente());
        String cadenaMenu = "";
        for (Menu menu : menus) {
            cadenaMenu = cadenaMenu + String.format("Menu del Día:\n\t%s\n", menu.toString());
        }
        cadena = cadena + cadenaMenu;
        cadena = cadena + String.format("Subtotal: %.2f\n"
                + "IVA: %.2f\n"
                + "Total a pagar: %.2f\n",
                calcularSubtotal(),
                obtenerIva(),
                calcularValorTotal());
        return cadena;
    }
}
