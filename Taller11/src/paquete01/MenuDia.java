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

    private double valorInicial;
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String plato, double valorM, double valorIni, double valorPos,
            double valorBe) {
        super(plato, valorM);
        valorInicial = valorIni;
        valorPostre = valorPos;
        valorBebida = valorBe;
    }

    public void establecerValorInicial(double n) {
        valorInicial = n;
    }

    public void establecerBebida(double n) {
        valorBebida = n;
    }

    public void establecerPostre(double n) {
        valorPostre = n;
    }

    public double obtenerValorInicial() {
        return valorInicial;
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
                + "\tValor inicial: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tValor postre: %.2f\n",
                cadenaFinal,
                obtenerValorInicial(),
                obtenerBebida(),
                obtenerPostre());
        return cadenaFinal;
    }
}
