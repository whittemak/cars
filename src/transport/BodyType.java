package transport;

public enum BodyType { SEDAN("Седан"), HATCHBACK("Хэтчбэк"), COUPE("Купэ"), UNIVERSAL("Универсал"), SUV("Внедорожник"), CROSSOVER("Кроссовер"), PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");
    private String name;

    BodyType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BodyType " + name + " .";
    }
}
