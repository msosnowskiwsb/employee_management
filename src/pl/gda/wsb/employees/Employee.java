package pl.gda.wsb.employees;

public abstract class Employee {
    boolean logged;
    String name;

    public Employee(boolean logged, String name, String position) {
        this.logged = logged;
        this.name = name;
    }

    public boolean isLogged() {
        return logged;
    }

    public String getName() {
        return name;
    }

    public abstract String getPosition();

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    @Override
    public String toString() {
        return logged + " - " + name + " - " + getPosition();
    }
}
