package pl.gda.wsb.employees;

public class Director extends Employee {

    public Director(boolean logged, String name, String position) {
        super(logged, name, position);
    }

    @Override
    public String getPosition() {
        return "dyrektor";
    }

    @Override
    public String toString() {
        return logged + " - " + name + " - dyrektor";
    }
}
