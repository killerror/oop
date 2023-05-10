package StudentDomain;

public class User {
    protected String firstName;
    protected String lastName;
    protected int age;

    public User(String firstname, String lastname, int age) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.age = age;
    }
    public void setName(String name) {
        this.firstName = name;
    }
    public String getName() {
        return this.firstName;
    }
    public void setLastname(String lastname) {
        this.lastName = lastname;
    }
    public String getLastname() {
        return this.lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    @Override
    public String toString() {
        return String.format("User: %s %s, age: %s", this.lastName, this.firstName, this.age);
    }
    
}
