package com.adecco.presentacion;

import com.adecco.modelo.Agua;
import com.adecco.modelo.Bebida;

public class ProbarBebidas {
    public static void main(String[] args) {
        //instanciamos Agua utilizando polimorfismo
        Bebida a1 = new Agua("agua", "Solan de Cabras",2, "Cuenca");
        System.out.println(a1);
        //supongamos que quiero cambiar el origen. Tenemos que hacer un Casting para llegar a origen:
        Agua a2 = (Agua) a1;
        a2.setOrigen("Sierra Nevada");
        System.out.println(a2);

    }
}
