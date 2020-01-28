package pl.gda.wsb.employees;

import java.util.Date;

public class EmployeesDemo {

    public static void main(String args[]) {
        System.out.print("Dzień dobry, ");
        System.out.println(args[0]); // wymaga podania parametru Program arguments w Run Configuration
        System.out.println("Aktualna data: " + new Date());
    }
}

