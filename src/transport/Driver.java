package transport;

public abstract class Driver<T extends Transport> {
    private String name;
    private boolean driverHasLisence;
    private int experience;
    private T vehicle;

    public Driver(String name, boolean driverHasLisence, int experience, T vehicle) {
        this.name = name;
        this.driverHasLisence = driverHasLisence;
        this.experience = experience;
        this.vehicle = vehicle;
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
