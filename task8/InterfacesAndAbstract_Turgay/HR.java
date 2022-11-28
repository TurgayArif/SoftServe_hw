public class HR extends Department {
    private final String name = "HR";

    public HR(int id) {
        super(id);
    }

    @Override
    void callEmployee(Employees employees) {
        System.out.println("Hello " + employees.getFirstName() + "! I'm calling from " + this.name + "!");
    }

    @Override
    void setMeeting(Employees employee) {
        callEmployee(employee);
        System.out.println("We need to talk!" + employee + " on ");
    }

    @Override
    void addEmployee(Employees employee) {
        employeesList.add(employee);
        System.out.println("Welcome to " + getCompanyName() + " " + employee.getFirstName() + "!");
    }

    @Override
    void removeEmployee(Employees employee) {
        employeesList.remove(employee);
    }

    @Override
    void getEmployeesList() {
        System.out.println(this.name + " Department employee list: ");
        for (Employees e : employeesList) {
            System.out.println(e.getEmployeeDetails());
        }
    }
}
