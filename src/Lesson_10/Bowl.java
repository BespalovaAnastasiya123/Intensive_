package Lesson_10;

public class Bowl {

    private static int foodInBowl;

    public Bowl(int foodInBowl) {
        this.foodInBowl = foodInBowl;
    }
    public int getFoodInBowl() {
        return foodInBowl;
    }

    public void eatFoodFromBowl(int food){
        foodInBowl -= food;
    }

    public void addToBowl(int food) {
        foodInBowl += food;
        System.out.println("В тарелку добавлено " + food + " единиц корма. Сейчас в миске стало " + foodInBowl + "  единиц корма.");
    }
}
