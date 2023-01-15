package transport;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    private  String name;
    private String lastname;
    private String company;

    public Mechanic(String name, String lastname, String company) {
        this.name = name;
        this.lastname = lastname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public void carryOutMaintenance() {

    }
    public void fixTheCar() {

    }
    List<Mechanic> mechanics = new ArrayList<>();


}
