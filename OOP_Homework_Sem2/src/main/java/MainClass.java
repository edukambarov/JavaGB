public class MainClass {
    public static void main(String[] args) {

        Cat [] ourCats = new Cat[4];
        ourCats[0] = new Cat("Tom",31);
        ourCats[1] = new Cat("Boris",32);
        ourCats[2] = new Cat("Musya",28);
        ourCats[3] = new Cat("Bagira",29);

        Plate plate2 = new Plate(100);

        for (Cat one: ourCats) {
            plate2.info();
            one.eat(plate2);
            one.info();
        }
        plate2.info();
        plate2.addFood(50);
        for (Cat one: ourCats) {
            plate2.info();
            one.eat(plate2);
            one.info();
        }
        plate2.info();
    }
}