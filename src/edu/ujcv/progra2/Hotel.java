package edu.ujcv.progra2;

public class Hotel {

    private String name;
    private double price;
    private String address;


    public Hotel (String name, double price,String address){
        this.address = address;
        this.price = price;
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){

       return "Hotel: "+name +"\n" +
               "precio: " +price+"\n"+
               "Direccion: "+address;
    }
}
