import java.util.HashMap;
import java.util.Map;

public class Student {
    private Map<String, String> students;

    public Student() {
        students = new HashMap<>();
    }


    public void addStudent(String firstName, String lastName) {
        students.put(firstName, lastName);
    }

    public void findStudent(String lastName) {
        for (Map.Entry<String, String> entry : students.entrySet()) {
            if (lastName.equalsIgnoreCase(entry.getValue())) {
                System.out.println(entry.getKey());
            }
        }
    }
}
