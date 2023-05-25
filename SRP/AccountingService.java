/*
  бухгалтерия
*/
public class AccountingService{
  // налоговая ставка
  private double tax_rate;
  /**
   * конструктор класса
   * @param tax_rate
   */
  public AccountingService(double tax_rate) {
    this.tax_rate = tax_rate;
  }

  /***
   * расчет чистой зарплаты
   * @param baseSalary оклад сотрудника
   * @return
  */
  public int calculateNetSalary(int baseSalary) {
    int tax = (int) (baseSalary * 0.25);
    return baseSalary - tax;
  }
}