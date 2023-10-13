import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<String> textList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numList.add(new Random().nextInt(99));
//            textList.add(String.valueOf(numList.get(0)));
        }

//        for (Integer x: numList) {
//            textList.add(String.valueOf(x));
//        }

        numList.forEach(x -> textList.add(String.valueOf(x)));

        System.out.println(numList);

        numList.sort(Comparator.naturalOrder());
        System.out.println(numList);

        System.out.println(numList.get(numList.size()/2));



    }
}
