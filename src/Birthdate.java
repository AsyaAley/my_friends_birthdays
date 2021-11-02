import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Birthdate {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //Поля
    private final String personName;
    private final LocalDate personDate;

    //Конструктор с параметрами
    public Birthdate(String name, String date) {
        this.personName = name;
        this.personDate = LocalDate.parse(date, FORMATTER);
    }

    //Методы
    //Простое поздравление
    public void congrat() {
        System.out.println(getPersonName() + ", поздравляю с днём рождения!");
    }

    //Поздравление с пожеланиями
    public void congrat(String wishes) {
        System.out.println(getPersonName() + ", поздравляю с днём рождения!");
        System.out.println("Желаю тебе " + wishes + "!");
    }

    //Геттеры и сеттеры для полей
    public String getPersonName() {
        return personName;
    }

    public LocalDate getPersonDate() {
        return personDate;
    }
}
