package transport;

import transport.exeptions.DiagnosticFailedException;

public class PassengerCar extends Transport implements Competing {
    private BodyType bodyType;
    String [] lapTime = {"2","2.5","3"};
    String [] maxSpeed = {"150","160","170"};

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public PassengerCar(String brand, String model, int engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;

    }

    public PassengerCar() {
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
        String BodyType = null;
        if (BodyType == null){
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип авто: " + BodyType);
        }
    }

    @Override
    public boolean getDiagnosed() throws DiagnosticFailedException {
        if (getDriver() != null){
            return true;
        } else {
            throw new DiagnosticFailedException("Необходимо указать тип прав");
        }
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
