package com.adecco.modelo;

public class Agua extends Bebida{
    //le ponemos una característica propia:
    private String origen;

    //sacamos automaticamente el toString


    @Override
    public String toString() {
        return "Agua{" +
                "origen='" + origen + '\'' +
                "} " + super.toString(); //lo hacemos con el +concat super...
    }

    //constructores
    public Agua() {
    }

    public Agua(String nombre, String marca, double precio, String origen) {
        super(nombre, marca, precio);
        this.origen = origen;
    }

    //setter y getter de origen

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
