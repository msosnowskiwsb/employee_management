package pl.gda.wsb.employees;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {

    protected String fileName = System.getProperty("user.dir") + "\\utils\\db.txt";

    protected void saveToFile(ArrayList<String> employeesListToSave) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName, false);
            for (String employee : employeesListToSave) {
                fw.write(employee + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Błąd zapisu pliku!");
        }
    }

    protected Scanner getFileScanner() {
        File file = new File(fileName);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Błąd pobrania pliku z listą pracowników!");
            return null;
        }
        return fileScanner;
    }

    protected String getOperatorName(){
        return "Mateusz";
    }
}


/*
Utworzmy nową klasę DataBase i przenieśmy do niej metody getOperatorName(), getFileScanner() oraz saveToFile(). Dodajmy do niej pole fileName typu String (metody nie mogą już być static).

Do klasy EmployeeDemo dodajemy statyczne pole dataBase typu DataBase I tworzymy obiekt tej klasy w metodzie main(). Używamy nowego obiektu w miejscu wywoływania usuniętych metod.


 */