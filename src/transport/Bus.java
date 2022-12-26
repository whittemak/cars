package transport;

public class Bus extends Transport implements Competing{
    String [] lapTime = {"2","2.5","3"};
    String [] maxSpeed = {"150","160","170"};
    public Bus(String brand, String model, int engineVolume) {
        super(brand, model, engineVolume);
    }

    public Bus() {
    }

    @Override
    public void startDrive() {
        System.out.println("Завожу машину, начинаю движение");

    }

    @Override
    public void stopDrive() {
        System.out.println("Останавливаюсь, выключаю зажигание.");

    }

    @Override
    public void pitStop() {
        System.out.println("Останавливаюсь на дозаправку");

    }

    @Override
    public String[] getBestLapTime() {
        System.out.println(" Лучшее время курга " + lapTime );
        return new String[0];
    }

    @Override
    public String[] getMaxSpeed() {
        System.out.println(" Лучшее время курга " + maxSpeed );
        return new String[0];
    }
    //   public Bus(String brand, String model, int year, String country, String color, double maxSpeed) {
 //       super(brand, model, year, country, color, maxSpeed);
 //   }

 //   public Bus() {
//    }

//    @Override
 //   public String toString() {
 //       return "Bus{" +
 //               "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", year=" + year +
//                ", country='" + country + '\'' +
//                ", color='" + color + '\'' +
//                ", maxSpeed=" + maxSpeed +
//                '}';
//    }

}
