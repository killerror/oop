package calculator;

/**
 * класс фабрики калькуляторов комплексных чисел, имплементирует поведение из
 * iCalculableFactory
 */
public class ComplexCalculableFactory implements iCalculableFactory {
    /**
     * перегрузка создания
     */
    @Override
    public iCalculable create(ComplexNumber primaryArg) {
        return new ComplexCalculator(primaryArg);
    }
}
