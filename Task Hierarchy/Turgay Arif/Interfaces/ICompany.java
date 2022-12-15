package Interfaces;

import Enums.DeptNames;
import Enums.Position;
import Objects.Employee;

public interface ICompany {

    void addEmployee(DeptNames departmentName, Position position, Employee employee);

    void addEmployee(DeptNames departmentName, Employee employee);

    void fireEmployee(Employee employee);

    void getEmployeesList();

    void getCompanyDetails();

}
