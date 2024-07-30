package org.example;

import java.util.List;
import java.util.Map;

public class EmployeesUnder30 {

    public static void printEmployeesUnder30(List<Map<String, String>> employees){
        System.out.println("Сотрудники младше 30 лет: ");
        for(Map<String, String> employee : employees) {
            int age = Integer.parseInt(employee.get("Возраст"));
            if (age < 30) {
                System.out.println(employee.get("Имя"));
            }
    }
    }
}
