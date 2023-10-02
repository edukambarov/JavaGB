public class Cat {
    private String name;
    private int appetite;

    private boolean fullness;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public int getAppetite() {
        return appetite;    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public void info() {
        System.out.print("Cat " + this.name + " is ");
        System.out.println(this.fullness? "full.": "hungry.");
    }

    public void eat(Plate pl) {
        if (!this.fullness){
            if (pl.getFood() >= this.appetite) {
                pl.setFood(pl.getFood() - this.getAppetite());
                this.fullness = true;
            }
        }
    }
}