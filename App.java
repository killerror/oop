import java.util.HashMap;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.ModelHash;
import Model.Student;
import View.ViewEn;

public class App {

   public static void main(String[] args) throws Exception {
      // список студентов
      Student s1 = new Student("Ivan", "Ivanov", 21, (long) 101);
      Student s2 = new Student("Petr", "Petrov", 22, (long) 111);
      Student s3 = new Student("Masha", "Mashina", 22, (long) 121);
      Student s4 = new Student("Igor", "Igorev", 23, (long) 301);
      Student s5 = new Student("Fedor", "Fedorov", 25, (long) 171);
      Student s6 = new Student("Irina", "Irinova", 23, (long) 104);

      HashMap<Long, Student> hashStudents = new HashMap<Long, Student>();
      hashStudents.put((long) 101, s1);
      hashStudents.put((long) 111, s2);
      hashStudents.put((long) 121, s3);
      hashStudents.put((long) 301, s4);
      hashStudents.put((long) 171, s5);
      hashStudents.put((long) 104, s6);

      // Модель для работы
      iGetModel model = new ModelHash(hashStudents);
      // Язык представления
      iGetView view = new ViewEn();
      // новый экземпляр
      Controller control = new Controller(view, model);
      control.run();

   }
}
