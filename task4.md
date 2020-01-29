# employee_management
Laboratorium - programowanie w JAVA

### Zadanie nr 4

Dla zmiennej employeesCounter użyjmy klasy typu obiektowego (wrappera) na wypadek, gdy będzie problem z pobraniem liczby pracowników i zmienna przyjmnie wartość null to należy wyświetlić odpowiedni komunikat z błędem.

Do metody main klasy EmployeesDemo dodajmy zmienną lokalną "loggedEmployees" typu obiektowego ArrayList<String>.
Lista ta pozwoli zastąpić pętle for pętlą for-each oraz przybliżyć nas to pobrania prawdziwej listy pracowników.

W tym celu do powyższej listy dodać należy tyle wpisów o dowolnej treści "Imię Nazwisko - stanowisko", ile wynosiła liczba zalogowanych pracowników.
Zmienna lokalna loggedEmployeesCounter jest zatem do usunięcia, gdyż możemy pobrać rozmiar listy zalogowanych pracowników przy pomocy metody size() z klasy ArrayList.

Obecnie nagłówek programu z nazwą firmy, nazwą użytkownika oraz datą, tworzą nadmiarowe obiekty klasy String. Należy przekształcić go tak, aby używał klasę StringBuilder.
