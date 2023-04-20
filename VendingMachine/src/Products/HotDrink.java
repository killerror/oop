package Products;

// наследуем класс Product
public class HotDrink extends Product {

    // объём напитка
    private int volume;
    // температура напитка
    private int temper;

    // конструктор класса, добавлен объём напитка и температура
    public HotDrink(String name, double price, int volume, int temperature)
    {
        // суперский базовый конструктор
        super(name, price);
        // инициализируем объём
        this.volume = volume;
        // инициализируем температуру
        this.temper = temperature;
    }

    // метод получения объёма
    public int getVolume() {
        return this.volume;
    }

    // метод назначения объёма
    public void setVolume(int vol) {
        this.volume = vol;
    }

    // метод получения темперутры
    public int getTemperature() {
        return this.temper;
    }

    // метод назначения температуры
    public void setTemperature(int temperature) {
        this.temper = temperature;
    }

    // оверрайд стандартного преобразования в строку
    @Override
    public String toString() {
        // возвращаем данные, форматируем через String.format()
        return String.format("Product{name='%s', cost=%s, volume=%s, temperature=%s}",
            super.getName(), super.getPrice(), this.volume, this.temper);
    }

}
