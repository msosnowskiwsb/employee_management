package pl.gda.wsb.employees;

import java.util.Date;

public class EmployeesDemo {


    public static void main(String[] args) {

        for (int i=0; i<args.length; i++){
            System.out.println("Argument [" + i + "]: " + args[i]);
        }

        System.out.println("\nDzień dobry!");
        System.out.println("Aktualna data: " + new Date());

    }
}

