import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AddBirthdayCommand implements Command {

    @Override
    public void execute(BirthdayContainer birthdayContainer, Scanner in) {
        System.out.println("Введите имя");
        String personName = in.nextLine();
        System.out.println("Введите дату в формате dd/MM/yyyy");
        String inputDate = in.nextLine();
        try {
            Birthdate person = new Birthdate(personName, inputDate);
            birthdayContainer.addBirthday(person);
        } catch (DateTimeParseException e) {
            System.out.println("Не могу добавить дату - формат неверный.");
        }
    }

    @Override
    public int getCommandCode() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "1. Записать новую дату";
    }
}
