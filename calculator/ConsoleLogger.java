/*
 * класс логгера
 */

package calculator;
// класс вывода логов в консоль
public class ConsoleLogger implements iLoggable {
    /**
     * перегрузка вывода логов
     */
    @Override
    public void log(String message) {
        System.out.println("LOG:" + message);
    }
}
