package Lesson_6;

public class Person {

    String name;
    String position;
    String eMail;
    String telNumber;
    double salary;
    int age;

    public Person(String name, String position, String eMail, String telNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", eMail='" + eMail + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}' + '\n';
    }
}


