import java.util.ArrayDeque;
import java.util.Deque;


public class Calculator {
//    int c = 8;
//    int d = 2;
//    char op1 = '+';
//    char op2 = '-';
//    char op3 = '*';
//    char op4 = '/';
//    char op5 = '<';
//
//    calculate(op1,c,d);
//    calculate(op2,c,d);
//    calculate(op3,c,d);
//    calculate(op4,c,d);
//    calculate(op5,c,d);
    public ArrayDeque <Integer> results = new ArrayDeque<>();
    public ArrayDeque operations = new ArrayDeque<>();
    public int prevResult;

    public int calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        if (op == '<') {
            if (results.size() >= 2) {
                results.pop();
                prevResult = results.peek();
            }
            return prevResult;
        }
        else {
            int result;
//             = doOperation(op, a, b);
            switch (op) {
                case '+':
                    result = add(a, b);
                case '-':
                    result = minus(a, b);
                case '*':
                    result = mult(a, b);
                case '/':
                    result = divide(a, b);
                default:
                    throw new IllegalArgumentException("Ошибка ввода, введите корректный оператор: " + op);
            }
            results.push(result);
            operations.push(op);
            prevResult = result;
            return result;
        }
    }

    private int doOperation(char op, int a, int b) {
        switch (op) {
            case '+':
                return add(a, b);
            case '-':
                return minus(a, b);
            case '*':
                return mult(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Ошибка ввода, введите корректный оператор: " + op);
        }
    }

    private int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Деление на ноль");
        }
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int add(int a, int b) {
        return a + b;
    }



}
