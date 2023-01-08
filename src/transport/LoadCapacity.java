package transport;

public enum LoadCapacity { N1(0D, 3.5), N2(3.5, 12D), N3(12D, 30);
    private final double from;
    private final double to;

    LoadCapacity(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public static double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}
