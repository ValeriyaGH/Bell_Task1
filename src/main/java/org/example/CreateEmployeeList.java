package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateEmployeeList {

    public static List<Map<String, String>> createEmployeesTable() {
        List<Map<String, String>> employees = new ArrayList<>();
        //Добавляем сотрудников
        employees.add(employee("Кирилл", "26", "Middle java dev", "150000 руб"));
        employees.add(employee("Виталий", "28", "Senior java automation QA", "2000$"));
        employees.add(employee("Александр", "31", "junior functional tester", "50000 руб"));
        employees.add(employee("Дементий", "35", "dev-ops", "1500$"));
   return employees;
    }

    //Создаем таблицу для создания записей о сотрудниках
    private static Map<String, String> employee(String name, String age, String position, String salary) {
        Map<String, String> employee = new HashMap<>();
        employee.put("Имя", name);
        employee.put("Возраст", age);
        employee.put("Должность", position);
        employee.put("Зарплата", salary);
        return employee;
    }
}

