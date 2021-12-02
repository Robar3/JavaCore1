package Lesson5;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {
        for (Employee e:addEmployee(5)) {
            if (e.getAge()>40)
            System.out.println(e);
        }
    }

    private static List<Employee> addEmployee(int number){
        List<Employee> employees =new ArrayList<>();
        for (int i = 0; i <number ; i++) {
            employees.add(new Employee("name"+i,"surname"+i,
                    "patronymic"+i,"position"+i,"email"+i+"@mail.ru",
                    "8999999999"+i,60000+i*1000,20+i*10));
        }
        return employees;
    }

}
