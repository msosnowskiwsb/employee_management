package pl.gda.wsb.employees;

public class Seller extends Employee{

    public Seller(boolean logged, String name, String position) {
        super(logged, name, position);
    }

    @Override
    public String getPosition() {
        return "handlowiec";
    }

    @Override
    public String toString() {
        return logged + " - " + name + " - handlowiec";
    }
}
