package pl.gda.wsb.employees;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeRepository {

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
        return onlyLogged ? EmployeesDemo.loggedEmployees : EmployeesDemo.employees;
    }

    protected ArrayList<String> getEmployees(){
        return EmployeesDemo.employees;
    }
}


/*
Utworzmy nową klasę EmployeeRepository i
przenieśmy do niej metody getEmployees()
oraz readEmployeeNameAndChangeStatus().


Dodajmy do niej pole dataBase typu DataBase (metody nie mogą już być static).

Do klasy EmployeeDemo dodajemy statyczne pole employeeRepository typu EmployeeRepository i tworzymy obiekt tej klasy w metodzie main(). Używamy nowego obiektu w miejscu wywoływania usuniętych metod.

 */