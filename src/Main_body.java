import java.util.ArrayList;
import java.util.Scanner;

public class Main_body {

    public static void main(String[] args) {
        ArrayList<Birthdate> myDates = new ArrayList<>();
        myDates.add(new Birthdate("Ася", "11/11/1987"));
        myDates.add(new Birthdate("Лена", "01/07/1970"));
        System.out.println("Это программа для записи дней рождения ваших друзей.");
        Scanner input = new Scanner(System.in);
        System.out.println("1. Записать новую дату");
        System.out.println("2. Просто поздравить");
        System.out.println("3. Поздравить и пожелать");
        System.out.println("4. Закончить работу");
        int user_choice = 0;
        do {System.out.println("Ведите номер желаемой операции от 1 до 4:");
            user_choice = input.nextInt();
            switch (user_choice){
            case 1:
                input = new Scanner(System.in);
                System.out.println ("Введите имя");
                String personName = input.nextLine();
                input = new Scanner(System.in);
                System.out.println ("Введите дату в формате dd/MM/yyyy");
                String inputDate = input.nextLine();
                Birthdate person = new Birthdate(personName,inputDate);
                myDates.add(person);
                break;
            case 2:
                input = new Scanner(System.in);
                System.out.println ("Введите имя");
                String name = input.nextLine();
                int i = 0;
                for (Birthdate friend: myDates) {
                    if (friend.getPersonName().equals(name)) {
                        friend.congrat();
                        i++;
                    }
                }
                if (i==0){
                System.out.println ("Такого человека нет в списке");
            }break;
            case 3:
                input = new Scanner(System.in);
                System.out.println ("Введите имя");
                name = input.nextLine();
                input = new Scanner(System.in);
                System.out.println ("Введите ваши пожелания");
                String wishes = input.nextLine();
                i = 0;
                for (Birthdate friend: myDates) {
                    if (friend.getPersonName().equals(name)) {
                        friend.congrat(wishes);
                        i++;
                    }

                }
                if (i==0){
                System.out.println ("Такого человека нет в списке");
            }break;
        }

    }while (user_choice !=4);
        System.out.println("До новых встреч");
        System.exit(0);}
}
