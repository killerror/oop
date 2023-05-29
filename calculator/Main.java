package calculator;

// точка входа
public class Main {
    public static void main(String[] args) {
        // создание фабрики
        iCalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        // вью калькулятора
        ViewCalculator view = new ViewCalculator(calculableFactory);
        System.out.println("Калькулятор");
        view.run();
    }
}
