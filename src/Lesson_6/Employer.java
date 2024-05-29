package Lesson_6;

public class Employer {

    String name;
    String position;
    String eMail;
    String phoneNumber;
    int salary;
    int age;

    public Employer(String name, String position, String eMail, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Сотрудник: " + name + "; " + "Возраст: " + age + "; Должность:  " + position + "; Контактные данные: " + eMail
                + ", " + phoneNumber + "; Зарплата: " + salary + ";");
    }
}

