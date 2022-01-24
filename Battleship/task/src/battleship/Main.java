package battleship;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    String[][] battleship;
    String[][] battleship2;
    String[][] hiddenBattleship;
    String[][] hiddenBattleship2;

    ArrayList<String> aircraftCoordinates = new ArrayList<>();
    ArrayList<String> battleshipCoordinates = new ArrayList<>();
    ArrayList<String> submarineCoordinates = new ArrayList<>();
    ArrayList<String> cruiserCoordinates = new ArrayList<>();
    ArrayList<String> destroyerCoordinates = new ArrayList<>();
    ArrayList<String> coordinatesList;

    ArrayList<String> aircraftCoordinates2 = new ArrayList<>();
    ArrayList<String> battleshipCoordinates2 = new ArrayList<>();
    ArrayList<String> submarineCoordinates2 = new ArrayList<>();
    ArrayList<String> cruiserCoordinates2 = new ArrayList<>();
    ArrayList<String> destroyerCoordinates2 = new ArrayList<>();
    ArrayList<String> coordinatesList2;

    public void createBattleship() {
        this.battleship = new String[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0) {
                    switch (j) {
                        case 0:
                            this.battleship[i][j] = " ";
                            break;
                        case 1:
                            this.battleship[i][j] = "1";
                            break;
                        case 2:
                            this.battleship[i][j] = "2";
                            break;
                        case 3:
                            this.battleship[i][j] = "3";
                            break;
                        case 4:
                            this.battleship[i][j] = "4";
                            break;
                        case 5:
                            this.battleship[i][j] = "5";
                            break;
                        case 6:
                            this.battleship[i][j] = "6";
                            break;
                        case 7:
                            this.battleship[i][j] = "7";
                            break;
                        case 8:
                            this.battleship[i][j] = "8";
                            break;
                        case 9:
                            this.battleship[i][j] = "9";
                            break;
                        case 10:
                            this.battleship[i][j] = "10";
                            break;
                    }
                } else {
                    if (j == 0) {
                        switch (i) {
                            case 1:
                                this.battleship[i][j] = "A";
                                break;
                            case 2:
                                this.battleship[i][j] = "B";
                                break;
                            case 3:
                                this.battleship[i][j] = "C";
                                break;
                            case 4:
                                this.battleship[i][j] = "D";
                                break;
                            case 5:
                                this.battleship[i][j] = "E";
                                break;
                            case 6:
                                this.battleship[i][j] = "F";
                                break;
                            case 7:
                                this.battleship[i][j] = "G";
                                break;
                            case 8:
                                this.battleship[i][j] = "H";
                                break;
                            case 9:
                                this.battleship[i][j] = "I";
                                break;
                            case 10:
                                this.battleship[i][j] = "J";
                                break;
                        }
                    } else {
                        this.battleship[i][j] = "~";
                    }
                }
            }
        }
    }

    public void createBattleship2() {
        this.battleship2 = new String[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0) {
                    switch (j) {
                        case 0:
                            this.battleship2[i][j] = " ";
                            break;
                        case 1:
                            this.battleship2[i][j] = "1";
                            break;
                        case 2:
                            this.battleship2[i][j] = "2";
                            break;
                        case 3:
                            this.battleship2[i][j] = "3";
                            break;
                        case 4:
                            this.battleship2[i][j] = "4";
                            break;
                        case 5:
                            this.battleship2[i][j] = "5";
                            break;
                        case 6:
                            this.battleship2[i][j] = "6";
                            break;
                        case 7:
                            this.battleship2[i][j] = "7";
                            break;
                        case 8:
                            this.battleship2[i][j] = "8";
                            break;
                        case 9:
                            this.battleship2[i][j] = "9";
                            break;
                        case 10:
                            this.battleship2[i][j] = "10";
                            break;
                    }
                } else {
                    if (j == 0) {
                        switch (i) {
                            case 1:
                                this.battleship2[i][j] = "A";
                                break;
                            case 2:
                                this.battleship2[i][j] = "B";
                                break;
                            case 3:
                                this.battleship2[i][j] = "C";
                                break;
                            case 4:
                                this.battleship2[i][j] = "D";
                                break;
                            case 5:
                                this.battleship2[i][j] = "E";
                                break;
                            case 6:
                                this.battleship2[i][j] = "F";
                                break;
                            case 7:
                                this.battleship2[i][j] = "G";
                                break;
                            case 8:
                                this.battleship2[i][j] = "H";
                                break;
                            case 9:
                                this.battleship2[i][j] = "I";
                                break;
                            case 10:
                                this.battleship2[i][j] = "J";
                                break;
                        }
                    } else {
                        this.battleship2[i][j] = "~";
                    }
                }
            }
        }
    }

    public void createHiddenBattleship() {
        this.hiddenBattleship = new String[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0) {
                    switch (j) {
                        case 0:
                            this.hiddenBattleship[i][j] = " ";
                            break;
                        case 1:
                            this.hiddenBattleship[i][j] = "1";
                            break;
                        case 2:
                            this.hiddenBattleship[i][j] = "2";
                            break;
                        case 3:
                            this.hiddenBattleship[i][j] = "3";
                            break;
                        case 4:
                            this.hiddenBattleship[i][j] = "4";
                            break;
                        case 5:
                            this.hiddenBattleship[i][j] = "5";
                            break;
                        case 6:
                            this.hiddenBattleship[i][j] = "6";
                            break;
                        case 7:
                            this.hiddenBattleship[i][j] = "7";
                            break;
                        case 8:
                            this.hiddenBattleship[i][j] = "8";
                            break;
                        case 9:
                            this.hiddenBattleship[i][j] = "9";
                            break;
                        case 10:
                            this.hiddenBattleship[i][j] = "10";
                            break;
                    }
                } else {
                    if (j == 0) {
                        switch (i) {
                            case 1:
                                this.hiddenBattleship[i][j] = "A";
                                break;
                            case 2:
                                this.hiddenBattleship[i][j] = "B";
                                break;
                            case 3:
                                this.hiddenBattleship[i][j] = "C";
                                break;
                            case 4:
                                this.hiddenBattleship[i][j] = "D";
                                break;
                            case 5:
                                this.hiddenBattleship[i][j] = "E";
                                break;
                            case 6:
                                this.hiddenBattleship[i][j] = "F";
                                break;
                            case 7:
                                this.hiddenBattleship[i][j] = "G";
                                break;
                            case 8:
                                this.hiddenBattleship[i][j] = "H";
                                break;
                            case 9:
                                this.hiddenBattleship[i][j] = "I";
                                break;
                            case 10:
                                this.hiddenBattleship[i][j] = "J";
                                break;
                        }
                    } else {
                        this.hiddenBattleship[i][j] = "~";
                    }
                }
            }
        }
    }

    public void createHiddenBattleship2() {
        this.hiddenBattleship2 = new String[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0) {
                    switch (j) {
                        case 0:
                            this.hiddenBattleship2[i][j] = " ";
                            break;
                        case 1:
                            this.hiddenBattleship2[i][j] = "1";
                            break;
                        case 2:
                            this.hiddenBattleship2[i][j] = "2";
                            break;
                        case 3:
                            this.hiddenBattleship2[i][j] = "3";
                            break;
                        case 4:
                            this.hiddenBattleship2[i][j] = "4";
                            break;
                        case 5:
                            this.hiddenBattleship2[i][j] = "5";
                            break;
                        case 6:
                            this.hiddenBattleship2[i][j] = "6";
                            break;
                        case 7:
                            this.hiddenBattleship2[i][j] = "7";
                            break;
                        case 8:
                            this.hiddenBattleship2[i][j] = "8";
                            break;
                        case 9:
                            this.hiddenBattleship2[i][j] = "9";
                            break;
                        case 10:
                            this.hiddenBattleship2[i][j] = "10";
                            break;
                    }
                } else {
                    if (j == 0) {
                        switch (i) {
                            case 1:
                                this.hiddenBattleship2[i][j] = "A";
                                break;
                            case 2:
                                this.hiddenBattleship2[i][j] = "B";
                                break;
                            case 3:
                                this.hiddenBattleship2[i][j] = "C";
                                break;
                            case 4:
                                this.hiddenBattleship2[i][j] = "D";
                                break;
                            case 5:
                                this.hiddenBattleship2[i][j] = "E";
                                break;
                            case 6:
                                this.hiddenBattleship2[i][j] = "F";
                                break;
                            case 7:
                                this.hiddenBattleship2[i][j] = "G";
                                break;
                            case 8:
                                this.hiddenBattleship2[i][j] = "H";
                                break;
                            case 9:
                                this.hiddenBattleship2[i][j] = "I";
                                break;
                            case 10:
                                this.hiddenBattleship2[i][j] = "J";
                                break;
                        }
                    } else {
                        this.hiddenBattleship2[i][j] = "~";
                    }
                }
            }
        }
    }

    public void displayBattleship() {
        for (int i = 0; i < 11; i++) {
            System.out.println();
            for (int j = 0; j < 11; j++) {
                System.out.print(this.battleship[i][j] + " ");
            }
        }
        System.out.println();
    }

    public void displayBattleship2() {
        for (int i = 0; i < 11; i++) {
            System.out.println();
            for (int j = 0; j < 11; j++) {
                System.out.print(this.battleship2[i][j] + " ");
            }
        }
        System.out.println();
    }

    public boolean isSunkenByP2() {
        int shipLength = 0;
        for (String coordinateString : this.aircraftCoordinates) {
            String[] coordinatePair = coordinateString.split(" ");
            if (Objects.equals(this.battleship[Integer.parseInt(coordinatePair[0])][Integer.parseInt(coordinatePair[1])], "X")) {
                shipLength++;
                if (shipLength == 5) {
                    this.aircraftCoordinates = new ArrayList<>();
                    return true;
                }
            }
        }
        shipLength = 0;
        for (String coordinateString : this.battleshipCoordinates) {
            String[] coordinatePair = coordinateString.split(" ");
            if (Objects.equals(this.battleship[Integer.parseInt(coordinatePair[0])][Integer.parseInt(coordinatePair[1])], "X")) {
                shipLength++;
                if (shipLength == 4) {
                    this.battleshipCoordinates = new ArrayList<>();
                    return true;
                }
            }
        }
        shipLength = 0;
        for (String coordinateString : this.submarineCoordinates) {
            String[] coordinatePair = coordinateString.split(" ");
            if (Objects.equals(this.battleship[Integer.parseInt(coordinatePair[0])][Integer.parseInt(coordinatePair[1])], "X")) {
                shipLength++;
                if (shipLength == 3) {
                    this.submarineCoordinates = new ArrayList<>();
                    return true;
                }
            }
        }
        shipLength = 0;
        for (String coordinateString : this.cruiserCoordinates) {
            String[] coordinatePair = coordinateString.split(" ");
            if (Objects.equals(this.battleship[Integer.parseInt(coordinatePair[0])][Integer.parseInt(coordinatePair[1])], "X")) {
                shipLength++;
                if (shipLength == 3) {
                    this.cruiserCoordinates = new ArrayList<>();
                    return true;
                }
            }
        }
        shipLength = 0;
        for (String coordinateString : this.destroyerCoordinates) {
            String[] coordinatePair = coordinateString.split(" ");
            if (Objects.equals(this.battleship[Integer.parseInt(coordinatePair[0])][Integer.parseInt(coordinatePair[1])], "X")) {
                shipLength++;
                if (shipLength == 2) {
                    this.destroyerCoordinates = new ArrayList<>();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSunkenByP1() {
        int shipLength = 0;
        for (String coordinateString : this.aircraftCoordinates2) {
            String[] coordinatePair = coordinateString.split(" ");
            if (Objects.equals(this.battleship2[Integer.parseInt(coordinatePair[0])][Integer.parseInt(coordinatePair[1])], "X")) {
                shipLength++;
                if (shipLength == 5) {
                    this.aircraftCoordinates2 = new ArrayList<>();
                    return true;
                }
            }
        }
        shipLength = 0;
        for (String coordinateString : this.battleshipCoordinates2) {
            String[] coordinatePair = coordinateString.split(" ");
            if (Objects.equals(this.battleship2[Integer.parseInt(coordinatePair[0])][Integer.parseInt(coordinatePair[1])], "X")) {
                shipLength++;
                if (shipLength == 4) {
                    this.battleshipCoordinates2 = new ArrayList<>();
                    return true;
                }
            }
        }
        shipLength = 0;
        for (String coordinateString : this.submarineCoordinates2) {
            String[] coordinatePair = coordinateString.split(" ");
            if (Objects.equals(this.battleship2[Integer.parseInt(coordinatePair[0])][Integer.parseInt(coordinatePair[1])], "X")) {
                shipLength++;
                if (shipLength == 3) {
                    this.submarineCoordinates2 = new ArrayList<>();
                    return true;
                }
            }
        }
        shipLength = 0;
        for (String coordinateString : this.cruiserCoordinates2) {
            String[] coordinatePair = coordinateString.split(" ");
            if (Objects.equals(this.battleship2[Integer.parseInt(coordinatePair[0])][Integer.parseInt(coordinatePair[1])], "X")) {
                shipLength++;
                if (shipLength == 3) {
                    this.cruiserCoordinates2 = new ArrayList<>();
                    return true;
                }
            }
        }
        shipLength = 0;
        for (String coordinateString : this.destroyerCoordinates2) {
            String[] coordinatePair = coordinateString.split(" ");
            if (Objects.equals(this.battleship2[Integer.parseInt(coordinatePair[0])][Integer.parseInt(coordinatePair[1])], "X")) {
                shipLength++;
                if (shipLength == 2) {
                    this.destroyerCoordinates2 = new ArrayList<>();
                    return true;
                }
            }
        }
        return false;
    }

    public void displayP1() {
        for (int i = 0; i < 11; i++) {
            System.out.println();
            for (int j = 0; j < 11; j++) {
                System.out.print(this.hiddenBattleship2[i][j] + " ");
            }
        }
        System.out.println();
        System.out.print("---------------------");
        for (int i = 0; i < 11; i++) {
            System.out.println();
            for (int j = 0; j < 11; j++) {
                System.out.print(this.battleship[i][j] + " ");
            }
        }
        System.out.println();
    }

    public void displayP2() {
        for (int i = 0; i < 11; i++) {
            System.out.println();
            for (int j = 0; j < 11; j++) {
                System.out.print(this.hiddenBattleship[i][j] + " ");
            }
        }
        System.out.println();
        System.out.print("---------------------");
        for (int i = 0; i < 11; i++) {
            System.out.println();
            for (int j = 0; j < 11; j++) {
                System.out.print(this.battleship2[i][j] + " ");
            }
        }
        System.out.println();
    }

    public void runGame() {
        createHiddenBattleship();
        createHiddenBattleship2();
        boolean isP1 = true;
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        String input;
        int shipsDestroyedByP1 = 0;
        int shipsDestroyedByP2 = 0;
        while (isRunning) {
            promptEnterKey();
            if (isP1) {
                displayP1();
                System.out.println();
                System.out.println("Player 1, it's your turn:");
                System.out.println();
                input = scanner.nextLine();
                int x = 0;
                String letter = input.substring(0, 1);
                switch (letter) {
                    case "A":
                        x = 1;
                        break;
                    case "B":
                        x = 2;
                        break;
                    case "C":
                        x = 3;
                        break;
                    case "D":
                        x = 4;
                        break;
                    case "E":
                        x = 5;
                        break;
                    case "F":
                        x = 6;
                        break;
                    case "G":
                        x = 7;
                        break;
                    case "H":
                        x = 8;
                        break;
                    case "I":
                        x = 9;
                        break;
                    case "J":
                        x = 10;
                        break;
                    default:
                        break;
                }
                int y = Integer.parseInt(input.substring(1));
                if (x == 0 || y < 1 || y > 10) {
                    System.out.println();
                    System.out.println("Error! You entered the wrong coordinates! Try again:");
                } else if (this.battleship2[x][y].equals("O")) {
                    this.battleship2[x][y] = "X";
                    System.out.println();
                    if (isSunkenByP1()) {
                        shipsDestroyedByP1++;
                        if (shipsDestroyedByP1 == 5) {
                            isRunning = false;
                            System.out.println("You sank the last ship. You won. Congratulations!");
                        } else {
                            System.out.println("You sank a ship!");
                            isP1 = false;
                        }
                    } else {
                        System.out.println("You hit a ship!");
                        isP1 = false;
                    }
                } else if (this.battleship2[x][y].equals("~")) {
                    this.battleship2[x][y] = "M";
                    System.out.println();
                    System.out.println("You missed!");
                    isP1 = false;
                } else if (this.battleship2[x][y].equals("M")) {
                    System.out.println();
                    System.out.println("You missed!");
                    isP1 = false;
                } else if (this.battleship2[x][y].equals("X")) {
                    System.out.println();
                    System.out.println("You hit a ship!");
                    isP1 = false;
                }
            } else {
                displayP2();
                System.out.println();
                System.out.println("Player 2, it's your turn:");
                System.out.println();
                input = scanner.nextLine();
                int x = 0;
                String letter = input.substring(0, 1);
                switch (letter) {
                    case "A":
                        x = 1;
                        break;
                    case "B":
                        x = 2;
                        break;
                    case "C":
                        x = 3;
                        break;
                    case "D":
                        x = 4;
                        break;
                    case "E":
                        x = 5;
                        break;
                    case "F":
                        x = 6;
                        break;
                    case "G":
                        x = 7;
                        break;
                    case "H":
                        x = 8;
                        break;
                    case "I":
                        x = 9;
                        break;
                    case "J":
                        x = 10;
                        break;
                    default:
                        break;
                }
                int y = Integer.parseInt(input.substring(1));
                if (x == 0 || y < 1 || y > 10) {
                    System.out.println();
                    System.out.println("Error! You entered the wrong coordinates! Try again:");
                } else if (this.battleship[x][y].equals("O")) {
                    this.battleship[x][y] = "X";
                    System.out.println();
                    if (isSunkenByP2()) {
                        shipsDestroyedByP2++;
                        if (shipsDestroyedByP2 == 5) {
                            isRunning = false;
                            System.out.println("You sank the last ship. You won. Congratulations!");
                        } else {
                            System.out.println("You sank a ship!");
                            isP1 = true;
                        }
                    } else {
                        System.out.println("You hit a ship!");
                        isP1 = true;
                    }
                } else if (this.battleship[x][y].equals("~")) {
                    this.battleship[x][y] = "M";
                    System.out.println();
                    System.out.println("You missed!");
                    isP1 = true;
                } else if (this.battleship[x][y].equals("M")) {
                    System.out.println();
                    System.out.println("You missed!");
                    isP1 = true;
                } else if (this.battleship[x][y].equals("X")) {
                    System.out.println();
                    System.out.println("You hit a ship!");
                    isP1 = true;
                }
            }
        }
    }

    public void addShips() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        String input;
        int count = 5;
        createBattleship();
        System.out.println("Player 1, place your ships on the game field");
        displayBattleship();
        this.coordinatesList = new ArrayList<>();
        System.out.println();
        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
        while (!isValid) {
            System.out.println();
            input = scanner.nextLine();
            isValid = isInputValid(input, count);
            if (isValid) {
                count--;
            }
        }
        isValid = false;
        displayBattleship();
        System.out.println();
        System.out.println("Enter the coordinates of the Battleship (4 cells):");
        while (!isValid) {
            System.out.println();
            input = scanner.nextLine();
            isValid = isInputValid(input, count);
            if (isValid) {
                count--;
            }
        }
        isValid = false;
        displayBattleship();
        System.out.println();
        System.out.println("Enter the coordinates of the Submarine (3 cells):");
        while (!isValid) {
            System.out.println();
            input = scanner.nextLine();
            isValid = isInputValid(input, count);
            if (isValid) {
                count--;
            }
        }
        isValid = false;
        displayBattleship();
        System.out.println();
        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
        while (!isValid) {
            System.out.println();
            input = scanner.nextLine();
            isValid = isInputValid(input, count);
            if (isValid) {
                count--;
            }
        }
        isValid = false;
        displayBattleship();
        System.out.println();
        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
        while (!isValid) {
            System.out.println();
            input = scanner.nextLine();
            isValid = isInputValid(input, count);
            if (isValid) {
                count--;
            }
        }
        isValid = false;
        displayBattleship();
        System.out.println();
        promptEnterKey();
        count = 5;
        createBattleship2();
        System.out.println("Player 2, place your ships to the game field");
        displayBattleship2();
        this.coordinatesList = new ArrayList<>();
        System.out.println();
        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
        while (!isValid) {
            System.out.println();
            input = scanner.nextLine();
            isValid = isInputValid2(input, count);
            if (isValid) {
                count--;
            }
        }
        isValid = false;
        displayBattleship2();
        System.out.println();
        System.out.println("Enter the coordinates of the Battleship (4 cells):");
        while (!isValid) {
            System.out.println();
            input = scanner.nextLine();
            isValid = isInputValid2(input, count);
            if (isValid) {
                count--;
            }
        }
        isValid = false;
        displayBattleship2();
        System.out.println();
        System.out.println("Enter the coordinates of the Submarine (3 cells):");
        while (!isValid) {
            System.out.println();
            input = scanner.nextLine();
            isValid = isInputValid2(input, count);
            if (isValid) {
                count--;
            }
        }
        isValid = false;
        displayBattleship2();
        System.out.println();
        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
        while (!isValid) {
            System.out.println();
            input = scanner.nextLine();
            isValid = isInputValid2(input, count);
            if (isValid) {
                count--;
            }
        }
        isValid = false;
        displayBattleship2();
        System.out.println();
        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
        while (!isValid) {
            System.out.println();
            input = scanner.nextLine();
            isValid = isInputValid2(input, count);
            if (isValid) {
                count--;
            }
        }
        displayBattleship2();
    }

    public boolean isInputValid(String input, int count) {
        this.coordinatesList = new ArrayList<>();
        String[] coordinates = input.split(" ");
        String[] coordinateOne = {letterConverter(coordinates[0].substring(0, 1)), coordinates[0].substring(1)};
        String[] coordinateTwo = {letterConverter(coordinates[1].substring(0, 1)), coordinates[1].substring(1)};
        if (Integer.parseInt(coordinateOne[0]) == Integer.parseInt(coordinateTwo[0])) {
            int max = Math.max(Integer.parseInt(coordinateOne[1]), Integer.parseInt(coordinateTwo[1]));
            int min = Math.min(Integer.parseInt(coordinateOne[1]), Integer.parseInt(coordinateTwo[1]));
            int length = max - min + 1;
            switch (count) {
                case 5:
                    if (length != 5) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Aircraft Carrier! Try again:\n");
                        return false;
                    }
                    break;
                case 4:
                    if (length != 4) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Battleship! Try again:\n");
                        return false;
                    }
                    break;
                case 3:
                    if (length != 3) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Submarine! Try again:\n");
                        return false;
                    }
                    break;
                case 2:
                    if (length != 3) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Cruiser! Try again:\n");
                        return false;
                    }
                    break;
                case 1:
                    if (length != 2) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Destroyer! Try again:\n");
                        return false;
                    }
            }
            for (int i = Integer.parseInt(coordinateOne[0]); i == Integer.parseInt(coordinateOne[0]); i++) {
                for (int j = min; j <= max; j++) {
                    try {
                        if (i == 10) {
                            if (j == 10) {
                                if (this.battleship[i][j - 1].equals("O") || this.battleship[i - 1][j - 1].equals("O") ||
                                        this.battleship[i - 1][j].equals("O")) {
                                    System.out.println();
                                    System.out.println("Error! You placed it too close to another one. Try again:");
                                    return false;
                                } else {
                                    String coordinatePair = i + " " + j;
                                    this.coordinatesList.add(coordinatePair);
                                }
                            } else if (this.battleship[i][j - 1].equals("O") || this.battleship[i - 1][j - 1].equals("O") ||
                                    this.battleship[i - 1][j].equals("O") || this.battleship[i - 1][j + 1].equals("O") ||
                                    this.battleship[i][j + 1].equals("O")) {
                                System.out.println();
                                System.out.println("Error! You placed it too close to another one. Try again:");
                                return false;
                            } else {
                                String coordinatePair = i + " " + j;
                                this.coordinatesList.add(coordinatePair);
                            }
                        } else if (i >= 1 && i <= 9) {
                            if (j == 10) {
                                if (this.battleship[i + 1][j].equals("O") || this.battleship[i + 1][j - 1].equals("O") ||
                                        this.battleship[i][j - 1].equals("O") || this.battleship[i - 1][j - 1].equals("O") ||
                                        this.battleship[i - 1][j].equals("O")) {
                                    System.out.println();
                                    System.out.println("Error! You placed it too close to another one. Try again:");
                                    return false;
                                } else {
                                    String coordinatePair = i + " " + j;
                                    this.coordinatesList.add(coordinatePair);
                                }
                            } else if (this.battleship[i + 1][j].equals("O") || this.battleship[i + 1][j - 1].equals("O") ||
                                    this.battleship[i][j - 1].equals("O") || this.battleship[i - 1][j - 1].equals("O") ||
                                    this.battleship[i - 1][j].equals("O") || this.battleship[i - 1][j + 1].equals("O") ||
                                    this.battleship[i][j + 1].equals("O")) {
                                System.out.println();
                                System.out.println("Error! You placed it too close to another one. Try again:");
                                return false;
                            } else {
                                String coordinatePair = i + " " + j;
                                this.coordinatesList.add(coordinatePair);
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException ignored) {

                    }
                }
            }
        } else if (Integer.parseInt(coordinateOne[1]) == Integer.parseInt(coordinateTwo[1])) {
            int max = Math.max(Integer.parseInt(coordinateOne[0]), Integer.parseInt(coordinateTwo[0]));
            int min = Math.min(Integer.parseInt(coordinateOne[0]), Integer.parseInt(coordinateTwo[0]));
            int length = max - min + 1;
            switch (count) {
                case 5:
                    if (length != 5) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Aircraft Carrier! Try again:\n");
                        return false;
                    }
                    break;
                case 4:
                    if (length != 4) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Battleship! Try again:\n");
                        return false;
                    }
                    break;
                case 3:
                    if (length != 3) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Submarine! Try again:\n");
                        return false;
                    }
                    break;
                case 2:
                    if (length != 3) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Cruiser! Try again:\n");
                        return false;
                    }
                    break;
                case 1:
                    if (length != 2) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Destroyer! Try again:\n");
                        return false;
                    }
            }
            for (int j = Integer.parseInt(coordinateOne[1]); j == Integer.parseInt(coordinateOne[1]); j++) {
                for (int i = min; i <= max; i++) {
                    try {
                        if (i == 10) {
                            if (j == 10) {
                                if (this.battleship[i][j - 1].equals("O") || this.battleship[i - 1][j - 1].equals("O") ||
                                        this.battleship[i - 1][j].equals("O") || this.battleship[i - 1][j + 1].equals("O") ||
                                        this.battleship[i][j + 1].equals("O")) {
                                    System.out.println();
                                    System.out.println("Error! You placed it too close to another one. Try again:");
                                    return false;
                                } else {
                                    String coordinatePair = i + " " + j;
                                    this.coordinatesList.add(coordinatePair);
                                }
                            } else if (this.battleship[i][j - 1].equals("O") || this.battleship[i - 1][j - 1].equals("O") ||
                                    this.battleship[i - 1][j].equals("O") || this.battleship[i - 1][j + 1].equals("O") ||
                                    this.battleship[i][j + 1].equals("O")) {
                                System.out.println();
                                System.out.println("Error! You placed it too close to another one. Try again:");
                                return false;
                            } else {
                                String coordinatePair = i + " " + j;
                                this.coordinatesList.add(coordinatePair);
                            }
                        } else if (i >= 1 && i <= 9) {
                            if (j == 10) {
                                if (this.battleship[i + 1][j].equals("O") || this.battleship[i + 1][j - 1].equals("O") ||
                                        this.battleship[i][j - 1].equals("O") || this.battleship[i - 1][j - 1].equals("O") ||
                                        this.battleship[i - 1][j].equals("O")) {
                                    System.out.println();
                                    System.out.println("Error! You placed it too close to another one. Try again:");
                                    return false;
                                } else {
                                    String coordinatePair = i + " " + j;
                                    this.coordinatesList.add(coordinatePair);
                                }
                            } else if (this.battleship[i + 1][j].equals("O") || this.battleship[i + 1][j - 1].equals("O") ||
                                    this.battleship[i][j - 1].equals("O") || this.battleship[i - 1][j - 1].equals("O") ||
                                    this.battleship[i - 1][j].equals("O") || this.battleship[i - 1][j + 1].equals("O") ||
                                    this.battleship[i][j + 1].equals("O")) {
                                System.out.println();
                                System.out.println("Error! You placed it too close to another one. Try again:");
                                return false;
                            } else {
                                String coordinatePair = i + " " + j;
                                this.coordinatesList.add(coordinatePair);
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException ignored) {

                    }
                }
            }
        } else {
            System.out.println();
            System.out.println("Error! Wrong ship location! Try again:");
            return false;
        }
        for (String coordinate : this.coordinatesList) {
            String[] coordinatePair = coordinate.split(" ");
            if (this.coordinatesList.size() == 5) {
                this.aircraftCoordinates.add(coordinate);
            } else if (this.coordinatesList.size() == 4) {
                this.battleshipCoordinates.add(coordinate);
            } else if (this.coordinatesList.size() == 3 && count == 3) {
                this.submarineCoordinates.add(coordinate);
            } else if (this.coordinatesList.size() == 3 && count == 2) {
                this.cruiserCoordinates.add(coordinate);
            } else if (this.coordinatesList.size() == 2 && count == 1) {
                this.destroyerCoordinates.add(coordinate);
            }
            this.battleship[Integer.parseInt(coordinatePair[0])][Integer.parseInt(coordinatePair[1])] = "O";
        }
        return true;
    }

    public boolean isInputValid2(String input, int count) {
        this.coordinatesList2 = new ArrayList<>();
        String[] coordinates = input.split(" ");
        String[] coordinateOne = {letterConverter(coordinates[0].substring(0, 1)), coordinates[0].substring(1)};
        String[] coordinateTwo = {letterConverter(coordinates[1].substring(0, 1)), coordinates[1].substring(1)};
        if (Integer.parseInt(coordinateOne[0]) == Integer.parseInt(coordinateTwo[0])) {
            int max = Math.max(Integer.parseInt(coordinateOne[1]), Integer.parseInt(coordinateTwo[1]));
            int min = Math.min(Integer.parseInt(coordinateOne[1]), Integer.parseInt(coordinateTwo[1]));
            int length = max - min + 1;
            switch (count) {
                case 5:
                    if (length != 5) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Aircraft Carrier! Try again:\n");
                        return false;
                    }
                    break;
                case 4:
                    if (length != 4) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Battleship! Try again:\n");
                        return false;
                    }
                    break;
                case 3:
                    if (length != 3) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Submarine! Try again:\n");
                        return false;
                    }
                    break;
                case 2:
                    if (length != 3) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Cruiser! Try again:\n");
                        return false;
                    }
                    break;
                case 1:
                    if (length != 2) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Destroyer! Try again:\n");
                        return false;
                    }
            }
            for (int i = Integer.parseInt(coordinateOne[0]); i == Integer.parseInt(coordinateOne[0]); i++) {
                for (int j = min; j <= max; j++) {
                    try {
                        if (i == 10) {
                            if (j == 10) {
                                if (this.battleship2[i][j - 1].equals("O") || this.battleship2[i - 1][j - 1].equals("O") ||
                                        this.battleship2[i - 1][j].equals("O")) {
                                    System.out.println();
                                    System.out.println("Error! You placed it too close to another one. Try again:");
                                    return false;
                                } else {
                                    String coordinatePair = i + " " + j;
                                    this.coordinatesList2.add(coordinatePair);
                                }
                            } else if (this.battleship2[i][j - 1].equals("O") || this.battleship2[i - 1][j - 1].equals("O") ||
                                    this.battleship2[i - 1][j].equals("O") || this.battleship2[i - 1][j + 1].equals("O") ||
                                    this.battleship2[i][j + 1].equals("O")) {
                                System.out.println();
                                System.out.println("Error! You placed it too close to another one. Try again:");
                                return false;
                            } else {
                                String coordinatePair = i + " " + j;
                                this.coordinatesList2.add(coordinatePair);
                            }
                        } else if (i >= 1 && i <= 9) {
                            if (j == 10) {
                                if (this.battleship2[i + 1][j].equals("O") || this.battleship2[i + 1][j - 1].equals("O") ||
                                        this.battleship2[i][j - 1].equals("O") || this.battleship2[i - 1][j - 1].equals("O") ||
                                        this.battleship2[i - 1][j].equals("O")) {
                                    System.out.println();
                                    System.out.println("Error! You placed it too close to another one. Try again:");
                                    return false;
                                } else {
                                    String coordinatePair = i + " " + j;
                                    this.coordinatesList2.add(coordinatePair);
                                }
                            } else if (this.battleship2[i + 1][j].equals("O") || this.battleship2[i + 1][j - 1].equals("O") ||
                                    this.battleship2[i][j - 1].equals("O") || this.battleship2[i - 1][j - 1].equals("O") ||
                                    this.battleship2[i - 1][j].equals("O") || this.battleship2[i - 1][j + 1].equals("O") ||
                                    this.battleship2[i][j + 1].equals("O")) {
                                System.out.println();
                                System.out.println("Error! You placed it too close to another one. Try again:");
                                return false;
                            } else {
                                String coordinatePair = i + " " + j;
                                this.coordinatesList2.add(coordinatePair);
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException ignored) {

                    }
                }
            }
        } else if (Integer.parseInt(coordinateOne[1]) == Integer.parseInt(coordinateTwo[1])) {
            int max = Math.max(Integer.parseInt(coordinateOne[0]), Integer.parseInt(coordinateTwo[0]));
            int min = Math.min(Integer.parseInt(coordinateOne[0]), Integer.parseInt(coordinateTwo[0]));
            int length = max - min + 1;
            switch (count) {
                case 5:
                    if (length != 5) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Aircraft Carrier! Try again:\n");
                        return false;
                    }
                    break;
                case 4:
                    if (length != 4) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Battleship! Try again:\n");
                        return false;
                    }
                    break;
                case 3:
                    if (length != 3) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Submarine! Try again:\n");
                        return false;
                    }
                    break;
                case 2:
                    if (length != 3) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Cruiser! Try again:\n");
                        return false;
                    }
                    break;
                case 1:
                    if (length != 2) {
                        System.out.println();
                        System.out.print("Error! Wrong length of the Destroyer! Try again:\n");
                        return false;
                    }
            }
            for (int j = Integer.parseInt(coordinateOne[1]); j == Integer.parseInt(coordinateOne[1]); j++) {
                for (int i = min; i <= max; i++) {
                    try {
                        if (i == 10) {
                            if (j == 10) {
                                if (this.battleship2[i][j - 1].equals("O") || this.battleship2[i - 1][j - 1].equals("O") ||
                                        this.battleship2[i - 1][j].equals("O") || this.battleship2[i - 1][j + 1].equals("O") ||
                                        this.battleship2[i][j + 1].equals("O")) {
                                    System.out.println();
                                    System.out.println("Error! You placed it too close to another one. Try again:");
                                    return false;
                                } else {
                                    String coordinatePair = i + " " + j;
                                    this.coordinatesList2.add(coordinatePair);
                                }
                            } else if (this.battleship2[i][j - 1].equals("O") || this.battleship2[i - 1][j - 1].equals("O") ||
                                    this.battleship2[i - 1][j].equals("O") || this.battleship2[i - 1][j + 1].equals("O") ||
                                    this.battleship2[i][j + 1].equals("O")) {
                                System.out.println();
                                System.out.println("Error! You placed it too close to another one. Try again:");
                                return false;
                            } else {
                                String coordinatePair = i + " " + j;
                                this.coordinatesList.add(coordinatePair);
                            }
                        } else if (i >= 1 && i <= 9) {
                            if (j == 10) {
                                if (this.battleship2[i + 1][j].equals("O") || this.battleship2[i + 1][j - 1].equals("O") ||
                                        this.battleship2[i][j - 1].equals("O") || this.battleship2[i - 1][j - 1].equals("O") ||
                                        this.battleship2[i - 1][j].equals("O")) {
                                    System.out.println();
                                    System.out.println("Error! You placed it too close to another one. Try again:");
                                    return false;
                                } else {
                                    String coordinatePair = i + " " + j;
                                    this.coordinatesList2.add(coordinatePair);
                                }
                            } else if (this.battleship2[i + 1][j].equals("O") || this.battleship2[i + 1][j - 1].equals("O") ||
                                    this.battleship2[i][j - 1].equals("O") || this.battleship2[i - 1][j - 1].equals("O") ||
                                    this.battleship2[i - 1][j].equals("O") || this.battleship2[i - 1][j + 1].equals("O") ||
                                    this.battleship2[i][j + 1].equals("O")) {
                                System.out.println();
                                System.out.println("Error! You placed it too close to another one. Try again:");
                                return false;
                            } else {
                                String coordinatePair = i + " " + j;
                                this.coordinatesList2.add(coordinatePair);
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException ignored) {

                    }
                }
            }
        } else {
            System.out.println();
            System.out.println("Error! Wrong ship location! Try again:");
            return false;
        }
        for (String coordinate : this.coordinatesList2) {
            String[] coordinatePair = coordinate.split(" ");
            if (this.coordinatesList2.size() == 5) {
                this.aircraftCoordinates2.add(coordinate);
            } else if (this.coordinatesList2.size() == 4) {
                this.battleshipCoordinates2.add(coordinate);
            } else if (this.coordinatesList2.size() == 3 && count == 3) {
                this.submarineCoordinates2.add(coordinate);
            } else if (this.coordinatesList2.size() == 3 && count == 2) {
                this.cruiserCoordinates2.add(coordinate);
            } else if (this.coordinatesList2.size() == 2 && count == 1) {
                this.destroyerCoordinates2.add(coordinate);
            }
            this.battleship2[Integer.parseInt(coordinatePair[0])][Integer.parseInt(coordinatePair[1])] = "O";
        }
        return true;
    }

    public String letterConverter(String letter) {
        switch (letter) {
            case "A":
                letter = "1";
                break;
            case "B":
                letter = "2";
                break;
            case "C":
                letter = "3";
                break;
            case "D":
                letter = "4";
                break;
            case "E":
                letter = "5";
                break;
            case "F":
                letter = "6";
                break;
            case "G":
                letter = "7";
                break;
            case "H":
                letter = "8";
                break;
            case "I":
                letter = "9";
                break;
            case "J":
                letter = "10";
                break;
        }
        return letter;
    }

    public static void promptEnterKey() {
        System.out.println("Press Enter and pass the move to another player");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.addShips();
        main.runGame();
    }
}

