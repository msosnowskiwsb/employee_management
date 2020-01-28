package pl.gda.wsb.employees;

import java.util.Date;

public class EmployeesDemo {

    static String companyName = "Logintegra Sp. z o. o.";

    public static void main(String[] args) {

        String operatorName = "Rafał";
        int employeesCounter = 14;
        int loggedEmployeesCounter = 6;

        System.out.println(companyName);
        System.out.print("Dzień dobry, ");
        System.out.println(operatorName);
        System.out.println("Aktualna data: " + new Date());

        if (employeesCounter == 0) {
            System.out.println("Brak pracowników");
        } else {
            System.out.println("Liczba pracowników: " + employeesCounter);
        }

        if (loggedEmployeesCounter > 0) {
            System.out.println("\nZalogowani pracownicy:");
            for (int i = 0; i < loggedEmployeesCounter; i++) {
                if (i == 5) {
                    System.out.println("...");
                    break;
                }

                System.out.println("Jan Kowalski - kierownik");
            }
        }

    }

}