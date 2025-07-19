package Ex1;

import java.util.Scanner;

interface GridLayout {
    void insertAtRow(int rowNumber, int[] values);
    void insertAtColumn(int columnNumber, int[] values);
    void clearAtRow(int rowNumber);
    void clearAtColumn(int columnNumber);
    void updateCell(int rowNumber, int columnNumber, int value);
    void displayGrid();
    void clear();
}

class GridManagement implements GridLayout {
    final int ROWS = 7;
    final int COLUMN = 7;
    private int[][] grid = new int[ROWS][COLUMN];

    @Override
    public void insertAtRow(int rowNumber, int[] values) {
        if (rowNumber < 0 || rowNumber >= 7 || values.length != 7) {
            System.out.println("Invalid row or values length!");
            return;
        }
        grid[rowNumber] = values.clone();
    }

    @Override
    public void insertAtColumn(int columnNumber, int[] values) {
        if (columnNumber < 0 || columnNumber >= 7 || values.length != 7) {
            System.out.println("Invalid column or values length!");
            return;
        }
        for (int i = 0; i < 7; i++) {
            grid[i][columnNumber] = values[i];
        }
    }

    @Override
    public void clearAtRow(int rowNumber) {
        if (rowNumber < 0 || rowNumber >= 7)
            return;
        for (int i = 0; i < 7; i++) {
            grid[rowNumber][i] = 0;
        }
    }

    @Override
    public void clearAtColumn(int columnNumber) {
        if (columnNumber < 0 || columnNumber >= 7)
            return;
        for (int i = 0; i < 7; i++) {
            grid[i][columnNumber] = 0;
        }
    }

    @Override
    public void updateCell(int rowNumber, int columnNumber, int value) {
        if (rowNumber < 0 || rowNumber >= 7 || columnNumber < 0 || columnNumber >= 7 || value < 0 || value > 9) {
            System.out.println("Invalid input!");
            return;
        }
        grid[rowNumber][columnNumber] = value;
    }

    @Override
    public void displayGrid() {
        System.out.println(":::: The GRID ::::\n");
        System.out.print("    ");
        for (int i = 0; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("    ");
        for (int i = 0; i < 7; i++) {
            System.out.print("- ");
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.print(i + " - ");
            for (int j = 0; j < 7; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                grid[i][j] = 0;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GridManagement gm = new GridManagement();
        int option;

        do {
            gm.displayGrid();
            System.out.println("\n1. Update a single cell");
            System.out.println("2. Insert at a row");
            System.out.println("3. Insert at a column");
            System.out.println("4. Clear at a row");
            System.out.println("5. Clear at a column");
            System.out.println("6. Clear all");
            System.out.println("7. Quit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            int row, column, value;
            int[] values;

            switch (option) {
                case 1:
                    System.out.print("Enter row (0-6): ");
                    row = scanner.nextInt();
                    System.out.print("Enter column (0-6): ");
                    column = scanner.nextInt();
                    System.out.print("Enter value (0-9): ");
                    value = scanner.nextInt();
                    gm.updateCell(row, column, value);
                    break;

                case 2:
                    System.out.print("Enter row number (0-6): ");
                    row = scanner.nextInt();
                    values = new int[7];
                    System.out.print("Enter 7 values (0-9), (Separate by space): ");
                    for (int i = 0; i < 7; i++) {
                        values[i] = scanner.nextInt();
                    }
                    gm.insertAtRow(row, values);
                    break;

                case 3:
                    System.out.print("Enter column number (0-6): ");
                    column = scanner.nextInt();
                    values = new int[7];
                    System.out.print("Enter 7 values (0-9), (Separate by space): ");
                    for (int i = 0; i < 7; i++) {
                        values[i] = scanner.nextInt();
                    }
                    gm.insertAtColumn(column, values);
                    break;

                case 4:
                    System.out.print("Enter row number (0-6): ");
                    row = scanner.nextInt();
                    gm.clearAtRow(row);
                    break;

                case 5:
                    System.out.print("Enter column number (0-6): ");
                    column = scanner.nextInt();
                    gm.clearAtColumn(column);
                    break;

                case 6:
                    gm.clear();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        } while (option != 7);

        scanner.close();
    }
}