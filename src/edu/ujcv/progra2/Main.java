package edu.ujcv.progra2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        TravelerFacade tf = new TravelerFacade();

        List<Hotel> hoteles = tf.obtenerHoteles();
        for (Hotel hotel: hoteles) {
            System.out.println(hotel);
        }


        List<Flight> vuelos = tf.obtenerVuelos();
        for (Flight vuelo: vuelos) {
            System.out.println(vuelo);
        }
    }
}
