import java.util.ArrayList;

public class IT extends Department {
    private final String name = "IT";
    private Employees itEmployees;

    public IT(int id) {
        super(id);
    }

    @Override
    void callEmployee(Employees employees) {

    }

    @Override
    void addEmployee(Employees employee) {
        employeesList.add(employee);
        System.out.println("Welcome to the team " + this.name + ", " + employee.getFirstName() + "!");
    }

    @Override
    void removeEmployee(Employees employee) {

    }

    @Override
    void setMeeting(Employees employee) {

    }

    @Override
    void getEmployeesList() {
        for (Employees e : employeesList) {
            System.out.println(e.getEmployeeDetails());
        }
    }
}
