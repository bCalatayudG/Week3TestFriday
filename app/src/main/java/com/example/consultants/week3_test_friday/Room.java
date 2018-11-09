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
        System.out.println("Entering method");
        int i = 0, j = 0;
        return checkInfection(floor, i, j);
    }

    private static boolean checkInfection(Room[][] floor, int i, int j) {
        //System.out.println(i + "," + j);
        if (counter != 5) {
            for (int ii = i; ii < 9; ii++) {
                for (int jj = j; jj < 9; jj++) {
                    System.out.println("ii,jj " + ii + "," + jj);
                    if (floor[ii][jj].isInfected) {
                        counter++;
                        System.out.println("Room " + ii + "," + jj + " is infected, counter " + counter);
//                    if(floor[ii][jj].hasLeft(ii))
//                        checkInfection(floor,ii,jj-1);
                        if (isBottomInfected(floor, ii, jj)) {
                            checkInfection(floor, ii + 1, jj);
                        }

                    } //else
                    //counter = 0;
                }
            }
        } else
            System.out.println("outbreak");
        System.out.println(counter);
        if (counter>5)
            return true;
        else return false;
    }


    private static boolean isBottomInfected(Room[][] floor, int i, int j) {
        if (j < 9) {
            //System.out.println("Testing "+(i+1)+","+j);
            if (floor[i + 1][j].isInfected) {
                System.out.println("Counter Bottom " + counter);
                //System.out.println("floor "+i+","+j+" IS INFECTED");
                return true;
            }
        }
        return false;
    }

    public static boolean isRightInfected(Room[][] floor, int i, int j) {
        if (i < 9) {
            if (floor[i + 1][j].isInfected) {
                counter++;
                return true;
            }
        }
        return false;
    }

    private boolean hasLeft(int i) {
        if (i > 0) {
            counter++;
            return true;
        }
        return false;
    }
}