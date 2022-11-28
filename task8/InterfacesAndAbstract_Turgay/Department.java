import java.util.ArrayList;
import java.util.List;

public abstract class Department implements Company {
    String name;
    List<Employees> employeesList;
    int departmentId;

    public Department(int id) {
        this.departmentId = id;
        employeesList = new ArrayList<>();
    }

    abstract void callEmployee(Employees employees);
    abstract void addEmployee(Employees employee);
    abstract void removeEmployee(Employees employee);

    abstract void setMeeting(Employees employee);


    public String getName() {
        return this.name;
    }


    abstract void getEmployeesList();

    @Override
    public String getCompanyName() {
        return Company.name;
    }

}
