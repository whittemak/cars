package transport;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    private  String name;
    private String lastname;
    private String company;
    private TransportType type;

    public Mechanic(String name, String lastname, String company, TransportType type) {
        this.name = name;
        this.lastname = lastname;
        this.company = company;
        this.type= type;
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

    public void setName(String name) {
        this.name = name;
    }

    public TransportType getType() {
        return type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void carryOutMaintenance() {
        System.out.println(getName() + " из компании " + getCompany() + " проводит техосмотр");

    }
    public void fixTheCar() {
        System.out.println(getName() + " из компании " + getCompany() + " ремонитрует авто");

    }


    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", company='" + company + '\'' +
                ", type=" + type +
                '}';
    }
}
