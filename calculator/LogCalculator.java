package calculator;

// класс калькулятора с логированием
public class LogCalculator implements iCalculable {
    // приватные поля Декоратор - тип Калькулятор, и Логгер
    private iCalculable decorated;
    private iLoggable logger;

    /**
     * конструктор калькулятора с логгером
     * @param decorated калькулятор
     * @param logger логгер
     */
    public LogCalculator(iCalculable decorated, iLoggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    /**
     * переопределение сложения
     */
    @Override
    public iCalculable sum(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора " + firstArg + " Начало вызова метода sum с параметром " + arg);
        iCalculable result = decorated.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    /**
     * переопределение умножения
     */
    @Override
    public iCalculable multi(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора " + firstArg + " Начало вызова метода multi с параметром " + arg);
        iCalculable result = decorated.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    /**
     * переопределение деления
     */
    @Override
    public iCalculable divide(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора " + firstArg + " Начало вызова метода divide с параметром " + arg);
        iCalculable result = decorated.divide(arg);
        logger.log(String.format("Вызова метода divide произошел"));
        return result;
    }

    /**
     * переопределение вывода
     */
    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = decorated.getResult();
        logger.log("Получение результата = " + result);
        return result;
    }
}
