import java.util.Objects;
import java.util.UUID;

public class Student {
    private static final String SCHOOL = "RKG";
    private String name;
    private String uid;
    private Integer age;
    private static String nameAge = "name";

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.uid = UUID.randomUUID().toString();
    }

    public String getName() {
        return this.name;
    }

    public String getUid() {
        return this.uid;
    }

    public Integer getAge() {
        return this.age;
    }

    public String toString() {
        return "Student{name='" + this.name + "', uid='" + this.uid + "', age=" + this.age + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Student student = (Student)o;
            return Objects.equals(this.age, student.age);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.uid, this.age});
    }
}