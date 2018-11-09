package com.example.consultants.week3_test_friday;

import java.util.ArrayList;
import java.util.List;

public class main {

    private static List<Employee> employeeList;

    public static void main(String[] args) {
        Room[][] verticalTrue = new Room[][] {  {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) } };
        System.out.println("Room: "+Room.isOutbreak(verticalTrue));

//        Room[][] horizontalTrue = new Room[][] { {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(true), new Room(true), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },;
//        System.out.println("Room: "+Room.isOutbreak(horizontalTrue));

                //secondExercise();
    }

    private static void secondExercise() {
        List<String[]> stringList = new ArrayList<>() ;

        String[] array = {"B2,E3,F6","A1,B2,C3,D4","D4,G7,I9","G7,H8"};
        for (int i = 0; i < array.length; i++) {
            String arrayTemp[] = array[i].split(",");
            stringList.add(arrayTemp);
        }

        for (int i = 0; i < stringList.size(); i++) {
            String[] tempArray = stringList.get(i);
            for (int j = 0; j < tempArray.length; j++) {
                System.out.println(tempArray[j]);
            }
            System.out.println("---");
        }

        employeeList = new ArrayList<>();

        createEmployees(stringList.get(0));
        createEmployees(stringList.get(1));
        createEmployees(stringList.get(2));

        createEmployee(employeeList);

        printEmployees();

        printEmployees2();
    }

    private static void createEmployee(List<Employee> employeeList) {

    }

    private static void createEmployees(String[] one) {

        Employee employee = new Employee(one[0]);
        Employee[] employees = new Employee[one.length-1];
        for (int j = 1; j < one.length; j++) {
            Employee employee1 = new Employee(one[j]);
            employee1.setManagerId(one[0]);
            employees[j-1] = employee1;
            employeeList.add(employee1);
        }
        employee.setEmployees(employees);
        employeeList.add(employee);
    }

    private static void printEmployees() {
        for (int i = 0; i < employeeList.size() ; i++) {
            Employee emp  = employeeList.get(i);
            //System.out.println(emp.getId());
            if (emp.isManager()){
                System.out.println(emp.getId());
                Employee[] empl = emp.getEmployees();
                for (int j = 0; j < empl.length; j++) {
                    System.out.println("employee id: "+empl[j].getId());
                }
            }
        }
    }

    private static void printEmployees2() {
        for (int i = 0; i < employeeList.size() ; i++) {
            Employee emp  = employeeList.get(i);
            //System.out.println(emp.getId());
            if (emp.isManager()){
                System.out.println(emp.getId());
                Employee[] empl = emp.getEmployees();
                for (int j = 0; j < empl.length; j++) {
                    System.out.println("employee id: "+empl[j].getId());
                }
            }
        }
    }
}
