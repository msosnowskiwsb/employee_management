package pl.gda.wsb.employees;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataBase{

    private final String fileName;

    public DataBase() {
        this.fileName = System.getProperty("user.dir") + "\\utils\\db.txeeeeeeet";
    }

    public String getFileName() {
        return fileName;
    }

    protected void saveToFile(ArrayList<Employee> employeesListToSave) throws IOException {
        try {
            FileWriter fw = new FileWriter(fileName, false);
            for (Employee employee : employeesListToSave) {
                fw.write(employee.toString() + "\n");
           }
            fw.close();
        } catch (IOException e) {
            System.out.println("Błąd zapisu pliku!");
        }
    }

    protected Scanner getFileScanner() throws Exception{
        File file = new File(fileName);
        Scanner fileScanner;
      //  try {
            fileScanner = new Scanner(file);
      /*  } catch (FileNotFoundException e) {
            System.out.println("Błąd pobrania pliku z listą pracowników!");
            return null;
        }*/
        return fileScanner;
    }

    protected String getOperatorName(){
        return "Mateusz";
    }
}
