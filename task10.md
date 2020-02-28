# employee_management
Laboratorium - programowanie w JAVA

### Zadanie nr 10

Z klasy Employee zróbmy klasę abstrakcyjną, a w niej abstrakcyjną metodę getPosition(). Pole position z tej klasy jest teraz do usunięcia.

Utworzmy nowe klasy Director, Seller oraz Driver, ktore dziedziczą po klasie Employee i nadpisują powyższą metodę. Zauważ, że trzeba zdefiniować własny konstruktor w tych klasach.

W metodzie getEmployees() klasy EmployeeRepository należy utworzyć teraz odpowiedni obiekt na podstawie odczytanego z pliku stanowiska pracownika.

Polimorfizm: klasy takie jak EmployeePrinter i EmployeeRepository operują w dalszym ciągu na obiektach klasy Employee

Wniosek: klasy Director, Seller, Driver mogą teraz posiadać odrębne pola i metody, niezależnie od klasy nadrzędnej Employee.
