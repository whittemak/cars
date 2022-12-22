package transport;

public class Transport {
    protected    String brand;
    protected   String model;
    protected   int year;
    protected   String country;
    protected String color;
    protected double maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        if (color != null && !color.isEmpty()) {
            this.color = color;
        }
        if (maxSpeed != 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    private Transport(String brand, String model, int year, String country) {

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
    }

    public Transport() {

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
