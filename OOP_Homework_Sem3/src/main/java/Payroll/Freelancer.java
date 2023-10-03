package Payroll;

/**
 * TODO: Разработать тип Freelancer самостоятельно в рамках выполнения
 *  домашней работы
 * Фрилансер (работник с почасовой оплатой)
 * DONE!
 */
public class Freelancer extends Employee{

    public Freelancer(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (почасовая): %.2f (руб.); %d лет.",
                surName, name, calculateSalary(), age);
    }
}
