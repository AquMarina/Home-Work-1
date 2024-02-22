package OopHW1;

import java.util.ArrayList;

public class Automat implements Auto {
    ArrayList<HotDrink> drinkAuto;

    public void initDrinks(ArrayList<HotDrink> drinkAuto) {
        this.drinkAuto = drinkAuto;
    }

    @Override
    public void getDrink(String name, int volume) {
        for (Drink drink : drinkAuto) {
            if (drink.getName().equals(name) && drink.getVolume() == volume) {
                System.out.println(drink);
            }
        }

    }

    public void getDrink(String name, int volume, int temperature) {
        for (HotDrink drink : drinkAuto) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                System.out.println(drink);
            }
        }
    }

}
