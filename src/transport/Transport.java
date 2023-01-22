package transport;

import transport.exeptions.DiagnosticFailedException;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    public Object Driver;
    protected    String brand;
    protected   String model;
    protected int engineVolume;
    public List<Mechanic> mechanics;
    public List<Driver> drivers;
//    protected   int year;
//    protected   String country;
//    protected String color;
//    protected double maxSpeed;


    public Object getDriver() {
        return Driver;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public List<transport.Driver> getDrivers() {
        return drivers;
    }



    public Transport(String brand, String model, int engineVolume) {
        if (brand != null & !brand.isEmpty()) {
            this.brand = brand;
        }
        if (model != null & !model.isEmpty()) {
            this.model = model;
        }
       if (engineVolume != 0){
        this.engineVolume = engineVolume;
    }
//        this.year = year;
//        this.country = country;
 //       if (color != null && !color.isEmpty()) {
//            this.color = color;
 //       }
 //       if (maxSpeed != 0) {
  //          this.maxSpeed = maxSpeed;



//    private Transport(String brand, String model) {

//        this.brand = brand;
//        this.model = model;
 //       this.year = year;
//        this.country = country;
    }

    public Transport() {

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }
    public abstract void startDrive();
    public abstract void stopDrive();
    //   public int getYear() {
 //       return year;
 //   }

 //   public String getCountry() {
 //       return country;
 //   }

 //   public String getColor() {
//        return color;
//    }

 //   public void setColor(String color) {
 //       this.color = color;
 //   }

 //   public double getMaxSpeed() {
 //       return maxSpeed;
 //   }

 //   public void setMaxSpeed(double maxSpeed) {
//        this.maxSpeed = maxSpeed;
//   }
    public abstract void printType();
    public abstract boolean getDiagnosed() throws DiagnosticFailedException;



}
