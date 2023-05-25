/*
  класс транспортного средства (ТС)
*/
public class Vehicle {
  // характеристики ТС
  int maxSpeed;
  String type;
  double ratio;
  /**
   * создание ТС
   * @param maxSpeed скорость
   * @param type тип
   * @param ratio коэффициент скорости
  */
  public Vehicle(int maxSpeed, String type, double ratio) {
    this.maxSpeed = maxSpeed;
    this.type = type;
    this.ratio = ratio;
  }
  /**
   * геттер максимальной скорости
   * @return максимальная скорость
  */
  public int getMaxSpeed() {
    return this.maxSpeed;
  }
  /**
   * геттер типа ТС
   * @return тип ТС
  */
  public String getType() {
    return this.type;
  }
  /**
   * геттер разрешенной скорости
   * @return разрешенная скорости
  */
  public double getAllowedSpeed(){
    return this.maxSpeed * this.ratio;
  }

}