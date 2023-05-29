/*
 * фабрика логгеров
 */

package calculator;

public class LogCalculableFactory implements iCalculableFactory {
    private iLoggable logger;

    /**
     * конструктор фабрики логгера
     * @param logger логгер
     */
    public LogCalculableFactory(iLoggable logger) {
        this.logger = logger;
    }

    /**
     * перегрузка создания калькулятора
     */
    @Override
    public iCalculable create(ComplexNumber primaryArg) {
        return new LogCalculator(new ComplexCalculator(primaryArg), logger);
    }
}
