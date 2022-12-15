package Objects;

import Enums.DeptNames;

import java.time.LocalTime;


public abstract class Department {
    private DeptNames departmentName;
    private int departmentId;


    public void setDepartmentName(DeptNames departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public abstract void callEmployee(Employee employees);


    public DeptNames getDepartmentName() {
        return departmentName;
    }

    public abstract void setMeeting(Employee employee, LocalTime time);
}
