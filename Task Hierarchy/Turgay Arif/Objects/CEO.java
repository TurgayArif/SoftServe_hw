package Objects;

import Enums.DeptNames;

import java.time.LocalTime;

public class CEO extends Department {

    public CEO(int id) {
        setDepartmentId(id);
        setDepartmentName(DeptNames.CEO);
    }

    @Override
    public void callEmployee(Employee employees) {
        System.out.println("Hello " + employees.getFirstName() + "! " + " I'm calling from " + getDepartmentName() + "'s office!");
    }

    @Override
    public void setMeeting(Employee employee, LocalTime time) {
        callEmployee(employee);
        System.out.println(employee.getFirstName() + " come to my office at " + time + "!");
    }
}
