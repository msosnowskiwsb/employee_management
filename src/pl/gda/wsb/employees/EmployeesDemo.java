package pl.gda.wsb.employees;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeesDemo {

    public static String companyName = "Logintegra Sp. z o.o.";
    static String fileName = System.getProperty("user.dir") + "\\utils\\db.txt";

    static ArrayList<Employee> employees = new ArrayList<>();
    static ArrayList<Employee> loggedEmployees = new ArrayList<>();
    private static DataBase dataBase;
    private static EmployeeRepository  employeeRepository;

    public static void main(String[] args) {
        dataBase = new DataBase();
         employeeRepository = new EmployeeRepository();

        Scanner fileScanner = dataBase.getFileScanner();
        if (fileScanner == null) return;

        Pattern pattern = Pattern.compile("^(true|false) - (.+) - (.+)$");
        while (fileScanner.hasNextLine()) {
            String line_from_file = fileScanner.nextLine();
            Matcher matcher = pattern.matcher(line_from_file);
            if (matcher.matches()) {

                boolean status = Boolean.parseBoolean(matcher.group(1));
                String employeeName = matcher.group(2);
                String position = matcher.group(3);
                createEmployee(status, employeeName, position);
            }
        }
        fileScanner.close();

        EmployeePrinter.printWelcomeText();

        EmployeePrinter.printEmployees();

        EmployeePrinter.printLoggedEmployees();

        employeeRepository.readEmployeeNameAndChangeStatus(employeeRepository.getEmployees());
    }

    private static void createEmployee(boolean status, String employeeName, String position) {
        Employee employee = new Employee(status, employeeName, position) {
            @Override
            public String getPosition() {
                return position;
            }
        };
        employeeRepository.getEmployees().add(employee);
        if (status) {
            employeeRepository.getEmployees(true).add(employee);
        }
    }

}