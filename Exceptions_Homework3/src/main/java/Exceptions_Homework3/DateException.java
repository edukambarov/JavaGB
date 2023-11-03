package Exceptions_Homework3;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("Ошибка: DateNotCorrectFormat");
        System.out.printf("Некорректные данные: %s", i);
        System.out.println();
    }
}
