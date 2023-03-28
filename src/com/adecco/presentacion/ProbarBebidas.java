package com.adecco.presentacion;

import com.adecco.modelo.Agua;
import com.adecco.modelo.Bebida;
import com.adecco.modelo.Gaseosa;

public class ProbarBebidas {
    public static void main(String[] args) {
        //instanciamos Agua utilizando polimorfismo
        Bebida a1 = new Agua("agua", "Solan de Cabras",2, "Cuenca");
        System.out.println(a1);
        //supongamos que quiero cambiar el origen. Tenemos que hacer un Casting para llegar a origen:
        Agua a2 = (Agua) a1;
        a2.setOrigen("Sierra Nevada");
        System.out.println(a2);

        Bebida g1 = new Gaseosa("coca cola Zero", "Coca-cola", 0.75, 0.12);
        //ha pasado el tiempo y quiero cambiar la cantidad de azucar:
        Gaseosa g2 = (Gaseosa) g1;
        g2.setCantidadAzucar(0.05);
        System.out.println(g2);
    }
}
