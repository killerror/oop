package calculator;

/**
 * класс калькулятора комплексных чисел, имплементирует поведение из интерфейса
 * iCalculable
 */
public final class ComplexCalculator implements iCalculable {
    // приватное поле - начальное значение калькулятора - первый аргемент для
    // вычисления
    private ComplexNumber primaryArg;

    // конструктор класса, принимает параметром первый аргемент для вычисления
    /**
     * конструктор калькулятора комплексных чисел
     * @param primaryArg
     */
    public ComplexCalculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    /**
     * перегруженное сложение
     */
    @Override
    public iCalculable sum(ComplexNumber arg) {
        primaryArg.realPart += arg.realPart;
        primaryArg.imaginaryPart += arg.imaginaryPart;
        return this;
    }

    /**
     * перегруженное умножение
     */
    @Override
    public iCalculable multi(ComplexNumber arg) {
        ComplexNumber resultMultiply = new ComplexNumber(0, 0);
        resultMultiply.realPart = primaryArg.realPart * arg.realPart - primaryArg.imaginaryPart * arg.imaginaryPart;
        resultMultiply.imaginaryPart = primaryArg.realPart * arg.imaginaryPart
                + primaryArg.imaginaryPart * arg.realPart;
        primaryArg.realPart = resultMultiply.realPart;
        primaryArg.imaginaryPart = resultMultiply.imaginaryPart;
        return this;
    }

    /**
     * перегруженное деление
     */
    @Override
    public iCalculable divide(ComplexNumber arg) {
        ComplexNumber resultMultiply = new ComplexNumber(0, 0);
        resultMultiply.realPart = (primaryArg.realPart * arg.realPart + primaryArg.imaginaryPart * arg.imaginaryPart)
                / (arg.realPart * arg.realPart + arg.imaginaryPart * arg.imaginaryPart);

        resultMultiply.imaginaryPart = (primaryArg.imaginaryPart * arg.realPart
                - primaryArg.realPart * arg.imaginaryPart)
                / (arg.realPart * arg.realPart + arg.imaginaryPart * arg.imaginaryPart);

        primaryArg.realPart = Math.round(resultMultiply.realPart * 100.0) / 100.0;
        primaryArg.imaginaryPart = Math.round(resultMultiply.imaginaryPart * 100.0) / 100.0;
        ;
        return this;
    }

    /**
     * перегруженное получение результата
     */
    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }

}
