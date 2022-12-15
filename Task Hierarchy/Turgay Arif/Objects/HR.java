package Objects;

import Enums.DeptNames;

import java.time.LocalTime;

public class HR extends Department {

    public HR(int id) {
        setDepartmentId(id);
        setDepartmentName(DeptNames.HR);
    }

    @Override
    public void callEmployee(Employee employees) {
        System.out.println("Hello " + employees.getFirstName() + "! " + " I'm calling from " + getDepartmentName() + "'s office!");
    }


    @Override
    public void setMeeting(Employee employee, LocalTime time) {
        callEmployee(employee);
        System.out.println("We need to talk!" + employee + " at " + time);
    }
}
