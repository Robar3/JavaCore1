package lesson3;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        guessingGame(9, 3);
    }

    static void guessingGame(int beforeNumber, int userTry) {
        System.out.println("Вас приветствует игра - угадай число");
        int exit = 1;
        int countTry = userTry;
        Scanner scanner = new Scanner(System.in);
        while (exit == 1) {
            System.out.printf("Мы загадали число, вам надо отгдадать его за %d попытки(ок)\nВведите число.",countTry);
            int answer = (int) (Math.random() * beforeNumber);
            System.out.println(answer);

            for (int i = 1; i <=countTry ; i++) {
                int userAnswer = scanner.nextInt();
                if (userAnswer == answer) {
                    System.out.println("Поздравляем вы угадали!!!\n" +
                            "Повторить игру?\n Если да нажмите 1, если нет нажмите 0.");
                    exit = scanner.nextInt();
                    break;
                } else if (userAnswer < answer) {
                    System.out.println("Вы ошиблись, загаданное число больше вашего.");
                    System.out.printf("У вас осталось %d попытки(ок).", countTry-i);

                } else if (userAnswer > answer) {
                    System.out.println("Вы ошиблись, загаданное число меньше вашего.");
                    System.out.printf("У вас осталось %d попытки(ок).", countTry-i);
                }


                if (i >= countTry) {
                    System.out.println("\nВаши попытки кончились. К сожалению вы не угадали число\n" +
                            "Загаданное число - "+answer+"\nПовторить игру? \nЕсли да нажмите 1, если нет нажмите 0.");
                    exit = scanner.nextInt();
                    break;
                }
            }
        }

    }
}
