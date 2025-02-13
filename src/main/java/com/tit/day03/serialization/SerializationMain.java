package com.tit.day03.serialization;

import java.util.ArrayList;
import java.util.List;

public class SerializationMain {

    //define file path
    private static  String filePath = "C:\\capgeminitraining\\Week-4\\Java Strams\\src\\main\\resources\\serializations.txt";

    public static void main(String[] args) {
        //create list of employee
        List<Employee> employeeList = new ArrayList<>();
        //create employees
        Employee rajveerEmployee = new Employee("Rajveer", 101, "Cloud", 987654);
        Employee darshanEmployee = new Employee("Darshan", 102, "IT", 987654);

        //add employees to list
        employeeList.add(rajveerEmployee);
        employeeList.add(darshanEmployee);

        //create object of serialization
        Operations operation = new Operations();
        //perform serialization on object
        operation.performSerilization(employeeList, filePath);

        //perform deserialization
        operation.performDeserilization(filePath);
    }

}
