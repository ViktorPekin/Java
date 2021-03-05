package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final int SIZE = 8;
    static  int WINNER;

    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';

    static final char HEADER_FIRST_SYMBOL = '♥';
    static final String EMPTY = " ";

    static final char[][] MAP = new char[SIZE][SIZE];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();
    static int turnsCount;

    static int row;
    static int column;


    public static void main(String[] args) {
        turnGame();
    }

    public static void turnGame() {
        winnerNumber();
        //инициализация поля
        initMap();

        //печать поля в консоль
        printMap();

        //игра
        playGame();

    }

    private static void winnerNumber() {
        if (SIZE <= 5) {
            WINNER = 3;
        } else if (SIZE > 5 && SIZE <= 9) {
            WINNER = 4;
        } else {
            WINNER = 5;
        }
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        //печать заголовка
        printHeaderMap();

        //печать поля
        printBodyMap();
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + EMPTY);

        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();

    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);

    }

    private static void printBodyMap() {

        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + EMPTY);
            }
            System.out.println();
        }
    }


    private static void playGame() {

        turnsCount = 0;
        while (true) {
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);


            turnAI();
            printMap();
            checkEnd(DOT_AI);
        }
    }

    private static void humanTurn() {
        int rowNumber;
        int columnNumber;
        boolean isInputValid = true;


        System.out.println("\nХод человека! Введите номера строки и столбца");
        do {
            rowNumber = -1;
            columnNumber = -1;
            isInputValid = true;

            System.out.print("Строка: ");
            if (in.hasNextInt()) {
                rowNumber = in.nextInt() - 1;
                row = rowNumber;
            } else {
                processingIncorrectInput();
                isInputValid = false;
                continue;
            }

            System.out.print("Столбик: ");
            if (in.hasNextInt()) {
                columnNumber = in.nextInt() - 1;
                column = columnNumber;
            } else {
                processingIncorrectInput();
                isInputValid = false;
            }

        } while (!(isInputValid && isHumanTurnValid(rowNumber, columnNumber)));

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static void processingIncorrectInput() {
        System.out.println("Ошибка ввода! Введите число в диапазоне размера игрового поля");
        in.nextLine();
    }

    private static boolean isHumanTurnValid(int rowNumber, int columnNumber) {
        if (!isNumbersValid(rowNumber, columnNumber)) {
            System.out.println("\nПроверьте значения строки и столбца");
            return false;
        } else if (!isCellOccupancy(rowNumber, columnNumber)) {
            System.out.println("\nВы выбрали занятую ячейку");
            return false;
        }

        return true;
    }

    private static boolean isNumbersValid(int rowNumber, int columnNumber) {
        return !(rowNumber >= SIZE || rowNumber < 0 || columnNumber >= SIZE || columnNumber < 0);
    }

    private static boolean isCellOccupancy(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }


    private static void checkEnd(char symbol) {

        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("Ура! Вы победили!");
            } else {
                System.out.println("Восстание близко... ИИ победил...");
            }
            System.exit(0);
        } else if (isMapFull()) {
            System.out.println("Ничья!");
            System.exit(0);
        }
    }

    private static boolean isMapFull() {
        return turnsCount == SIZE * SIZE;
    }

    private static boolean checkWin(char symbol) {
        return checkRow(symbol) ||
                checkColumn(symbol) ||
                checkDiagonal(symbol) ||
                checkReversDiagonal(symbol);
    }

    private static boolean checkRow(char symbol) {
        int sizeWin = 0;
        for (int i = 0; i < SIZE; i++) {
            if (sizeWin == WINNER) {
                return true;
            } else {
                if (MAP[i][column] == symbol) {
                    sizeWin++;
                } else {
                    sizeWin = 0;
                }
            }
        }
        return sizeWin == WINNER;
    }

    private static boolean checkColumn(char symbol) {
        int sizeWin = 0;
        for (int i = 0; i < SIZE; i++) {
            if (sizeWin == WINNER) {
                return true;
            } else {
                if (MAP[row][i] == symbol) {
                    sizeWin++;
                } else {
                    sizeWin = 0;
                }
            }
        }
        return sizeWin == WINNER;
    }

    private static boolean checkDiagonal(char symbol) {
        int sizeWin = 0;
        for (int i = 0; i < SIZE; i++) {
            if (sizeWin == WINNER) {
                return true;
            } else {
                if (column > row) {
                    if (i < SIZE - (column - row)) {
                        if (MAP[i][i + (column - row)] == symbol) {
                            sizeWin++;
                        } else {
                            sizeWin = 0;
                        }
                    }
                } else {
                    if (i < SIZE - (row - column)) {
                        if (MAP[i + (row - column)][i] == symbol) {
                            sizeWin++;
                        } else {
                            sizeWin = 0;
                        }
                    }
                }
            }
        }
        return sizeWin == WINNER;
    }

    private static boolean checkReversDiagonal(char symbol) {
        int sizeWin = 0;
        for (int i = 0; i < SIZE; i++) {
            if (sizeWin == WINNER) {
                return true;
            } else {
                if (SIZE <= (row + column + 1)) {
                    if (i < SIZE - Math.abs(SIZE - (row + column + 1))) {
                        if (MAP[i + Math.abs(SIZE - (row + column + 1))][SIZE - 1 - i] == symbol) {
                            sizeWin++;
                        } else {
                            sizeWin = 0;
                        }
                    }
                } else if (SIZE > (row + column + 1)) {
                    if (i < SIZE - Math.abs(SIZE - (row + column + 1))) {
                        if (MAP[i][SIZE - 1 - i - (SIZE - (row + column + 1))] == symbol) {
                            sizeWin++;
                        } else {
                            sizeWin = 0;
                        }
                    }
                }
            }
        }
        return sizeWin == WINNER;
    }

    private static void turnAI() {
        int rowNumber;
        int columnNumber;

        System.out.println("\nХод компьютера!");

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isCellOccupancy(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }
}
