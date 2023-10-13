import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numList1 = new ArrayList<>();
        ArrayList<Integer> numList2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numList1.add(new Random().nextInt(99));
            numList2.add(new Random().nextInt(111));
        }
        System.out.println(numList1);
        System.out.println(numList2);

//        for (Integer el: numList2) {
//            if (el % 2 == 0) numList1.add(el);
//        }
        numList2.removeIf(x -> x % 2 == 0);
        numList1.addAll(numList2);

        System.out.println(numList1);



    }
}
