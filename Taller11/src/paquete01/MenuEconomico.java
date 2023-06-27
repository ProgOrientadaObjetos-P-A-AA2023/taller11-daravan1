/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author darav
 */
public class MenuEconomico extends Menu {

    private double valorInicial;
    private double porcentajeDescuento;

    public MenuEconomico(String plato, double valorM, double valorIni, double descuento) {
        super(plato, valorM);
        valorInicial = valorIni;
        porcentajeDescuento = descuento;
    }

    public void establecerInicial(double n) {
        valorInicial = n;
    }

    public double calcularPorcentajeDescuento() {
        return porcentajeDescuento = porcentajeDescuento / 100;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }


    @Override
    public double calcularSubtotal() {
        return valorInicial - (porcentajeDescuento * valorInicial);
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s"
                + "\tValor inicial: %.2f\n"
                + "\tPorcentaje Descuento: %.2f\n",
                cadenaFinal,
                obtenerValorInicial(),
                calcularPorcentajeDescuento());
        return cadenaFinal;
    }
}
