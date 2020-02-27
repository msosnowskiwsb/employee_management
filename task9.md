# employee_management
Laboratorium - programowanie w JAVA

### Zadanie nr 9

Utworzmy nową klasę Employee, ktora posiadać będzie prywatne pola:
- boolean logged
- String name
- String position

Dodajmy w niej konstruktor, który ustawi wartości w powyższych polach.
Dodajmy ponadto metody typu "getter" dla wszystkich pol oraz metodę typu "setter“ dla pola logged.

Nadpiszmy także metodę toString(), ktora jest domyślnie używana do prezentowania obiektu w formie napisu, np. w metodzie System.out.println().

Użyjmy klasy Employee do przechowania pracownika (zamiast typu String). Zmiany miejsc użycia klasy Employee musimy zrobić w klasie EmployeePrinter, EmployeesDemo, EmployeeRepository oraz DataBase (String -> Object).

Zwroćmy uwagę na zmiany w wyrażeniach regularnych – czytanie z pliku i szukanie.
