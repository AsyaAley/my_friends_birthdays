import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Birthdate {
    //Поля
    private String personName;
    private Date personDate;
    //Конструктор по умолчанию
    public Birthdate(){
        personName = "Имя";
        personDate = new Date();
    }
    //Конструктор с параметрами
    public Birthdate(String name, String date){
        personName = name;
        Date formDate = null;
        try {
            formDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (
                ParseException e) {
            e.printStackTrace();
        }
        personDate = formDate;
    }
    //Методы
    //Простое поздравление
    public void congrat(){
        System.out.println(getPersonName() + ", поздравляю с днём рождения!");
    }
    //Поздравление с пожеланиями
    public void congrat(String wishes){
        System.out.println(getPersonName() + ", поздравляю с днём рождения!");
        System.out.println("Желаю тебе " + wishes +"!");
    }


    //Геттеры и сеттеры для полей
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Date getPersonDate() {
        return personDate;
    }

    public void setPersonDate(Date personDate) {
        this.personDate = personDate;
    }
}
