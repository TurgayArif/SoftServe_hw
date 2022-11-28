public class InterfacesAndAbstraction {
    public static void main(String[] args) {
        Department hr = new HR(1);
        Department it = new IT(2);

        Employees john = new Employees("John", "Doe", 20);
        Employees emily = new Employees("Emily", "Johnson", 25);

        john.makeMistake();
        john.makeMistake();
        john.makeMistake();
        john.goToWork();

        hr.callEmployee(john);
        hr.addEmployee(john);
        hr.addEmployee(emily);
        hr.getEmployeesList();
        hr.removeEmployee(emily);
        hr.getEmployeesList();
        it.addEmployee(emily);
        it.getEmployeesList();

    }
}