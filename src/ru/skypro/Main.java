package ru.skypro;

import transport.*;
import transport.exeptions.DiagnosticFailedException;
//import transport.Car;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        PassengerCar bmw = new PassengerCar("bmw", "z8", 3, BodyType.SEDAN);
        PassengerCar porshe = new PassengerCar("porshe", "a1", 4, BodyType.COUPE);
        PassengerCar kia = new PassengerCar("kia", "k5", (int)2.5, BodyType.SEDAN);
        PassengerCar audi = new PassengerCar("audi", "a8", 2, BodyType.HATCHBACK);
        Bus volvo = new Bus("volvo", "b1", 3, Capacity.EXTRA_LARGE);
        Bus mercedes = new Bus("mercedes", "x1", 4, Capacity.MEDIUM);
        Bus hyundai = new Bus("hyundai", "q23", (int)3.5, Capacity.EXTRA_SMALL);
        Bus vw = new Bus("vw", "r54", 5, Capacity.LARGE);
        Truck kamaz = new Truck("kamaz", "2233", 5, LoadCapacity.N1);
        Truck zil = new Truck("zil", "123", 4, LoadCapacity.N2);
        Truck mers = new Truck("mercedes", "666", 5, LoadCapacity.N3);
        Truck bekha = new Truck("bmw", "999", 6, LoadCapacity.N1);
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
        try {
            bmw.getDiagnosed();
        } catch (DiagnosticFailedException e) {
            System.out.println("Ошибка диагностики");
        }

        Mechanic mechanic1 = new Mechanic("Иван", "Иванов", "компания1", TransportType.ALL);
        Mechanic mechanic2 = new Mechanic("Петр", "Петров", "компания2", TransportType.BUS);
        Mechanic mechanic3 = new Mechanic("Сергей", "Сергеев", "компания3", TransportType.PASSENGER_CAR);
        bmw.addMechanic(mechanic1);
        porshe.addMechanic(mechanic1);
        kia.addMechanic(mechanic1);
        audi.addMechanic(mechanic1);
        volvo.addMechanic(mechanic2);
        mercedes.addMechanic(mechanic2);
        hyundai.addMechanic(mechanic2);
        vw.addMechanic(mechanic2);
        kamaz.addMechanic(mechanic1);
        zil.addMechanic(mechanic1);
        mers.addMechanic(mechanic1);
        bekha.addMechanic(mechanic1);

        List<Transport> allVehicles = new ArrayList<>();

        allVehicles.add(bmw);
        allVehicles.add(porshe);
        allVehicles.add(kia);
        allVehicles.add(audi);
        allVehicles.add(volvo);
        allVehicles.add(mercedes);
        allVehicles.add(hyundai);
        allVehicles.add(vw);
        allVehicles.add(kamaz);
        allVehicles.add(zil);
        allVehicles.add(mers);
        allVehicles.add(bekha);
        for (Transport transport: allVehicles){
            System.out.println(transport + " водитель " + transport.getDriver() + " механики " + transport.getMechanics());


        }
        Driver<PassengerCar> ivan = new Driver() {
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

        List<Driver> drivers = new ArrayList<>();
        drivers.add(ivan);
        DiagnosticStation sto = new DiagnosticStation();
        sto.addTransport(bmw);
        sto.addTransport(audi);
        sto.doDiagnostics();

       Map<Transport, List<Mechanic>> transportMechanicMap = new HashMap<>();
       for (Transport transport: allVehicles ){
           transportMechanicMap.put(transport, allVehicles.getMechanics());
        }
        public static void printDrivers(){
        DriverB driver1 = new DriverB("Ivan", true,10, new PassengerCar());
        DriverC driver2 = new DriverC("Petr", true,15, new Truck());
        DriverD driver3 = new DriverD("Vasiliy", true,20, new Bus());
        Set<Driver> drivers = new HashSet<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        Iterator<Driver> iterator = drivers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        printDrivers();
    }


    }

//}