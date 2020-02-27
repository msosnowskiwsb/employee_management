# employee_management
Laboratorium - programowanie w JAVA

### Zadanie nr 7

Utworzmy nową klasę DataBase i przenieśmy do niej metody getOperatorName(), getFileScanner() oraz saveToFile(). Dodajmy do niej pole fileName typu String (metody nie mogą już być static).

Do klasy EmployeeDemo dodajemy statyczne pole dataBase typu DataBase I tworzymy obiekt tej klasy w metodzie main(). Używamy nowego obiektu w miejscu wywoływania usuniętych metod.

Utworzmy nową klasę EmployeeRepository i przenieśmy do niej metody getEmployees() oraz readEmployeeNameAndChangeStatus(). Dodajmy do niej pole dataBase typu DataBase (metody nie mogą już być static).

Do klasy EmployeeDemo dodajemy statyczne pole employeeRepository typu EmployeeRepository i tworzymy obiekt tej klasy w metodzie main(). Używamy nowego obiektu w miejscu wywoływania usuniętych metod.

Utworzmy nową klasę EmployeePrinter i przenieśmy do niej metody printWelcomeText(), printEmployees() oraz printLoggedEmployees().

Metody w tej klasie mogą być statyczne - nie potrzebują stanu obiektu. Do metody printWelcomeText() dodajmy parametry String companyName oraz String operatorName.

Używamy powyższych metod w metodzie main() klasy EmployeeDemo.

Na koniec możemy nowo dodane pola do klasy EmployeeDemo zamienić na zmienne lokalne.
