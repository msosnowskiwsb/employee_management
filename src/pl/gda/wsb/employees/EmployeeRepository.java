package pl.gda.wsb.employees;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeRepository {

     private ArrayList<Employee> employees;
     private ArrayList<Employee> loggedEmployees;

    public EmployeeRepository() {
        this.employees = new ArrayList<>();
        this.loggedEmployees = new ArrayList<>();
    }

    private DataBase dataBase = new DataBase();

    public DataBase getDataBase() {
        return dataBase;
    }

    protected void readEmployeeNameAndChangeStatus(ArrayList<Employee> employeeList) throws IOException, WrongEmployee {
        System.out.println("\nPodaj imię i nazwisko (exit = koniec): ");
        Scanner inScanner = new Scanner(System.in);
        while (inScanner.hasNextLine()) {
            String employeeNameFromUser = inScanner.nextLine();
            if (employeeNameFromUser.equals("exit")) {

                dataBase.saveToFile(employeeList);
                break;
            }

            int i = 0;
            boolean searched = false;
            Pattern patternSearch = Pattern.compile("^(true|false) - " + employeeNameFromUser + " - (.+)$");

            for (Employee employee : employeeList) {
                Matcher matcher = patternSearch.matcher(employee.toString());
                if (matcher.matches()) {
                    searched = true;
                    boolean isLogged = Boolean.parseBoolean(matcher.group(1));
                    employeeList.get(i).setLogged(!isLogged);
                    break;
                }
                i++;
            }

            if (searched) {
                System.out.println("Zmieniono status dla pracownika: " + employeeNameFromUser);
            } else {
                throw new WrongEmployee();
            }
        }
    }

    protected ArrayList<Employee> getEmployees(Boolean onlyLogged){
        return onlyLogged ? loggedEmployees : employees;
    }

    protected ArrayList<Employee> getEmployees(){
        return employees;
    }
}