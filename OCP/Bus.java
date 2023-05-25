/*
  класс автобуса
*/
public class Bus extends Vehicle {
  /**
   * конструктор автобуса
   * @param maxSpeed максимальная скорость
   */
  public Bus(int maxSpeed) {
    super(maxSpeed, "Bus", 0.6);
  }
}