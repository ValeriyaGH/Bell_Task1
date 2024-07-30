package org.example;

import java.util.List;
import java.util.Map;

public class SalaryInRubles {
    public static void printElployeesWithRubSalary(List<Map<String, String>> employees) {
        System.out.println("Сотрудники с зарплатой в рублях: ");
        for (Map<String, String> employee : employees) {
            String salary = employee.get("Зарплата");
            if (salary.contains("руб")) {
System.out.println(employee.get("Имя"));
            }

        }
    }}
