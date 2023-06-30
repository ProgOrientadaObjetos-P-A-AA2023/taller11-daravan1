/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author darav
 */
public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDia(String plato, double valorIni, double valorPos,
            double valorBe) {
        super(plato, valorIni);
        valorPostre = valorPos;
        valorBebida = valorBe;
    }
    
    public void establecerBebida(double n) {
        valorBebida = n;
    }

    public void establecerPostre(double n) {
        valorPostre = n;
    }

    public double obtenerBebida() {
        return valorBebida;
    }

    public double obtenerPostre() {
        return valorBebida;
    }

    @Override
    public double calcularSubtotal() {
        return valorInicial + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s"
                + "\tValor bebida: %.2f\n"
                + "\tValor postre: %.2f\n"
                +"\tValor del menu: %.2f\n",
                cadenaFinal,
                obtenerBebida(),
                obtenerPostre(),
                calcularSubtotal());
        return cadenaFinal;
    }
}
