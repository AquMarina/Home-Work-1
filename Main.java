package OopHW1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HotDrink> drinkAuto = new ArrayList<>();

        drinkAuto.add(new HotDrink("americano", 150, 80));
        drinkAuto.add(new HotDrink("latte", 350, 70));
        drinkAuto.add(new HotDrink("capuchino", 300, 70));
        drinkAuto.add(new HotDrink("tea", 300, 75));
        drinkAuto.add(new HotDrink("cocoa", 350, 70));
        drinkAuto.add(new HotDrink("espresso", 50, 80));

        Automat automat = new Automat();
        automat.initDrinks(drinkAuto);
        automat.getDrink("latte", 350, 70);

    }

}
