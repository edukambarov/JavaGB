package homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private static int counter=1000;
    private ArrayList<T> fruits;

    private int boxId;
    {
       boxId = ++counter;
    }

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public int getBoxId() {
        return boxId;
    }

    /*
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    DONE
    */
    public float getWeight() {
        return fruits.size() * fruits.get(0).getWeight();
    }

    @Override
    public String toString() {
        return "Box" + getBoxId() +
                "; fruit: " + fruits.get(0).getClass()
                + "; quantity = " + fruits.size()
                + "; weight = " + getWeight();
    }

    boolean IsTheSameFruit (Box <T> other) {
        return fruits.get(0).getClass() == other.fruits.get(0).getClass();
    }

    boolean IsTheSameFruit (T item) {
        return fruits.get(0).getClass() == item.getClass();
    }
    /*
    g. Не забываем про метод добавления фрукта в коробку.
    DONE
    */
    public void addFruit(T item) {
        if (IsTheSameFruit(item)){
            if (fruits.size() < 10) {
                fruits.add(0, item);
           }

       }
        else System.out.println("Вы пытаетесь положить в одну коробку разные фрукты. Это недопустимо!");
    }

    public void removeFruit() {
        fruits.remove(0);
    }

    public void removeFruit(int index) {
        fruits.remove(index);
    }
    /*
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    DONE
    */
    public void addFruitsFrom (Box<T> other) {
        if (IsTheSameFruit(other)) {
            while (fruits.size() < 10) {
                for (int i = 0; i < other.fruits.size(); i++) {
                    fruits.add(other.fruits.get(i));
                    other.removeFruit(i);
                }
            }
        }
        else System.out.println("Вы пытаетесь положить в одну коробку разные фрукты. Это недопустимо!");
    }
    /*
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    DONE
    */
    public boolean Compare(Box<T> other) {
        return getWeight() == other.getWeight();
    }

}






