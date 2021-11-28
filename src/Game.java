import java.util.Random;
import java.util.Scanner;

public class Game {

    private static final char DOT_X = 'X';
    private static int stepCounter = 0;
    private static final char DOT_O = 'O';
    private static final char DEFAULT = '_';
    private static final Random rnd = new Random();

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер поля");
        int size = in.nextInt();
        char[][] tab = new char[size][size];
        initTable(tab);

        boolean isInGame = true;
        while (isInGame) {
            System.out.println("Введите номер строки и номер столбца для хода");
            print(tab);
            int x = in.nextInt(), y = in.nextInt();
            x--;
            y--;
            if (isValidStep(x, y, tab)) {
                tab[x][y] = DOT_X;
                if (isWin(DOT_X, DOT_O, tab)) {
                    print(tab);
                    System.out.println("Вы победили");
                    return;
                }
                stepCounter++;
                if (stepCounter == size * size) {
                    print(tab);
                    System.out.println("Ничья");
                    return;
                }
                movePC(tab);
                System.out.println("Ход противника");
                for (int i = 0; i < 7; i++) {
                    System.out.print(" * ");
                    Thread.sleep(500);
                }
                System.out.println();
                if (isWin(DOT_O, DOT_X, tab)) {
                    print(tab);
                    System.out.println("Вы проиграли");
                    return;
                }
            }
        }
    }


    private static boolean isWin(char win, char lose, char[][] tab) {
        int winLine = tab.length / 2 + 2;

        for (int i = 0; i < tab.length; i++) {
            int sx = 0, sy = 0, d1 = 0, d2 = 0;
            for (int j = 0; j < tab.length; j++) {
                sx += tab[i][j] == win ? 1 : 0;
                sy += tab[j][i] == win ? 1 : 0;
                d1 += tab[j][j] == win ? 1 : 0;
                d2 += tab[j][tab.length - j - 1] == win ? 1 : 0;
                if (sx > 1 && tab[i][j] == lose) sx = 0;
                if (sy > 1 && tab[j][i] == lose) sy = 0;
                if (d1 > 1 && tab[j][j] == lose) d1 = 0;
                if (d2 > 1 && tab[j][tab.length - j - 1] == lose) d2 = 0;
                if (sx == winLine || sy == winLine || d1 == winLine
                        || d2 == winLine) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void movePC(char[][] tab) {
        while (true) {
            if (isValidStep(tab.length / 2, tab[0].length / 2, tab) && stepCounter == 1) {
                tab[tab.length / 2][tab[0].length / 2] = DOT_O;
                stepCounter++;
                return;
            }
            if (isValidStep(0, 0, tab) && stepCounter == 1) {
                tab[0][0] = DOT_O;
                stepCounter++;
                return;
            }


            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
                    char[][] iiArray = new char[tab.length][tab[0].length];
                    for (int k = 0; k < tab.length; k++) {
                        for (int l = 0; l < tab.length; l++) {
                            iiArray[k][l] = tab[k][l];
                        }
                    }

                    if (isValidStep(i, j, iiArray)) {
                        iiArray[i][j] = DOT_O;
                        if (isWin(DOT_O, DOT_X, iiArray)) {
                            tab[i][j] = DOT_O;
                            stepCounter++;
                            return;
                        }
                        iiArray[i][j] = DOT_X;
                        if (isWin(DOT_X, DOT_O, iiArray)) {
                            tab[i][j] = DOT_O;
                            stepCounter++;
                            return;
                        }
                    }
                }
            }

            int x = rnd.nextInt(tab.length), y = rnd.nextInt(tab.length);
            if (isValidStep(x, y, tab)) {
                tab[x][y] = DOT_O;
                stepCounter++;
                return;
            }
        }
    }

    private static boolean isValidStep(int x, int y, char[][] tab) {
        int size = tab.length;
        if (x >= 0 && x < size && y >= 0 && y < size) {
            return tab[x][y] == DEFAULT;
        }
        return false;
    }


    private static void print(char[][] tab) {
        System.out.print("   ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tab.length; j++) {
                System.out.print("|" + tab[i][j]);
            }
            System.out.println("|");
        }
    }

    private static void initTable(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = DEFAULT;
            }
        }
    }
}