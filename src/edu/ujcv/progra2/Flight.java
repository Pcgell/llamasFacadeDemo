package edu.ujcv.progra2;

public class Flight {
    private String name;
    private double price;
    private String flightNumber;

    public Flight(String name, double price, String flightNumber) {
        this.name = name;
        this.price = price;
        this.flightNumber = flightNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString(){
        return "AeroLinea: "+name+"\n"+
                "precio: "+price+"\n"+
                "Numero V:" +flightNumber;
    }
}
