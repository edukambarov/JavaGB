package Seminar1;

public class ChocolateBar extends Product {
    private double volume; // объем
    private int fat; // Содержание жирности
    private int caloricity; // Калорийность

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }
    public int getCaloricity() {
        return caloricity;
    }
    public void setCaloricity(int fat) {
        this.caloricity = caloricity;
    }
    public ChocolateBar(String brand, String name, double price, double volume, int fat, int caloricity){
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
        this.caloricity = caloricity;
    }

    @Override
    public String displayInfo() {
        return String.format("[ШОКОЛАД] %s - %s - %.2f - объем: %.2f; жирность: %d; калорийность: %d" , brand, name, price, volume, fat, caloricity);
    }
}
