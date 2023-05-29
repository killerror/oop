/*
 * класс вью калькулятора
 */

package calculator;

import java.util.Scanner;

public class ViewCalculator {
    // фабрика калькуляторов
    private iCalculableFactory calculableFactory;

    /**
     * конструктор вью калькулятора
     * @param calculableFactory фабрика калькулятора
     */
    public ViewCalculator(iCalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    /**
     * запуск 
     */
    public void run() {
        while (true) {
            // первый аргумент для вычислений
            ComplexNumber primaryArg = promptComplexNumber("Введите первый аргумент: ");
            // создание калькулятор
            iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                // выбор действия
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                // выбор умножения
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                // выбор сложения
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                // выбор деления
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.divide(arg);
                    continue;
                }
                // выбор результата
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.println("Результат: ");
                    System.out.println(result);
                    break;
                }
            }
            String cmd = prompt("Посчитать ещё раз (Y/N)?");
            if (cmd.toUpperCase().equals("Y")) {
                continue;
            }
            break;
        }

    }

    /**
     * запрос пользователю
     * @param message сообщение
     * @return ответ
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * вывод сообщения и получение комплексного числа
     * @param message сообщение
     * @return комплексное число
     */
    private ComplexNumber promptComplexNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        System.out.println("\nВведите действительную часть: ");
        double real = Float.parseFloat(in.nextLine());
        System.out.println("Введите мнимую часть: ");
        double imaginary = Float.parseFloat(in.nextLine());
        return new ComplexNumber(real, imaginary);
    }
}
