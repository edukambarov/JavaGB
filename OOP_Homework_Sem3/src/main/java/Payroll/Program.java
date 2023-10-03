package Payroll;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(50000, 110000);
        int age = random.nextInt(21,60);
        Worker worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
        return worker;
    }
    static Freelancer generateFreelancer(){
       String[] names2 = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
       String[] surnames2 = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
       int salary2 = random.nextInt(500, 750);
       int age2 = random.nextInt(18,45);
       Freelancer freelancer = new Freelancer(surnames2[random.nextInt(surnames2.length)], names2[random.nextInt(names2.length)], salary2, age2);
       return freelancer;
    }
    /**
     * TODO: Переработать метод generateEmployees. Метод должен возвращать массив сотрудников
     *  разных типов (Worker, Freelancer), метод должен быть ОДИН!
     *
     * DONE!
     */
    static Employee[] generateEmployees(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < employees.length; i++) {
            int choice = random.nextInt(2);
            if (choice==0) employees[i] = (Freelancer)generateFreelancer();
            else if (choice==1) employees[i] = (Worker)generateWorker();
            else break;
            }
        return employees;
        }


//    static Worker[] generateEmployees(int count){
//        Worker[] employees = new Worker[count];
//        for (int i = 0; i < employees.length; i++)
//           employees[i] = generateWorker()
//        return employees;
//    }


    public static void main(String[] args) {

        Employee[] employees = generateEmployees(7);
        String status = "Инициализация";

        public void printWithStatus() {
            for (int i = 0; i < 35; i++) System.out.print("=");
            System.out.println();
            System.out.println(status);
            for (int i = 0; i < 35; i++) System.out.print("=");
            System.out.println();
            for (Employee employee : employees) {
                System.out.println(employee);
            }
            System.out.println();
        }


        Arrays.sort(employees, new SalaryComparator(SortType.Ascending));

        for (int i=0; i<35; i++) System.out.print("=");
        System.out.println();
        System.out.println("Сортировка по убыванию зарплаты");
        for (int i=0; i<35; i++) System.out.print("=");
        System.out.println();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();

        /**
         * TODO:
         * Придумать свой собственный компаратор
         * (Возможно отсортировать сотрудников по возрасту?
         * Тогда добавьте соответствующее состояние на уровне ваших классов).
         *
         *  DONE!
         * TODO:
         * Продемонстрировать сортировку объектов
         * различного типа с использованием собственного компаратора.
         *
         *  DONE!
         */
        Arrays.sort(employees, new AgeComparator(SortType.Ascending));

        for (int i=0; i<35; i++) System.out.print("=");
        System.out.println();
        System.out.println("Сортировка по возрастанию возраста");
        for (int i=0; i<35; i++) System.out.print("=");
        System.out.println();
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();
    }

}








