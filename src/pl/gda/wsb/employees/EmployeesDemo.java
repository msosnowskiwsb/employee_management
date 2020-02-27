package pl.gda.wsb.employees;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static pl.gda.wsb.employees.EmployeePrinter.*;

public class EmployeesDemo {

    public static void main(String[] args) {
        final String companyName = "Logintegra Sp. z o. o.";
        DataBase dataBase = new DataBase();
        EmployeeRepository employeeRepository = new EmployeeRepository();

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

        printWelcomeText(companyName, dataBase.getOperatorName());

        printEmployees(employeeRepository.getEmployees());

        printLoggedEmployees(employeeRepository.getEmployees(true));

        employeeRepository.readEmployeeNameAndChangeStatus(employeeRepository.getEmployees());
    }

}