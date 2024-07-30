package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        var employees = CreateEmployeeList.createEmployeesTable();
        EmployeesUnder30.printEmployeesUnder30(employees);
        SalaryInRubles.printElployeesWithRubSalary(employees);
        AverageAge.printAverageAge(employees);
    }
}
