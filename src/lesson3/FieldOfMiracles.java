package lesson3;

import java.util.Random;
import java.util.Scanner;

public class FieldOfMiracles {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        fieldOfMiracles(words);
    }

    static void outputArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static void fieldOfMiracles(String[] words) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветсвует игра - поле чудес" +
                "\nПредлогаем вам угадать слово из представленных ниже.");
        outputArray(words);
        int random = rnd.nextInt(words.length);
        String answer = words[random];

        while (true) {
            System.out.println("Введите загаданное слово.");
            char[] intermediateArray = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'};
            String userAnswer = scanner.nextLine();
            if (answer.equals(userAnswer)) {
                System.out.println("Вы угадали");
                break;
            }
            for (int i = 0; i <answer.length()&&i<userAnswer.length(); i++) {
                if (userAnswer.charAt(i) == answer.charAt(i)) {
                    intermediateArray[i] = userAnswer.charAt(i);
                }
            }
            String writeLetters = new String(intermediateArray);
            System.out.println("Вы ошиблись.\nБуквы угаданные вами "+writeLetters);

        }
    }
}