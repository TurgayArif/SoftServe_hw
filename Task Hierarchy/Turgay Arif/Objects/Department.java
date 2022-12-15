package Objects;

import Enums.DeptNames;

import java.time.LocalTime;


public abstract class Department {
    private DeptNames departmentName;
    private int departmentId;


    public Department(int id, DeptNames deptName) {
        this.departmentId = id;
        this.departmentName = deptName;
    }

    public abstract void callEmployee(Employee employees);


    public DeptNames getDepartmentName() {
        return departmentName;
    }

    public abstract void setMeeting(Employee employee, LocalTime time);
}
