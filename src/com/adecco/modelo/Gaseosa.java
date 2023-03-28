package com.adecco.modelo;

public class Gaseosa extends Bebida{
    private double cantidadAzucar;

    //metodo
    @Override
    public String toString() {
        return "Gaseosa{" +
                "cantidadAzucar=" + cantidadAzucar +
                "} " + super.toString();
    }

    //constructores

    public Gaseosa() {
    }

    public Gaseosa(String nombre, String marca, double precio, double cantidadAzucar) {
        super(nombre, marca, precio);
        this.cantidadAzucar = cantidadAzucar;
    }

    //set y getter

    public double getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(double cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }
}
