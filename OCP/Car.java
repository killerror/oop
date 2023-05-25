/*
  класс автомобиля
*/
public class Car extends Vehicle {
  /**
   * конструктор автомобиля
   * @param maxSpeed максимальная скорость
   */
  public Car(int maxSpeed) {
    super(maxSpeed, "Car", 0.8);
  }
}