import java.util.Scanner;

public class GreetCommand implements Command {
    @Override
    public void execute(BirthdayContainer birthdayContainer, Scanner in) {
        System.out.println("Введите имя");
        String name = in.nextLine();
        var bds = birthdayContainer.getBirthdaysByName(name);
        if (bds != null) {
            for (var bd : bds) {
                bd.congrat();
            }
        } else {
            System.out.println("Такого человека нет в списке");
        }
    }

    @Override
    public int getCommandCode() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "2. Просто поздравить";
    }
}
