package pl.gda.wsb.employees;

import java.util.Date;

public class EmployeesDemo {

    static String companyName = "Logintegra Sp. z o. o.";

    public static void main(String[] args) {

        String operatorName = args[0];
        int employeesCounter = 14;

        System.out.println(companyName);
        System.out.print("Dzień dobry, ");
        System.out.println(operatorName);
        System.out.println("Aktualna data: " + new Date());
        System.out.println("Liczba pracowników: " + employeesCounter);

        for (int i=0; i<args.length; i++){
            System.out.println("Argument [" + i + "]: " + args[i]);
        }

    }

}


