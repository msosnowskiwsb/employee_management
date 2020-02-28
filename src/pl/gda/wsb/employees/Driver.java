package pl.gda.wsb.employees;

public class Driver extends Employee {
    public Driver(boolean logged, String name, String position) {
        super(logged, name, position);
    }

    @Override
    public String getPosition() {
        return "kierowca";
    }

    @Override
    public String toString() {
        return logged + " - " + name + " - kierowca";
    }
}
