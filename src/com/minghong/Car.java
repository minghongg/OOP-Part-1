package com.minghong;

public class Car {
    //private means you can't access attributes outside Car class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //method
    public void setModel(String model){
        //validation
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        }
        else{
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
}
