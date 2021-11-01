import java.util.Scanner;

public class GreetWithWishesCommand implements Command {
    @Override
    public void execute(BirthdayContainer birthdayContainer, Scanner in) {
        System.out.println("Введите имя");
        String name = in.nextLine();
        System.out.println("Введите ваши пожелания");
        String wishes = in.nextLine();
        var bds = birthdayContainer.getBirthdaysByName(name);
        if (bds != null) {
            for (var bd : bds) {
                bd.congrat(wishes);
            }
        } else {
            System.out.println("Такого человека нет в списке");
        }
    }

    @Override
    public int getCommandCode() {
        return 3;
    }

    @Override
    public String getDescription() {
        return "3. Поздравить и пожелать";
    }
}
