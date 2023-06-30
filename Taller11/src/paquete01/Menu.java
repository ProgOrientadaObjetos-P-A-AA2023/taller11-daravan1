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
    protected double valorInicial;
    protected double valorMenu;

    public Menu(String plato, double valorIn) {
        nombrePlato = plato;
        valorInicial = valorIn;
    }

    public abstract double calcularSubtotal();

    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public void establecerValorInicial(double n) {
        valorInicial = n;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }
    

    @Override
    public String toString() {

        String cadena = String.format("Nombre del plato: %s\n"
                + "\tValor inicial:  %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicial());
        return cadena;
    }
}
