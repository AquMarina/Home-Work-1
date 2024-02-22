package OopHW1;

public class HotDrink extends Drink {
    protected int temperature;

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("Напиток %s, объёмом %d, температура %d", this.name, this.volume, this.temperature);
    }
}
