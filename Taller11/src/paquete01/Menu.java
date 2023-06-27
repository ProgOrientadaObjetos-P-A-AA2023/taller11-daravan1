/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author darav
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;

    public Menu(String plato, double valorM) {
        nombrePlato = plato;
        valorMenu = valorM;
    }

    public abstract double calcularSubtotal();

    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public void establecerValorMenu(double n) {
        valorMenu = n;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    @Override
    public String toString() {

        String cadena = String.format("Nombre del plato: %s\n"
                + "\tValor del menú:  %.2f\n",
                obtenerNombrePlato(),
                obtenerValorMenu());
        return cadena;
    }
}
