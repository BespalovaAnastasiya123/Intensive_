package Lesson_6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employer employer1 = new Employer("Ivanov Ivan Jovanovich", "AQA engineer", "Intensive1@mail.ru", "+375331122334", 1000, 35);
        Employer employer2 = new Employer("Petrov Pert Petrovich", "Developer", "Intensive2@mail.ru", "+375331232334", 2000, 31);
        Employer employer3 = new Employer("Sidor Igor Sergeevich", "Developer", "Intensive3@mail.ru", "+375331235566", 1500, 29);
        employer1.info();
        employer2.info();
        employer3.info();
        System.out.println();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Sidor Pavel", "Manager", "sidp@mailbox.com", "89231123", 40000, 32);
        persArray[2] = new Person("Pavlov Petr", "Developer", "PavlP@mail.ru", "892311290", 25000, 31);
        persArray[3] = new Person("Lyapunov Yuriy", "Manager", "er998@gmail.com", "89231123876", 45000, 39);
        persArray[4] = new Person("Davidov Semen", "Engineer", "da456@mailbox.com", "892311098", 42000, 35);
        System.out.println(Arrays.toString(persArray));
        System.out.println();


        Park park = new Park();
        List<Park.Attraction> attraction = List.of(
                park.new Attraction("Sun", "9 am", "8 pm", 5),
                park.new Attraction("Roller", "9.30 am", "8 pm", 7)
        );
        park.setParkAttractions(attraction);

        for (Park.Attraction parkAttractions : park.getParkAttractions()) {
            parkAttractions.infoAttractions();
        }


    }
}
