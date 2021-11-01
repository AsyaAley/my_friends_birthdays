import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainBody {

    private static final Map<String, Command> COMMANDS = new LinkedHashMap<>() {{
        put("1", new AddBirthdayCommand());
        put("2", new GreetCommand());
        put("3", new GreetWithWishesCommand());
        put("4", new ExitCommand());
    }};

    public static void main(String[] args) {
        var birthdayContainer = new BirthdayContainer();
        birthdayContainer.addBirthday(new Birthdate("Ася", "11/11/1987"));
        birthdayContainer.addBirthday(new Birthdate("Лена", "01/07/1970"));
        System.out.println("Это программа для записи дней рождения ваших друзей.");
        try (Scanner input = new Scanner(System.in)) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (var command : COMMANDS.values()) {
                min = Math.min(min, command.getCommandCode());
                max = Math.max(max, command.getCommandCode());
                System.out.println(command.getDescription());
            }

            while (true) {
                System.out.printf("Ведите номер желаемой операции от %s до %s:%n", min, max);
                var command = COMMANDS.get(input.nextLine());
                if (command != null) {
                    command.execute(birthdayContainer, input);
                }
            }
        }
    }
}
