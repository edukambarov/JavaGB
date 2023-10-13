import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
//        LinkedList <Object> ll = new LinkedList<>();
//        ll.add(1);
//        ll.add("One");
//        ll.add(2);
//        ll.add("Two");
//        LinkedList<Object> ll2 = new LinkedList<>(ll);
//        for (int i = 0; i < ll.size(); i++) {
//            ll.add(i,ll2.getLast());
//            ll.remove(i+1);
//            ll2.remove(ll2.size()-1);
//        }
//        System.out.println(ll);

        LinkedList<Integer> queue = new LinkedList<>();

        queue.addFirst(1);
        queue.addFirst(3);
        queue.addLast(2);
        queue.poll();
        queue.getFirst();

        System.out.println(queue);
        System.out.println(queue.getFirst());



    }
}
