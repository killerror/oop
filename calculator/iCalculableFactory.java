package calculator;
/**
 * интерфейс фабрики
 */
public interface iCalculableFactory {
    iCalculable create(ComplexNumber primaryArg);
}
