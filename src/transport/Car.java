package transport;

import java.time.LocalDate;

//public class Car extends Transport {
//    private int engineVolume;
//    private String gears;
//    private final String type;
//    private String regNumber;
//    private final int seats;
//    private boolean sumTyres;
//    private final Key key;
//   private Insurance insurance;

//    public Car(String brand, String model, int year, String country, String color, double maxSpeed, String type, int seats, Key key) {
//        super(brand, model, year, country, color, maxSpeed);
//        this.type = type;
//        this.seats = seats;
//        this.key = key;
//    }




//    public Car(int engineVolume, String type, int seats, Key key, Insurance insurance) {
 //       super();
 //       if (engineVolume <= 0) {
//            this.engineVolume = (int) 1.5;
//        } else {
//            this.engineVolume = engineVolume;
 //       }
 //       if (key == null) {
 //           this.key = new Key();
 //       } else {
 //           this.key = key;
//        }

//        this.type = "седан";
//        this.seats = 5;
//        this.gears = "автомат";
//        this.regNumber = "x000xx000";
//        this.sumTyres = true;

 //   }


//    public String getType() {
 //       return type;
//   }

//    public int getSeats() {
//        return seats;
 //   }

 //   public int getEngineVolume() {
 //       return engineVolume;
 //   }

//    public void setEngineVolume(int engineVolume) {
//        this.engineVolume = engineVolume;
//    }



 //   public String getGears() {
 //       return gears;
 //   }

 //   public void setGears(String gears) {
//        if (gears == null) {
 //       } else {

 //           this.gears = gears;
 //       }
//    }

 //   public String getRegNumber() {
 //       return regNumber;
 //   }

 //   public void setRegNumber(String regNumber) {
 //       if (regNumber == null) {
//            this.regNumber = "x000xx000";
 //       } else {
//            this.regNumber = regNumber;
 //       }

//    }

 //   public boolean isSumTyres() {
//        return sumTyres;
 //   }

//    public void setSumTyres(boolean sumTyres) {
//        this.sumTyres = sumTyres;
//    }

//    public void info() {
//        System.out.println(brand + model + ", " + year + " год выпуска, сборка в " + country + ", цвет кузова - " + color + ", объем двигателя - " + engineVolume + "тип кузова" + type + " количество мест" + seats + "безключевой доступ" + key + "страховка" + insurance +".");

 //   }

//   public void changeTyres() {
 //       sumTyres = !sumTyres;
 //   }

 //   public boolean correctNumber() {
 //       if (regNumber.length() != 9) {
//            return false;
 //       }
//        char[] chars = regNumber.toCharArray();
 //       if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
  //          return false;
  //      }
 //       if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
 //           return false;
 //       }
//        return true;
//    }

//    public static class Key {
//        private final boolean remoteRunEngine;
//        private final boolean withoutKey;

 //       public Key(boolean remoteRunEngine, boolean withoutKey) {
 //           this.remoteRunEngine = remoteRunEngine;
 //           this.withoutKey = withoutKey;
 //       }

 //       public Key() {
 //           this(false, false);
//        }

 //       public boolean isRemoteRunEngine() {
 //          return remoteRunEngine;
  //      }

 //       public boolean isWithoutKey() {
 //           return withoutKey;
 //       }

 //   }

//    public static class Insurance {
//        private final LocalDate expireDate;
//        private final double cost;
//        private final String number;


//        public Insurance(LocalDate expireDate, double cost, String number) {
//            if (expireDate == null) {
//                this.expireDate = LocalDate.now().plusDays(365);
//            } else {
 //               this.expireDate = expireDate;
//            }
//            this.cost = cost;
//            if (number == null) {
//                this.number = "1234556789";
//            } else {
//                this.number = number;
//            }
 //       }

 //       public LocalDate getExpireDate() {
 //           return expireDate;
//        }

//        public double getCost() {
 //           return cost;
 //       }

 //       public String getNumber() {
 //           return number;

 //       }


 //   public void checkExpireDate(){
 //       if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())){
 //           System.out.println("нужно срочно ехать оформлять новую страховку");
 //       }

//        }
//        public void checkNumber(){
//            if (number.length() != 9){
//                System.out.println("Номер старховки некорректный");
//            }
//        }
//    }
//}

