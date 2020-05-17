# employee_management
Laboratorium - programowanie w JAVA

### Zadanie nr 11

Do tej pory wyjątki nie były obsługiwane w aplikacji EmployeeDemo. Były przekazywane dalej za pomocą instrukcji throws. Oznacza to, że jeżeli dowolny wyjątek by wystąpił to aplikacja przestałaby działać.

Przetestujmy działanie aplikacji w sytuacji, gdy podany będzie zły adres pliku.

Z metody main() klasy EmployeesDemo usuńmy instrukcję throws i obsłużmy wyjątki
(try/catch) w naszej aplikacji.

Dodajmy ponadto klasę WrongEmployee, ktora dziedziczy po klasie Exception. Użyjemy jej do rzucania wyjątku w metodze readEmployeeNameAndChangeStatus(), gdy wpisane imię i nazwisko nie pasują do żadnego pracownika.

Wydzielmy zatem z metody readEmployeeNameAndChangeStatus() prywatną metodę searchEmployee, która przyjmować będzie listę wszystkich pracowników oraz tekst do wyszukania, a zwracać będzie wyszukanego pracownika. Gdy pracownik nie będzie znaleziony niech metoda rzuca wyjątek WrongEmployee.
