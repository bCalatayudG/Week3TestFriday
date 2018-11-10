package com.example.consultants.week3_test_friday;

import java.util.ArrayList;
import java.util.List;

public class main {

    private static List<Employee> employeeList;
    private static List<Employee> listManagers;

    public static void main(String[] args) {
        //firstExercise();

        secondExercise();
    }

    private static void firstExercise() {
        Room[][] verticalTrue = new Room[][]{{new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(true), new Room(false), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}};
        test(verticalTrue);

        System.out.println("--");
        Room[][] horizontalTrue = new Room[][]{{new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(true), new Room(true), new Room(true), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}};
        test(horizontalTrue);

        System.out.println("--");
        Room[][] noInfection = new Room[][]{{new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}};
        test(noInfection);
    }

    private static void test(Room[][] room) {
        if (Room.isOutbreak(room))
            System.out.println("OutBreak!!!");
        else
            System.out.println("No Outbreak");
    }

    private static void secondExercise() {
        List<String[]> stringList = new ArrayList<>();

        String[] array = {"B2,E3,F6", "A1,B2,C3,D4", "D4,G7,I9", "G7,H8"};
        for (int i = 0; i < array.length; i++) {
            String arrayTemp[] = array[i].split(",");
            stringList.add(arrayTemp);
        }

//        for (int i = 0; i < stringList.size(); i++) {
//            String[] tempArray = stringList.get(i);
//            for (int j = 0; j < tempArray.length; j++) {
//                System.out.println(tempArray[j]);
//            }
//            System.out.println("---");
//        }

        employeeList = new ArrayList<>();
        listManagers = new ArrayList<>();

        //createEmployees(stringList.get(0));
        //createEmployees(stringList.get(1));
        //createEmployees(stringList.get(2));

        createEmployee(stringList);

        printEmployees();

//        printEmployees2();
    }

    private static void createEmployee(List<String[]> stringList) {
        for (String[] array : stringList) {
            createEmployees(array);
        }
    }

    private static void createEmployees(String[] one) {
        Employee employee = new Employee(one[0]);
        listManagers.add(employee);
        Employee[] employees = new Employee[one.length - 1];
        for (int j = 1; j < one.length; j++) {
            for (int i = 0; i < listManagers.size(); i++) {
                Employee employee1;
                if (listManagers.get(i).getId().equals(one[j])) {
                    employee1 = listManagers.get(i);
                }else{
                    employee1 = new Employee(one[j]);
                }
                employee1.setManagerId(one[0]);
                employees[j - 1] = employee1;
                employeeList.add(employee1);
            }


        }
        employee.setEmployees(employees);
        employeeList.add(employee);
    }

    private static void printEmployees() {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee emp = employeeList.get(i);
            //System.out.println(emp.getId());
            if (emp.isManager()) {
                System.out.println(emp.getId() + " " + emp);
                Employee[] empl = emp.getEmployees();
                for (int j = 0; j < empl.length; j++) {
                    System.out.println("employee id: " + empl[j].getId() + " " + empl[j]);
                }
            }
        }
    }

    private static void printEmployees2() {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee emp = employeeList.get(i);
            //System.out.println(emp.getId());
            if (emp.isManager()) {
                System.out.println(emp.getId());
                Employee[] empl = emp.getEmployees();
                for (int j = 0; j < empl.length; j++) {
                    System.out.println("employee id: " + empl[j].getId());
                }
            }
        }
    }
}
