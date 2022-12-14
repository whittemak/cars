package ru.skypro;

public class Car {
    String brand;
    String model;
    int engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, int engineVolume, String color, int year, String country) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";

        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = (int) 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color != null) {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (year <= 0) {
            this.engineVolume = 2000;
        } else {
            this.year = year;
        }
        if (country != null) {
            this.country = country;
        } else {
            this.country = "default";
        }
    }

    void info(){
        System.out.println(brand + model + ", " + year + " год выпуска, сборка в " + country + ", цвет кузова - " + color + ", объем двигателя - " + engineVolume + ".");

    }
}
