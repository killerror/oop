package StudentDomain;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    
    private List<StudentGroup> groups;

    public StudentStream(List<StudentGroup> groups) {
        this.groups = groups;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < groups.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) return null;
                return groups.get(count++);
            }
            
        };
    }

}
