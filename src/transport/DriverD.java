package transport;

public class DriverD extends Driver<Bus>{
    public DriverD(String name, boolean driverHasLisence, int experience, Bus vehicle) {
        super(name, driverHasLisence, experience, vehicle);
    }

    @Override
    public void startDriving() {
        System.out.println("Начинаю движение");

    }

    @Override
    public void stopDriving() {
        System.out.println("Останавливаюсь");

    }

    @Override
    public void refuel() {
        System.out.println("Останавливаюсь и заправляю машину");

    }

    @Override
    public void printDriveVehicle() {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + getVehicle() + " и будет учавствовать в заезде." );

    }
}

