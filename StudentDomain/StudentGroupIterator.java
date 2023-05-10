package StudentDomain;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int count;
    private final List<Student> students;

    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < this.students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) return null;
        return this.students.get(this.count++);
    }
}
