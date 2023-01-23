package transport;

import transport.exeptions.NoDriverLicenseException;

import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private String name;
    private boolean driverHasLisence;
    private int experience;
    private T vehicle;

    public Driver(String name, boolean driverHasLisence, int experience, T vehicle) throws NoDriverLicenseException {
        this.name = name;
        if (driverHasLisence == false) {
            throw new NoDriverLicenseException(" Нет прав");
        } else {
            this.driverHasLisence = driverHasLisence;
            this.experience = experience;
            this.vehicle = vehicle;
        }
    }

    public Driver() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return driverHasLisence == driver.driverHasLisence && experience == driver.experience && Objects.equals(name, driver.name) && Objects.equals(vehicle, driver.vehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverHasLisence, experience, vehicle);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverHasLisence=" + driverHasLisence +
                ", experience=" + experience +
                ", vehicle=" + vehicle +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriverHasLisence() {
        return driverHasLisence;
    }

    public void setDriverHasLisence(boolean driverHasLisence) {
        this.driverHasLisence = driverHasLisence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public abstract void startDriving();
   public abstract void stopDriving();
   public abstract void refuel();
   public abstract void printDriveVehicle();
}
