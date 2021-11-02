import java.util.Scanner;

public interface Command {

    void execute(BirthdayContainer birthdayContainer, Scanner in);

    int getCommandCode();

    String getDescription();


}
