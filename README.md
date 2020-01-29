# employee_management
Laboratorium - programowanie w JAVA

### Zadanie nr 5

W metodzie main klasy EmployeesDemo wykorzystajmy klasę SimpleDateFormat do wyświetlenia daty w czytelniejszym formacie.

Używając klasy Scanner oraz wyrażenia regularnego pobierzmy osobno listę wszystkich oraz listę zalogowanych pracowników z załączonego do zadania pliku db.txt i przechowajmy je odpowiednio w zmiennych lokalnych typu obiektowego ArrayList o nazwie "employees" oraz już istniejącej "loggedEmployees".
O zalogowaniu pracownika decyduje wartość "true" (przed imieniem i nazwiskiem) w pliku db.txt.

Zwróćmy uwagę na to, że trzeba obsłużyć wyjątek w sytuacji, gdy program nie będzie mógł odczytać pliku z listą pracowników.

Następnie, za pomocą klasy Scanner, pobierajmy w pętli imię i nazwisko pracownika, które użytkownik wpisuje z klawiatury.
Jeżeli podany pracownik został poprawnie wyszukany za pomocą wyrażenia regularnego w zmiennej "employees" to należy zmienić mu status zalogowania (negacja).

Pętla/program kończy działanie, gdy użytkownik wpisze "exit". W tym momencie powinien także nastąpić zapis do pliku db.txt listy pracowników z aktualnymi statusami zalogowania.
