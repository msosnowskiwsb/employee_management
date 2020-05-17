package pl.gda.wsb.employees;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class EmployeePrinter {

     static void printLoggedEmployees() {
        if (EmployeeRepository.getEmployees(true).size() > 0) {
            System.out.println("\nZalogowani pracownicy (" + EmployeeRepository.getEmployees(true).size() + "):");

            EmployeeRepository.getEmployees(true).sort(Comparator.comparing(Employee::getPosition));
            int i = 0;
            for (Employee employee : EmployeeRepository.getEmployees(true)) {
                if (i++ == 5) {
                    System.out.println("...");
                    break;
                }
                System.out.println(employee.toString());
            }
        }
    }

     static void printEmployees() {
        if (EmployeeRepository.getEmployees().size() == 0) {
            System.out.println("Brak pracowników");
        } else {
            System.out.println("Liczba pracowników: " + EmployeeRepository.getEmployees().size());
        }

         EmployeeRepository.getEmployees().sort(Comparator.comparing(Employee::getPosition));

        if (EmployeeRepository.getEmployees().size() > 0) {
            System.out.println("\nLista pracowników (" + EmployeeRepository.getEmployees().size() + "):");
            for (int i=0; i < EmployeeRepository.getEmployees().size(); i++) {
                if (i == 5) {
                    System.out.println("...");
                    break;
                }
                System.out.println(EmployeeRepository.getEmployees().get(i));
            }
        }
    }

     static void printWelcomeText() {
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yy HH:mm");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(EmployeesDemo.companyName).append("\n")
                .append("Dzień dobry, ")
                .append(DataBase.getOperatorName()).append("\n")
                .append("Aktualna data: ")
                .append(ft.format(new Date()));
        System.out.println(stringBuilder);
    }
}
