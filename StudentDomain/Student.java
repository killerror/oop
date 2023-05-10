package StudentDomain;

public class Student extends User implements Comparable<Student> {
    private long studentID;

    public Student(String firstname, String lastname, int age, long ID) {
        super(firstname, lastname, age);
        this.studentID = ID;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-3s %5s", super.lastName, super.firstName, super.age, this.studentID);
    }

    @Override
    public int compareTo(Student o) {
        if (this.age >  o.age) return  1;
        if (this.age <  o.age) return -1;
        return 0;
    }

    

}
