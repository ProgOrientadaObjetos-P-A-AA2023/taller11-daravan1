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
    private double valorHelado;
    private double valorPastel;

    public MenuNinios(String plato, double valorIni, double valorHel,
                     double valorPas) {
        super(plato, valorIni);

        valorHelado = valorHel;
        valorPastel = valorPas;
    }
    public void establecerrHelado(double n) {
        valorHelado = n;
    }
    public void establecerPastel(double n) {
        valorPastel = n;
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
                + "\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n"
                 +"\tValor del menu: %.2f\n",
                cadenaFinal,
                obtenerHelado(),
                obtenerPastel(),
                calcularSubtotal());
        return cadenaFinal;
    }
}
