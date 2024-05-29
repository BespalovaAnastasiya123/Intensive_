package Lesson_6;

import java.util.List;

public class Park {

    private List<Attraction> parkAttractions;

    public List<Attraction> getParkAttractions() {
        return parkAttractions;
    }

    public void setParkAttractions(List<Attraction> parkAttractions) {
        this.parkAttractions = parkAttractions;
    }

    class Attraction {
        String name;
        String startTime;
        String finishTime;
        double cost;

        public Attraction(String name, String startTime, String finishTime, double cost) {
            this.name = name;
            this.startTime = startTime;
            this.finishTime = finishTime;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", startTime='" + startTime + '\'' +
                    ", finishTime='" + finishTime + '\'' +
                    ", cost =" + cost +
                    '}';
        }

        public void infoAttractions() {
            System.out.printf("Аттракцион '%s':\nНачало работы: %s\nОкончание работы: %s\nСтоимость: %.2f руб\n\n", name, startTime, finishTime, cost);
        }
    }
}

