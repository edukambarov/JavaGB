public class ToyLottery {

    public static void main(String[] args) {
        ToyShop shop = new ToyShop();

        Toy toy1 = new Toy(1,"Конструктор Lego", 100, 20);
        Toy toy2 = new Toy( 2,"Спиннер", 300, 45);
        Toy toy3 = new Toy(3, "Мяч футбольный", 200, 30);
        Toy toy4 = new Toy(4,"Кукла Barbie", 200, 20);
        Toy toy5 = new Toy(5,"Настольная игра 'Монополия'", 200, 30);
        Toy toy6 = new Toy(6,"PlayStation 5", 25, 10);

        shop.addToy(toy1);
        shop.addToy(toy2);
        shop.addToy(toy3);
        shop.addToy(toy4);
        shop.addToy(toy5);
        shop.addToy(toy6);


        shop.changeToyFrequency(1, 30);

        shop.playLottery();

        Toy prizeToy = shop.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка" + "(id=" + prizeToy.getId()+ "): " +prizeToy.getName());
        }

    }

}