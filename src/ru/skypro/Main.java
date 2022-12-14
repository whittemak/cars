package ru.skypro;

public class Main {

    public static void main(String[] args) {
	Car lada = new Car("Lada ","Granta", (int) 1.7, "желтый", 2015, "Россия");
    Car audi = new Car("Audi ","A8 50 L TDI quattro", 3, "черный", 2020, "Германия");
    Car bmw = new Car("BMW ","Z8", 3, "черный", 2015, "Германия");
    Car kia = new Car("Kia ","Sportage 4-го поколения", (int) 2.4, "красный", 2018, "Южная Корея");
    Car hyundai = new Car("Hyundai ","Avante", (int) 1.6, "оранжевый", 2014, "Южная Корея");

    lada.info();
    audi.info();
    bmw.info();
    kia.info();
    hyundai.info();
    }
}
