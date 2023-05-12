package Controller;

import java.util.ArrayList;
import java.util.List;

// import javax.jws.WebParam.Mode;

import Model.Student;

/**
 * Класс Controller - связующее звено View и Model
 */
public class Controller {
    private List<Student> students;
    private iGetView view;
    private iGetModel model;

    /**
     * конструктор
     * 
     * @param view  блок view, экземпляр класса, содержащего интерфейс iGetView
     * @param model блок model, экземпляр класса, содержащего интерфейс iGetMode
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    // метод получения всех студентов, получаем их из блока model
    public void getAllStudent() {
        students = model.getAllStudent();
    }

    /**
     * проверка данных
     * @return результат проверки
     */
    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * вывод списка на экран
     */
    public void updateView() {
        // MVP
        getAllStudent();
        if (testData()) {
            view.printAllStudent(students);
        } else {
            System.out.println("Список студентов пуст!");
        }

        // MVC
        // view.printAllStudent(model.getAllStudent());
    }

    /**
     * запуск интерактива
     */
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            // команда пользователя
            String command = view.prompt();
            try {
                com = Commands.valueOf(command.toUpperCase());

                // обработка команды
                switch (com) {
                    case EXIT:
                        getNewIteration = false;
                        System.out.println("bye");
                        break;
                    case LIST:
                        updateView();
                        break;
                    case DELETE:
                        Long id = view.getStudentIdToDelete();
                        int indexStudentToDelete = model.deleteStudentById(id);
                        if (indexStudentToDelete < 0) {
                            System.out.println("No such student.");
                        } else {
                            System.out.println("Student removed.");
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("wrong command");
            }

        }
    }

}
