package pl.gda.wsb.employees;

import java.util.Date;

public class EmployeesDemo {

    public static void main(String[] args) {

        System.out.println("\nDzień dobry!\n");

        for (String name: args) {
            System.out.println("Witaj, " + name + "!");
        }

        System.out.println("\nAktualna data: " + new Date());
    }
}

