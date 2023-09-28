package Seminar1;

import java.util.List;

public class VendingMachine {


    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }


    public BottleOfMilk getBottleofMilk(double volume, int fat){
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (bottleOfMilk.getVolume() == volume && bottleOfMilk.getFat() == fat){
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    public ChocolateBar getChocolateBar(double volume, int fat, int caloricity){
        for (Product product : products){
            if (product instanceof ChocolateBar){
                ChocolateBar chocolateBar = (ChocolateBar) product;
                if (chocolateBar.getVolume() == volume &&
                        chocolateBar.getFat() == fat &&
                        chocolateBar.getCaloricity() == caloricity){
                    return chocolateBar;
                }
            }
        }
        return null;
    }

}
