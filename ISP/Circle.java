/**
 * класс круга, использует интерфейс вычисления площади
 */
public class Circle implements iArea {
  // радиус
  private double radius;
  /**
   * конструктор круга
   * @param radius радиус
   */
  public Circle(double radius) {
    this.radius = radius;
  }
  /**
   * перегруженный метод вычисления площади
   */
  @Override
  public double area() {
    return 2 * 3.14 * radius;
  }
}