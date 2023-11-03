package Exceptions_Homework3;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Ошибка: неверно указан пол");
        System.out.printf("Некорректные данные: %s", i);
        System.out.println();
    }
}
