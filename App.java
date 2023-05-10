import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.GroupLayout.Group;

import StudentDomain.Student;
import StudentDomain.StudentGroup;
import StudentDomain.StudentStream;
import StudentDomain.User;

public class App {
    public static void main(String[] args) throws Exception {
        Student std1 = new Student("Ivan", "Ivanov", 26, 1101);
        Student std2 = new Student("Petr", "Petrov", 21, 1102);
        Student std3 = new Student("Fedor", "Fedorov", 22, 1103);
        Student std4 = new Student("Marina", "Marinova", 26, 1104);
        Student std5 = new Student("Masha", "Mashina", 21, 1105);
        Student std6 = new Student("Sveta", "Svetova", 22, 1106);

        List<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(std1);
        studentList1.add(std2);
        studentList1.add(std3);
        studentList1.add(std4);

        List<Student> studentList2 = new ArrayList<Student>();
        studentList2.add(std5);
        studentList2.add(std6);

        List<StudentGroup> studentGroupsList = new ArrayList<StudentGroup>();
        
        StudentGroup studentGroup1 = new StudentGroup(studentList1, "X-11");
        StudentGroup studentGroup2 = new StudentGroup(studentList2, "X-22");

        studentGroupsList.add(studentGroup1);
        studentGroupsList.add(studentGroup2);

        StudentStream studentStream = new StudentStream(studentGroupsList);
        Collections.sort(studentStream.getGroups());

        for (StudentGroup studentGroup : studentStream) {
            System.out.println("Group: " + studentGroup.getGroupName());
            System.out.println(String.format("%-10s %-10s %-3s %5s", "lastname", "firstname", "age", "ID"));
            System.out.println("-".repeat(31));
            for (Student student : studentGroup) {
                System.out.println(student.toString());
            }
            System.out.println();
        }

    }
}
