package Model;

import java.util.List;

import Controller.iGetModel;

/**
 * Класс Model для передачи данных о студентах, имплементирует интерфейс
 * iGetModel
 */
public class Model implements iGetModel {
    private List<Student> students;

    /**
     * конструктор класса
     * 
     * @param students список студентов
     */
    public Model(List<Student> students) {
        this.students = students;
    }

    // определение метода, возвращающего список студентов
    public List<Student> getAllStudent() {
        return students;
    }

    // метод удаления студента по заданному id
    public int deleteStudentById(Long id) {
        int i = -1;
        for (Student pers : students) {
            if (pers.getStudentID() == id) {
                i = students.indexOf(pers);
            }
        }
        students.remove(i);
        return i;
    }
}
