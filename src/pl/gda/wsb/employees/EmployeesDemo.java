package pl.gda.wsb.employees;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static pl.gda.wsb.employees.EmployeePrinter.*;

public class EmployeesDemo {

    public static void main(String[] args) throws Exception {
        final String companyName = "Logintegra Sp. z o. o.";
        EmployeeRepository employeeRepository = new EmployeeRepository();

        Scanner fileScanner = employeeRepository.getDataBase().getFileScanner();
        if (fileScanner == null) return;

        Pattern pattern = Pattern.compile("^(true|false) - (.+) - (.+)$");
        while (fileScanner.hasNextLine()) {
            String line_from_file = fileScanner.nextLine();
            Matcher matcher = pattern.matcher(line_from_file);
            if (matcher.matches()) {

                boolean status = Boolean.parseBoolean(matcher.group(1));
                String employeeName = matcher.group(2);
                String position = matcher.group(3);

                switch (position) {
                    case "dyrektor": {
                        Employee employee = new Director(status, employeeName, position);
                        employeeRepository.getEmployees().add(employee);
                        if (status) {
                            employeeRepository.getEmployees(true).add(employee);
                        }
                        break;
                    }
                    case "handlowiec": {
                        Employee employee = new Seller(status, employeeName, position);
                        employeeRepository.getEmployees().add(employee);
                        if (status) {
                            employeeRepository.getEmployees(true).add(employee);
                        }
                        break;
                    }
                    case "kierowca": {
                        Employee employee = new Driver(status, employeeName, position);
                        employeeRepository.getEmployees().add(employee);
                        if (status) {
                            employeeRepository.getEmployees(true).add(employee);
                        }
                        break;
                    }
                }
            }
        }
        fileScanner.close();

        printWelcomeText(companyName, employeeRepository.getDataBase().getOperatorName());

        printEmployees(employeeRepository.getEmployees());

        printLoggedEmployees(employeeRepository.getEmployees(true));

        employeeRepository.readEmployeeNameAndChangeStatus(employeeRepository.getEmployees());
    }

}