package transport;

public class Truck extends Transport implements Competing{
    private LoadCapacity loadCapacity;
    String [] lapTime = {"2","2.5","3"};
    String [] maxSpeed = {"150","160","170"};

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Truck(String brand, String model, int engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;

    }

    public Truck() {
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
    public void printType() {
        String LoadCapacity = null;
        if (LoadCapacity == null){
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Грузополъемность: " + LoadCapacity);
        }
    }

    @Override
    public void getDiagnosed() {
        System.out.println("Проходит диагностику");
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
}
