package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }

    //Getter and setter

    public int getSerialNumber(){
        return this.serialNumber;

    }

    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public void setModel(String model){
          return this.model;
    }


}