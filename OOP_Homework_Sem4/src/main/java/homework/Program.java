package homework;

import java.util.ArrayList;

public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект*/
    public static void main(String[] args) {

        ArrayList<Orange> oranges1 = new ArrayList<Orange>(8);
        oranges1.add(new Orange());
        oranges1.add(new Orange());
        oranges1.add(new Orange());
        oranges1.add(new Orange());
        oranges1.add(new Orange());
        Box box1 = new Box(oranges1);
        System.out.println(box1);
        ArrayList<Apple> apples1 = new ArrayList<Apple>(5);
        apples1.add(new Apple());
        apples1.add(new Apple());
        Box box2 = new Box(apples1);
        System.out.println(box2);
        ArrayList<Apple> apples2 = new ArrayList<Apple>(9);
        apples2.add(new Apple());
        apples2.add(new Apple());
        apples2.add(new Apple());
        apples2.add(new Apple());
        apples2.add(new Apple());
        apples2.add(new Apple());
        apples2.add(new Apple());
        apples2.add(new Apple());
        apples2.add(new Apple());
        Box box3 = new Box(apples2);
        System.out.println(box3);
        System.out.println(box3.IsTheSameFruit(box2));
        System.out.println(box3.IsTheSameFruit(box1));
        box3.addFruitsFrom(box2);
        System.out.println(box3);
        System.out.println(box2);
        System.out.println(box1);
        box1.addFruit(new Orange());
        System.out.println(box1);
        box3.removeFruit();
        System.out.println(box3);
        System.out.println(box1.Compare(box3));
        System.out.println(box3.Compare(box2));

    }

}
