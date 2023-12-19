package view;

import presenter.Presenter;
import java.util.Scanner;
import model.human.Gender;

public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    boolean flag;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        flag=true;
    }


    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        while(flag) {
            System.out.println("Введите команду");
            System.out.println("1. Добавить человека");
            System.out.println("2. Показать список людей");
            System.out.println("3. Отсортировать по дате рождения");
            System.out.println("4. Выйти из приложения");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    AddHuman();
                    break;
                case "2":
                    presenter.outputTree();
                    break;
                case "3":
                    presenter.sortByBirnTree();
                    break;
                case "4":
                    finish();
                    break;
            }
        }
    }



    public void AddHuman() {
        System.out.println("Укажите имя");
        String name = scanner.nextLine();
        System.out.println("Укажите пол: 1 - мужской, 2 - женский");
        Enum gender=Gender.male;
        String choiceGender = scanner.nextLine();
        if (choiceGender.equals("2")){gender=Gender.female;}
        System.out.println(gender);
        System.out.println("Введите год рождения или 0 - если год неизвестен");
        int birn = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите год смерти или 0 - если год неизвестен");
        int die = Integer.parseInt(scanner.nextLine());
        presenter.addHuman(name,gender,birn,die);
    }

    public void finish() {flag=false;
    }

}
