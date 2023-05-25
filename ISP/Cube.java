/**
 * класс куба, использует интерфейсы вычисления площади и объёма
 */
public class Cube implements iArea,iVolume {
  // сторона
  private int edge;
  /**
   * конструктор куба
   * @param edge длина стороны
   */
  public Cube(int edge) {
    this.edge = edge;
  }

  /**
   * перегруженный метод вычисления площади
   */
  @Override
  public double area() {
    return 6 * edge * edge;
  }
  /**
   * перегруженный метод вычисления объёма
   */
  @Override
  public double volume() {
    return edge * edge * edge;
  }
}
