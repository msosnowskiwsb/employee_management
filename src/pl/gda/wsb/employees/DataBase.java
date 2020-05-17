package pl.gda.wsb.employees;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {

    protected void saveToFile(ArrayList<Employee> employeesListToSave) {
        try {
            FileWriter fw = new FileWriter(EmployeesDemo.fileName, false);
            for (Employee employee : employeesListToSave) {
                fw.write(employee.toString() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Błąd zapisu pliku!");
        }
    }

    protected Scanner getFileScanner() {
        File file = new File(EmployeesDemo.fileName);
        Scanner fileScanner;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Błąd pobrania pliku z listą pracowników!");
            return null;
        }
        return fileScanner;
    }

    static String getOperatorName(){
        return "Mateusz";
    }
}
