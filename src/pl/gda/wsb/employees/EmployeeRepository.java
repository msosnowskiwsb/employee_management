package pl.gda.wsb.employees;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeRepository {

     static ArrayList<String> employees = new ArrayList<>();
     static ArrayList<String> loggedEmployees = new ArrayList<>();

    DataBase dataBase = new DataBase();

    protected void readEmployeeNameAndChangeStatus(ArrayList<String> employeeList) {
        System.out.println("\nPodaj imię i nazwisko (exit = koniec): ");
        Scanner inScanner = new Scanner(System.in);
        while (inScanner.hasNextLine()) {
            String text = inScanner.nextLine();
            if (text.equals("exit")) {

                dataBase.saveToFile(employeeList);
                break;
            }

            int i = 0;
            boolean searched = false;
            Pattern patternSearch = Pattern.compile("^(true|false) - " + text + " - (.+)$");

            for (String employee : employeeList) {
                Matcher matcher = patternSearch.matcher(employee);
                if (matcher.matches()) {
                    searched = true;
                    boolean isLogged = Boolean.parseBoolean(matcher.group(1));
                    employeeList.remove(i);
                    employeeList.add(i, employee.replace(matcher.group(1), isLogged ? "false" : "true"));
                    break;
                }
                i++;
            }

            if (searched) {
                System.out.println("Zmieniono status dla pracownika: " + text);
            } else {
                System.out.println("Błędnie podane imię i nazwisko!");
            }
        }
    }

    protected ArrayList<String> getEmployees(Boolean onlyLogged){
        return onlyLogged ? loggedEmployees : employees;
    }

    protected ArrayList<String> getEmployees(){
        return employees;
    }
}