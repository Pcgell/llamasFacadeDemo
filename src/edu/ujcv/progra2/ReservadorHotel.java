package edu.ujcv.progra2;

import java.util.ArrayList;
import java.util.List;

public class ReservadorHotel {

    ArrayList<Hotel> hoteles;

    public List<Hotel> obtenerHoteles(/*fechas*/){
        return  hoteles;
    }

    ReservadorHotel(){
        hoteles = new ArrayList<>();
        hoteles.add(new Hotel("marriot",48.99,"Dallas"));
        hoteles.add(new Hotel("Hayatt",100,"dallas"));
    }
}
