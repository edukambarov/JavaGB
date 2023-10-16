package ru.geekbrains.lesson6.homework;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        SaveFormatted.saveToJson(order);
        System.out.println(order);
    }
}