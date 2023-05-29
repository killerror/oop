package calculator;
/**
 * класс комплексного числа
 */
public class ComplexNumber {
  public double realPart;
  public double imaginaryPart;
  /**
   * конструктор комплексного числа
   * @param realPart действительная часть
   * @param imaginaryPart мнимая часть
   */
  public ComplexNumber(double realPart, double imaginaryPart) {
    this.realPart = realPart;
    this.imaginaryPart = imaginaryPart;
  }

  /**
   * перегруженный вывод
   */
  @Override
  public String toString() {
    if (this.realPart == 0)
      return this.imaginaryPart + "i";
    if (this.imaginaryPart == 0)
      return this.realPart + "";
    if (this.imaginaryPart < 0)
      return this.realPart + "" + this.imaginaryPart + "i";
    return this.realPart + "+" + this.imaginaryPart + "i";
  }

}
