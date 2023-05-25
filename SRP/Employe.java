/**
 * класс сотрудника
 * 
 */
public class Employee {
  // имя
  private String name;
  // дата рождения
  private Date dob;
  // оклад
  private int baseSalary;
  // бухгалтерия
  private AccountingService accountingService;

  /**
   * сотрудник
   * @param name имя
   * @param dob дата рождения
   * @param baseSalary оклад
   * @param accountingService бухгалтерия
   */
  public Employee(String name, Date dob, int baseSalary, AccountingService accountingService) {
    this.name = name;
    this.dob = dob;
    this.baseSalary = baseSalary;
    this.accountingService = accountingService;
  }
  /**
   * получение данных о сотруднике
   * @return
   */
  public String getEmpInfo() {
    return "name - " + name + " , dob - " + dob.toString();
  }

  /**
   * получение чистой зарплаты
   * @return
   */
  public String getNetSalary() {
    return accountingService.calculateNetSalary(this.baseSalary);
  }
}