package pl.gda.wsb.employees;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

public class EmployeePrinter {

    static EmployeeRepository employeeRepository = new EmployeeRepository();

    static void printLoggedEmployees() {
        if (employeeRepository.getEmployees(true).size() > 0) {
            System.out.println("\nZalogowani pracownicy (" + employeeRepository.getEmployees(true).size() + "):");

            Collections.sort(employeeRepository.getEmployees(true));
            int i = 0;
            for (String employee : employeeRepository.getEmployees(true)) {
                if (i++ == 5) {
                    System.out.println("...");
                    break;
                }
                System.out.println(employee);
            }
        }
    }

    static void printEmployees() {
        if (employeeRepository.getEmployees().size() == 0) {
            System.out.println("Brak pracowników");
        } else {
            System.out.println("Liczba pracowników: " + employeeRepository.getEmployees().size());
        }

        if (employeeRepository.getEmployees().size() > 0) {
            System.out.println("\nLista pracowników (" + employeeRepository.getEmployees().size() + "):");

            int i = 0;
            for (String employee : employeeRepository.getEmployees()) {
                if (i++ == 5) {
                    System.out.println("...");
                    break;
                }
                System.out.println(employee);
            }
        }
    }

    static void printWelcomeText(String companyName, String operaorName) {
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yy HH:mm");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(companyName).append("\n")
                .append("Dzień dobry, ")
                .append(operaorName).append("\n")
                .append("Aktualna data: ")
                .append(ft.format(new Date()));
        System.out.println(stringBuilder);
    }
}
