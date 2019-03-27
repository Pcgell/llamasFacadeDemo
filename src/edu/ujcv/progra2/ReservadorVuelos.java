package edu.ujcv.progra2;

import java.util.ArrayList;
import java.util.List;

public class ReservadorVuelos {
    ArrayList<Flight> vuelos;

    List<Flight> obtenerVuelos(){
        return vuelos;
    }

    public ReservadorVuelos(){
        vuelos  = new ArrayList<>();
        vuelos.add(new Flight("American Airlines",700.50,"AA-450"));
        vuelos.add(new Flight("American Airlines",800.50,"AA-480"));
        vuelos.add(new Flight("Delta Airlines",750.50,"DLT-335"));
    }
}
