package com.adecco.modelo;

public class Alcoholica extends Bebida{
    private int graduacion;

    @Override
    public String toString() {
        return "Alcoholica{" +
                "graduacion=" + graduacion +
                "} " + super.toString();
    }

    public Alcoholica() {
    }

    public Alcoholica(String nombre, String marca, double precio, int graduacion) {
        super(nombre, marca, precio);
        this.graduacion = graduacion;
    }

    public int getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(int graduacion) {
        this.graduacion = graduacion;
    }
}
