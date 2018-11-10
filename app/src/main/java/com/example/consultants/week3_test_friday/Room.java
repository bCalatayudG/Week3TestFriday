package com.example.consultants.week3_test_friday;

public class Room {
    private static int counter;
    public final boolean isInfected;
    public boolean visited = false;

    Room(boolean infected) {
        isInfected = infected;
    }

    public static boolean isOutbreak(Room[][] floor) {
        //Your logic here
        System.out.println("Entering Room: ");
        int i = 0, j = 0;
        counter = 0;
        return checkInfection(floor, i, j);
    }

    private static boolean checkInfection(Room[][] floor, int i, int j) {
        if (counter != 5) {
            for (int ii = i; ii < 9; ii++) {
                for (int jj = j; jj < 9; jj++) {
                    if (floor[ii][jj].isInfected) {
                        if (isBottomInfected(floor, ii, jj)) {
                            checkInfection(floor, ii + 1, jj);
                        } else if (isRightInfected(floor, ii, jj)) {
                            checkInfection(floor, ii, jj + 1);
                        }
                    }
                }
            }
        }
        //System.out.println(counter);
        if (counter > 4)
            return true;
        else return false;
    }

    private static boolean isBottomInfected(Room[][] floor, int i, int j) {
        if (j < 9) {
            if (floor[i + 1][j].isInfected) {
                counter++;
                return true;
            }
        }
        return false;
    }

    public static boolean isRightInfected(Room[][] floor, int i, int j) {
        if (i < 9) {
            if (floor[i][j+1].isInfected) {
                counter++;
                return true;
            }
        }
        return false;
    }

}