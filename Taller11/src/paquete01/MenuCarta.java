/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author darav
 */
public class MenuCarta extends Menu {

    private double valorInicial;
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public MenuCarta(String plato, double valorM, double valorIni, double valorGuar,
            double valorBe, double servicio) {
        super(plato, valorM);
        valorInicial = valorIni;
        valorGuarnicion = valorGuar;
        valorBebida = valorBe;
        porcentajeServicio = servicio;
    }

    public void establecerInicial(double n) {
        valorInicial = n;
    }

    public void establecerGuarnicion(double n) {
        valorGuarnicion = n;
    }

    public void establecerBebida(double n) {
        valorBebida = n;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }
    public double obtenerGuarnicion() {
        return valorGuarnicion;
    }
    public double obtenerBebida() {
        return valorBebida;
    }

    public double calcularPorcentajeServicio() {
        return porcentajeServicio = porcentajeServicio / 100;
    }

    @Override
    public double calcularSubtotal() {
        return (valorInicial + valorGuarnicion + valorBebida + (porcentajeServicio * valorInicial));
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s"
                + "\tValor inicial: %.2f\n"
                + "\tValor guarnición: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tPorcentaje Adicional: %.2f\n",
                cadenaFinal,
                obtenerValorInicial(),
                obtenerGuarnicion(),
                obtenerBebida(),
                calcularPorcentajeServicio());
        return cadenaFinal;
    }

}
