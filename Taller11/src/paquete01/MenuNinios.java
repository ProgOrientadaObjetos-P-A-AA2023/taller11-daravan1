/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author darav
 */
public class MenuNinios extends Menu {
    private double valorInicial;
    private double valorHelado;
    private double valorPastel;

    public MenuNinios(String plato, double valorM, double valorIni, double valorHel,
                     double valorPas) {
        super(plato, valorM);
        valorInicial = valorIni;
        valorHelado = valorHel;
        valorPastel = valorPas;
    }

    public void establecerValorInicial(double n) {
        valorInicial = n;
    }
    public void establecerrHelado(double n) {
        valorHelado = n;
    }
    public void establecerPastel(double n) {
        valorPastel = n;
    }
    
    public double obtenerValorInicial() {
        return valorInicial;
    }
    public double obtenerHelado() {
        return valorHelado;
    }
    public double obtenerPastel() {
        return valorPastel;
    }
    
    @Override
    public double calcularSubtotal() {
        return valorInicial + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s"
                + "\tValor inicial: %.2f\n"
                + "\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n",
                cadenaFinal,
                obtenerValorInicial(),
                obtenerHelado(),
                obtenerPastel());
        return cadenaFinal;
    }
}
