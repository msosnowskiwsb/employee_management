package pl.gda.wsb.employees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class EmployeesDemo {

    static String companyName = "Logintegra Sp. z o. o.";

    public static void main(String args[]) {

        String operatorName = "Mateusz";
        Integer employeesCounter = 14;

        ArrayList<String> loggedEmployees = new ArrayList<>();
        loggedEmployees.add("Jan Kowalski - kierownik");
        loggedEmployees.add("Maria Ostrowska - dyrektor");
        loggedEmployees.add("Anna Wolska - dyrektor");
        loggedEmployees.add("Tomasz Jaworski - kierowca");
        loggedEmployees.add("Roman Tadowski - sprzedawca");
        loggedEmployees.add("Joanna Rafalska - sekretarka");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(companyName).append("\n")
                .append("Dzień dobry, ")
                .append(operatorName).append("\n")
                .append("Aktualna data: ")
                .append(new Date());
        System.out.println(stringBuilder);

        if (employeesCounter == null) {
            System.out.println("Błąd pobrania liczby pracowników!");
        } else if (employeesCounter == 0) {
            System.out.println("Brak pracowników");
        } else {
            System.out.println("Liczba pracowników: " + employeesCounter);
        }

        if (loggedEmployees.size() > 0) {
            System.out.println("\nZalogowani pracownicy:");

            Collections.sort(loggedEmployees);
            int i = 0;
            for (String employee : loggedEmployees) {
                if (i++ == 5) {
                    System.out.println("...");
                    break;
                }

                System.out.println(employee);
            }

        }

    }

}