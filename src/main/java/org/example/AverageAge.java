package org.example;

import java.util.List;
import java.util.Map;

public class AverageAge {

    public static void printAverageAge(List<Map<String, String>> employees) {
        double sumAge = 0;
        System.out.println("Средний возраст всех сотрудников: ");
        for (Map<String, String> employee : employees) {
            String ageStr = employee.get("Возраст");
            int age = Integer.parseInt(ageStr);
            sumAge += age;

        }
        System.out.println(sumAge/employees.size());
    }

}
