package transport;

public interface Competing {
    void pitStop();
    String [] getBestLapTime();
    String [] getMaxSpeed();
}
