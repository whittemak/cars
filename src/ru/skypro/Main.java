package ru.skypro;

import transport.Bus;
import transport.Car;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Granta", 2015, "Россия", "желтый", 160, "седан", 5, null);
        Car audi = new Car("Audi ", "A8 50 L TDI quattro",2020, "Германия", "черный", 250,"седан", 7, null);
        Car bmw = new Car("BMW ", "Z8", 2015, "Германия", "черный", 250, "седан", 2, null);
        Car kia = new Car("Kia ", "Sportage 4-го поколения", 2018, "Южная Корея","красный" , 200, "джип", 7, null);
        Car hyundai = new Car("Hyundai ", "Avante", 2014, "Южная Корея", "оранжевый", 220 , "седан", 5, null);

        lada.info();
        audi.info();
        bmw.info();
        kia.info();
        hyundai.info();

        Bus first = new Bus("Mercedes", "big", 2010, "Germany", "белый", 150);
        Bus second = new Bus("Volvo", "super", 2015, "France", "черный", 140);
        Bus third = new Bus("Ikarus", "old", 1990, "Russia", "голубой", 100);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
