package Lesson5;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String surname, String patronymic, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
