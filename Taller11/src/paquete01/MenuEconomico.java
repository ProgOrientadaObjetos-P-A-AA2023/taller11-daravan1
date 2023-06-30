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
    
    private double porcentajeDescuento;

    public MenuEconomico(String plato, double valorIni, double descuento) {
        super(plato, valorIni);

        porcentajeDescuento = descuento;
    }

    public void establecerInicial(double n) {
        valorInicial = n;
    }

    public double calcularPorcentajeDescuento() {
        return porcentajeDescuento = porcentajeDescuento / 100;
    }


    @Override
    public double calcularSubtotal() {
        return valorInicial - (porcentajeDescuento * valorInicial);
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s"
                + "\tPorcentaje Descuento: %.2f\n"
                +"\tValor del menu: %.2f\n",
                cadenaFinal,
                calcularPorcentajeDescuento(),
                calcularSubtotal());
        return cadenaFinal;
    }
}
