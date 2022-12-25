package ru.skypro;

import transport.Bus;
import transport.Driver;
import transport.PassengerCar;
import transport.Truck;
//import transport.Car;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        PassengerCar bmw = new PassengerCar("bmw", "z8", 3);
        PassengerCar porshe = new PassengerCar("porshe", "a1", 4);
        PassengerCar kia = new PassengerCar("kia", "k5", (int)2.5);
        PassengerCar audi = new PassengerCar("audi", "a8", 2);
        Bus volvo = new Bus("volvo", "b1", 3);
        Bus mercedes = new Bus("mercedes", "x1", 4);
        Bus hyundai = new Bus("hyundai", "q23", (int)3.5);
        Bus vw = new Bus("vw", "r54", 5);
        Truck kamaz = new Truck("kamaz", "2233", 5);
        Truck zil = new Truck("zil", "123", 4);
        Truck mers = new Truck("mercedes", "666", 5);
        Truck bekha = new Truck("bmw", "999", 6);
        Driver<PassengerCar> first = new Driver<>("Иванов Иван Иванович", true, 20, bmw) {
            @Override
            public void startDriving() {

            }

            @Override
            public void stopDriving() {

            }

            @Override
            public void refuel() {

            }

            @Override
            public void printDriveVehicle() {

            }
        };
        first.printDriveVehicle();
//        Car lada = new Car("Lada ", "Granta", 2015, "Россия", "желтый", 160, "седан", 5, null);
//        Car audi = new Car("Audi ", "A8 50 L TDI quattro",2020, "Германия", "черный", 250,"седан", 7, null);
//        Car bmw = new Car("BMW ", "Z8", 2015, "Германия", "черный", 250, "седан", 2, null);
//        Car kia = new Car("Kia ", "Sportage 4-го поколения", 2018, "Южная Корея","красный" , 200, "джип", 7, null);
//        Car hyundai = new Car("Hyundai ", "Avante", 2014, "Южная Корея", "оранжевый", 220 , "седан", 5, null);

//        lada.info();
//        audi.info();
//        bmw.info();
//        kia.info();
//        hyundai.info();

        //       Bus first = new Bus("Mercedes", "big", 2010, "Germany", "белый", 150);
        //       Bus second = new Bus("Volvo", "super", 2015, "France", "черный", 140);
//        Bus third = new Bus("Ikarus", "old", 1990, "Russia", "голубой", 100);
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
    }


    }