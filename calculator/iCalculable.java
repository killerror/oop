package calculator;

// интерфейс поведения калькулятора
public interface iCalculable {
    // сложение
    iCalculable sum(ComplexNumber arg);

    // умножение
    iCalculable multi(ComplexNumber arg);

    // деление
    iCalculable divide(ComplexNumber arg);

    // результат
    ComplexNumber getResult();
}
