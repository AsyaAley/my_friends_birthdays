import java.util.Scanner;

public class ExitCommand implements Command {
    @Override
    public void execute(BirthdayContainer birthdayContainer, Scanner in) {
        System.out.println("До новых встреч");
        System.exit(0);
    }

    @Override
    public int getCommandCode() {
        return 4;
    }

    @Override
    public String getDescription() {
        return "4. Закончить работу";
    }
}
