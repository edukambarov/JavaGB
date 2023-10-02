public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int food) {
        System.out.println("We added " + food +" food points.");
        this.food += food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}