package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/**
 * Класс ViewEn - вывод на английском языке, имплементирует
 * поведение из интерфейса
 * iGetView
 */
public class ViewEn implements iGetView {
    // определение метода вывода всех студентов в консоль
    public void printAllStudent(List<Student> students) {
        System.out.println("-----Output of the list of students-----");
        for (Student person : students) {
            System.out.println(person);
        }
        System.out.println("-----End of the list-----");
    }

    // выбор команды
    public String prompt() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the command from the list [LIST,EXIT, DELETE]:");
        return in.nextLine();
    }

    // запрос id удаляемого студента
    public Long getStudentIdToDelete() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the id of student for delete:");
        return (long) in.nextInt();
    }

}
