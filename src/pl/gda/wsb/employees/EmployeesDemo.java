package pl.gda.wsb.employees;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeesDemo {

    static String companyName = "Logintegra Sp. z o. o.";
    static ArrayList<String> employees = new ArrayList<>();
    static ArrayList<String> loggedEmployees = new ArrayList<>();
    private static DataBase dataBase                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ;
    private static EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        dataBase = new DataBase();
        employeeRepository = new EmployeeRepository();

        Scanner fileScanner = dataBase.getFileScanner();
        if (fileScanner == null) return;

        Pattern pattern = Pattern.compile("^(true|false) - (.+)$");
        while (fileScanner.hasNextLine()) {
            String employee = fileScanner.nextLine();
            Matcher matcher = pattern.matcher(employee);
            if (matcher.matches()) {
                employeeRepository.getEmployees().add(employee);
                if (Boolean.parseBoolean(matcher.group(1))) {
                    employeeRepository.getEmployees(true).add(matcher.group(2));
                }
            }
        }
        fileScanner.close();

        printWelcomeText();

        printEmployees();

        printLoggedEmployees();

        employeeRepository.readEmployeeNameAndChangeStatus(employeeRepository.getEmployees());
    }

    private static void printLoggedEmployees() {
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

    private static void printEmployees() {
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

    private static void printWelcomeText() {
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yy HH:mm");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(companyName).append("\n")
                .append("Dzień dobry, ")
                .append(dataBase.getOperatorName()).append("\n")
                .append("Aktualna data: ")
                .append(ft.format(new Date()));
        System.out.println(stringBuilder);
    }

}