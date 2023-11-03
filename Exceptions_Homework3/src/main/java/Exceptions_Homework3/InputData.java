package Exceptions_Homework3;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите данные пользователя в формате Ф.И.О, дата рождения, номер телефона цифрами, пол - f/m \nПример: Ivanov Ivan Ivanovich 29.01.1986 79219219219 m");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Ошибка: недостаточное количество данных");
            } else System.out.println("Ошибка: введены личшние данные");
        }

    }
}
