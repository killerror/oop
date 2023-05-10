package StudentDomain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private String name;
    private List<Student> students;

    public StudentGroup(List<Student> students, String name) {
        this.students = students;
        this.name = name;
    }

    public String getGroupName() {
        return this.name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this.students);
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (this.students.size() > o.getStudents().size()) return  1;
        if (this.students.size() < o.getStudents().size()) return -1;
        return 0;
    }
}
