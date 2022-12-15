package Objects;

import Enums.DeptNames;
import Enums.Position;
import Interfaces.ICompany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TechCompany implements ICompany {
    private final String name;
    private Map<DeptNames, Map<Position, List<Employee>>> employeeList;

    public TechCompany(String name) {
        this.name = name;
        employeeList = new HashMap<>();
    }

    @Override
    public void addEmployee(DeptNames departmentName, Position position, Employee employee) {
        if (!employeeList.containsKey(departmentName)) {
            employeeList.put(departmentName, new HashMap<>());
        }
        Map<Position, List<Employee>> emp = employeeList.get(departmentName);
        if (!emp.containsKey(position)) {
            emp.put(position, new ArrayList<>());
        }
        List<Employee> list = emp.get(position);
        list.add(employee);
    }

    @Override
    public void addEmployee(DeptNames departmentName, Employee employee) {
        if (!employeeList.containsKey(departmentName)) {
            employeeList.put(departmentName, new HashMap<>());
        }
        Map<Position, List<Employee>> emp = employeeList.get(departmentName);
        if (!emp.containsKey(employee.getPosition())) {
            emp.put(employee.getPosition(), new ArrayList<>());
        }
        List<Employee> list = emp.get(employee.getPosition());
        list.add(employee);
    }


    @Override
    public void fireEmployee(Employee employee) {
        if (employee.getPosition().equals(Position.CEO) && employee.getCountOfMistakes() == 2) {
            removeEmployee(employee);
        }
        if (employee.getCountOfMistakes() >= 3) {
            removeEmployee(employee);
        }
    }

    @Override
    public void getEmployeesList() {
        System.out.println(this.name + " employees list: ");
        for (Map.Entry<DeptNames, Map<Position, List<Employee>>> list : employeeList.entrySet()) {
            for (Map.Entry<Position, List<Employee>> empMap : list.getValue().entrySet()) {
                for (Employee e : empMap.getValue()) {
                    System.out.println(e.getEmployeeDetails() + "\nPosition: " +
                            empMap.getKey().toString() + "\nDepartment: " +
                            list.getKey().toString() + "\n====================");
                }
            }
        }
    }

    @Override
    public void getCompanyDetails() {
        System.out.printf("Company name: %s%n" + "Count of employees: %d%n",
                name, employeeList.values().stream().mapToInt(innerMap -> innerMap.values().stream().mapToInt(List::size).sum()).sum());
    }

    private void removeEmployee(Employee employee) {
        for (Map.Entry<DeptNames, Map<Position, List<Employee>>> entry : employeeList.entrySet()) {
            for (Map.Entry<Position, List<Employee>> e : entry.getValue().entrySet()) {
                var emp = e.getValue();
                emp.remove(employee);
            }
        }
        System.out.println(employee.getFirstName() + " you are fired!");
    }
}
