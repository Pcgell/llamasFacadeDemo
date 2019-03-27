package edu.ujcv.progra2;

import java.util.List;

public class TravelerFacade {
    ReservadorHotel rvh = new ReservadorHotel();
    ReservadorVuelos rvv = new ReservadorVuelos();

    public List<Hotel> obtenerHoteles(){
        return rvh.obtenerHoteles();
    }

    public List<Flight> obtenerVuelos(){
        return rvv.obtenerVuelos();
    }
}
