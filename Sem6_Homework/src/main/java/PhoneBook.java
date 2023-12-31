import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class PhoneBook {
    private HashMap<String, Set<String>> contacts;
    public PhoneBook(){
        contacts = new HashMap<String, Set<String>>();
    }
    public void addPhoneNumber(String name, String number){
        Set<String> numbers;
        if (contacts.containsKey(name)) numbers = contacts.get(name);
        else {
            numbers = new HashSet<String>();
            contacts.put(name, numbers);
        }
        numbers.add(number);
    }
    public void printAllnumbers() {
        for (String item: contacts.keySet()) {
            for (Object el: contacts.get(item)) {
                System.out.println(item+ ": " + el);
            }
        }
    }
    public void sortByNumbersQuantityAndPrint (){
        Set<Entry<String,Set<String>>> set = contacts.entrySet();
        List<Entry<String,Set<String>>> list = new ArrayList<Entry<String, Set<String>>>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Set<String>>>() {
            @Override
            public int compare(Entry<String, Set<String>> o1, Entry<String, Set<String>> o2) {
                return o2.getValue().size()- o1.getValue().size();
            }
        });
        for (Entry<String, Set<String>> item: list) {
            for (Object el: item.getValue()) {
                System.out.println(item.getKey()+ ": " + el);
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите 1, если хотите добавить данные; " +
                    "\nвведите 2, чтобы увидеть все телефоны;" +
                    "\nвведите 3, чтобы отсортировать контакты по кол-ву номеров телефонов.");
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("Введите имя: ");
                String name = scanner.next();
                System.out.println("Введите номер: ");
                String number = scanner.next();
                phoneBook.addPhoneNumber(name, number);
            }
            else if (choice == 2) {
                phoneBook.printAllnumbers();
            }
            else if (choice == 3) {
                phoneBook.sortByNumbersQuantityAndPrint();
            }
            else{
                scanner.close();
                System.out.println("До скорой встречи!");
                break;
            }
        }
    }
}



