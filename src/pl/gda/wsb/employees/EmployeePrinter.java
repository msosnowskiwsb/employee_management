package pl.gda.wsb.employees;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EmployeePrinter {

     static void printLoggedEmployees(ArrayList<Employee> loggedEmployees) {
        if (loggedEmployees.size() > 0) {
            System.out.println("\nZalogowani pracownicy (" + loggedEmployees.size() + "):");

            int i = 0;
            for (Employee employee : loggedEmployees) {
                if (i++ == 5) {
                    System.out.println("...");
                    break;
                }
                System.out.println(employee.toString());
            }
        }
    }

     static void printEmployees(ArrayList<Employee> allEmployees) {
        if (allEmployees.size() == 0) {
            System.out.println("Brak pracowników");
        } else {
            System.out.println("Liczba pracowników: " + allEmployees.size());
        }

        if (allEmployees.size() > 0) {
            System.out.println("\nLista pracowników (" + allEmployees.size() + "):");

            int i = 0;
            for (Employee employee : allEmployees) {
                if (i++ == 5) {
                    System.out.println("...");
                    break;
                }
                System.out.println(employee.toString());
            }
        }
    }

     static void printWelcomeText(String companyName, String operatorName) {
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yy HH:mm");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(companyName).append("\n")
                .append("Dzień dobry, ")
                .append(operatorName).append("\n")
                .append("Aktualna data: ")
                .append(ft.format(new Date()));
        System.out.println(stringBuilder);
    }
}
